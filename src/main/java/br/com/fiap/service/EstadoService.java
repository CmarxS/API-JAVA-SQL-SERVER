package br.com.fiap.service;

import br.com.fiap.entity.Estado;
import br.com.fiap.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoService {
    @Autowired
    private EstadoRepository repository;

    public Estado salvar(Estado estado) {
        return repository.save(estado);
    }

    public List<Estado> listarTodos() {
        return repository.findAll();
    }

    public Estado atualizar(Integer id, Estado estadoAtualizado) {
        Estado existente = repository.findById(id).orElse(null);
        if (existente != null) {
            existente.setCodEstado(estadoAtualizado.getCodEstado());
            existente.setNomeEstado(estadoAtualizado.getNomeEstado());
            existente.setPais(estadoAtualizado.getPais());
            return repository.save(existente);
        }
        return null;
    }

    public void deletar(Integer id) {
        repository.deleteById(id);
    }

    public Optional<Estado> listarPorId(Integer id) {
        return repository.findById(id);
    }
}
