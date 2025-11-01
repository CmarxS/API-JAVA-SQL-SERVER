package br.com.fiap.service;

import br.com.fiap.entity.Usuario;
import br.com.fiap.repository.UsuarioRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UsuarioServiceTest {

    @Mock
    private UsuarioRepository repository;

    @InjectMocks
    private UsuarioService service;

    @Test
    void salvar_deveRetornarUsuarioSalvo() {
        Usuario toSave = new Usuario("João", "joao@example.com", "ADMIN", null, "Dev");
        Usuario saved = new Usuario("João", "joao@example.com", "ADMIN", null, "Dev");
        saved.setCodUsuario(1);

        when(repository.save(toSave)).thenReturn(saved);

        Usuario result = service.salvar(toSave);

        assertNotNull(result);
        assertEquals(1, result.getCodUsuario());
        assertEquals("João", result.getNomeUsuario());
        verify(repository, times(1)).save(toSave);
    }

    @Test
    void listarTodos_deveRetornarLista() {
        Usuario u = new Usuario("Ana", "ana@example.com", "USER", null, "Analista");
        u.setCodUsuario(2);
        when(repository.findAll()).thenReturn(List.of(u));

        List<Usuario> lista = service.listarTodos();

        assertNotNull(lista);
        assertEquals(1, lista.size());
        assertEquals(2, lista.get(0).getCodUsuario());
    }

    @Test
    void atualizar_quandoExistir_deveAtualizarCampos() {
        Usuario existente = new Usuario("Carlos", "carlos@old.com", "USER", null, "Suporte");
        existente.setCodUsuario(3);

        Usuario atualizado = new Usuario("Carlos Silva", "carlos@new.com", "ADMIN", null, "Lider");

        when(repository.findById(3)).thenReturn(Optional.of(existente));
        when(repository.save(any(Usuario.class))).thenAnswer(invocation -> invocation.getArgument(0));

        Usuario result = service.atualizar(3, atualizado);

        assertNotNull(result);
        assertEquals("Carlos Silva", result.getNomeUsuario());
        assertEquals("carlos@new.com", result.getEmail());
        assertEquals("ADMIN", result.getTipoAcesso());
    }

    @Test
    void atualizar_quandoNaoExistir_deveRetornarNull() {
        Usuario atualizado = new Usuario("Ninguém", "nao@existe.com", "USER", null, "Nada");

        when(repository.findById(99)).thenReturn(Optional.empty());

        Usuario result = service.atualizar(99, atualizado);

        assertNull(result);
        verify(repository, never()).save(any());
    }
}
