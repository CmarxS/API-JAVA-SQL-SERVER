package br.com.fiap.service;

import br.com.fiap.entity.Cidade;
import br.com.fiap.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CidadeService {
    @Autowired
    private CidadeRepository repository;

    public Cidade salvar(Cidade cidade) {
        return repository.save(cidade);
    }

    public List<Cidade> listarTodos() {
        return repository.findAll();
    }
    public Cidade atualizar(Integer id, Cidade cidadeAtualizada) {
        Cidade existente = repository.findById(id).orElse(null);
        if (existente != null) {
            existente.setCodCidade(cidadeAtualizada.getCodCidade());
            existente.setNomeCidade(cidadeAtualizada.getNomeCidade());
            existente.setEstado(cidadeAtualizada.getEstado());
            return repository.save(existente);
        }
        return null;
    }

    public void deletar(Integer id) {
        repository.deleteById(id);
    }

    public Optional<Cidade> listarPorId(Integer id) {
        return repository.findById(id);
    }
}
