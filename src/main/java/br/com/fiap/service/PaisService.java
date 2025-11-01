package br.com.fiap.service;

import br.com.fiap.entity.Pais;
import br.com.fiap.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaisService {
    @Autowired
    private PaisRepository repository;

    public Pais salvar(Pais pais) {
        return repository.save(pais);
    }

    public List<Pais> listarTodos() {
        return repository.findAll();
    }

    public Pais atualizar(Integer id, Pais paisAtualizado) {
        Pais existente = repository.findById(id).orElse(null);
        if (existente != null) {
            existente.setCodPais(paisAtualizado.getCodPais());
            existente.setNomePais(paisAtualizado.getNomePais());
            return repository.save(existente);
        }
        return null;
    }

    public void deletar(Integer id) {
        repository.deleteById(id);
    }

    public Optional<Pais> listarPorId(Integer id) {
        return repository.findById(id);
    }
}
