package br.com.fiap.service;

import br.com.fiap.entity.Filial;
import br.com.fiap.repository.FilialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilialService {
    @Autowired
    private FilialRepository repository;

    public Filial salvar(Filial filial) {
        return repository.save(filial);
    }

    public List<Filial> listarTodos() {
        return repository.findAll();
    }

    public Filial atualizar(Integer id, Filial filialAtualizada) {
        Filial existente = repository.findById(id).orElse(null);
        if (existente != null) {
            existente.setCodFilial(filialAtualizada.getCodFilial());
            existente.setNomeFilial(filialAtualizada.getNomeFilial());
            existente.setCidade(filialAtualizada.getCidade());
            existente.setTamanhoPatio(filialAtualizada.getTamanhoPatio());
            return repository.save(existente);
        }
        return null;
    }

    public void deletar(Integer id) {
        repository.deleteById(id);
    }

    public Optional<Filial> listarPorId(Integer id) {
        return repository.findById(id);
    }
}
