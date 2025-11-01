package br.com.fiap.controller;

import br.com.fiap.entity.Usuario;
import br.com.fiap.service.UsuarioService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.List;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(MockitoExtension.class)
class UsuarioControllerTest {

    private MockMvc mockMvc;

    private ObjectMapper objectMapper = new ObjectMapper();

    @Mock
    private UsuarioService usuarioService;

    @InjectMocks
    private UsuarioController usuarioController;

    @BeforeEach
    void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(usuarioController).build();
    }

    @Test
    void listar_deveRetornarLista() throws Exception {
        Usuario u = new Usuario("Ana", "ana@example.com", "USER", null, "Analista");
        u.setCodUsuario(2);

        when(usuarioService.listarTodos()).thenReturn(List.of(u));

        mockMvc.perform(get("/usuarios").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].codUsuario").value(2))
                .andExpect(jsonPath("$[0].nomeUsuario").value("Ana"));
    }

    @Test
    void criar_deveRetornarObjetoSalvo() throws Exception {
        Usuario toSave = new Usuario("João", "joao@example.com", "ADMIN", null, "Dev");
        Usuario saved = new Usuario("João", "joao@example.com", "ADMIN", null, "Dev");
        saved.setCodUsuario(1);

        when(usuarioService.salvar(any(Usuario.class))).thenReturn(saved);

        mockMvc.perform(post("/usuarios")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(toSave)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.codUsuario").value(1))
                .andExpect(jsonPath("$.email").value("joao@example.com"));

        verify(usuarioService, times(1)).salvar(any(Usuario.class));
    }

    @Test
    void listarPorId_quandoExistir_deveRetornarObjeto() throws Exception {
        Usuario u = new Usuario("Carlos", "carlos@example.com", "USER", null, "Suporte");
        u.setCodUsuario(3);

        when(usuarioService.listarPorId(3)).thenReturn(Optional.of(u));

        mockMvc.perform(get("/usuarios/3").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.codUsuario").value(3))
                .andExpect(jsonPath("$.nomeUsuario").value("Carlos"));
    }
}
