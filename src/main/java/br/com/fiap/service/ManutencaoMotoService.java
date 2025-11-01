package br.com.fiap.service;

import br.com.fiap.entity.ManutencaoMoto;
import br.com.fiap.repository.ManutencaoMotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ManutencaoMotoService {
    @Autowired
    private ManutencaoMotoRepository repository;

    public ManutencaoMoto salvar(ManutencaoMoto manutencaoMoto) {
        return repository.save(manutencaoMoto);
    }

    public List<ManutencaoMoto> listarTodos() {
        return repository.findAll();
    }

    public ManutencaoMoto atualizar(Integer id, ManutencaoMoto manutencaoMotoAtualizada) {
        ManutencaoMoto existente = repository.findById(id).orElse(null);
        if (existente != null) {
            existente.setCodManutencao(manutencaoMotoAtualizada.getCodManutencao());
            existente.setMoto(manutencaoMotoAtualizada.getMoto());
            existente.setTipoManutencao(manutencaoMotoAtualizada.getTipoManutencao());
            existente.setDataManutencao(manutencaoMotoAtualizada.getDataManutencao());
            return repository.save(existente);
        }
        return null;
    }

    public void deletar(Integer id) {
        repository.deleteById(id);
    }

    public Optional<ManutencaoMoto> listarPorId(Integer id) {
        return repository.findById(id);
    }
}
