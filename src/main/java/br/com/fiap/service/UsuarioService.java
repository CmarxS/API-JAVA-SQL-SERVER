package br.com.fiap.service;

import br.com.fiap.entity.Usuario;
import br.com.fiap.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository repository;

    public Usuario salvar(Usuario usuario) {
        return repository.save(usuario);
    }

    public List<Usuario> listarTodos() {
        return repository.findAll();
    }

    public Usuario atualizar(Integer id, Usuario usuarioAtualizado) {
        Usuario existente = repository.findById(id).orElse(null);
        if (existente != null) {
            existente.setCodUsuario(usuarioAtualizado.getCodUsuario());
            existente.setNomeUsuario(usuarioAtualizado.getNomeUsuario());
            existente.setEmail(usuarioAtualizado.getEmail());
            existente.setTipoAcesso(usuarioAtualizado.getTipoAcesso());
            existente.setFilial(usuarioAtualizado.getFilial());
            existente.setFuncaoUsuario(usuarioAtualizado.getFuncaoUsuario());
            return repository.save(existente);
        }
        return null;
    }

    public void deletar(Integer id) {
        repository.deleteById(id);
    }

    public Optional<Usuario> listarPorId(Integer id) {
        return repository.findById(id);
    }
}
