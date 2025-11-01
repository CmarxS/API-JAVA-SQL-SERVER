package br.com.fiap.service;

import br.com.fiap.entity.MovimentoMoto;
import br.com.fiap.repository.MovimentoMotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovimentoMotoService {
    @Autowired
    private MovimentoMotoRepository repository;

    public MovimentoMoto salvar(MovimentoMoto movimentoMoto) {
        return repository.save(movimentoMoto);
    }

    public List<MovimentoMoto> listarTodos() {
        return repository.findAll();
    }

    public MovimentoMoto atualizar(Integer id, MovimentoMoto movimentoMotoAtualizado) {
        MovimentoMoto existente = repository.findById(id).orElse(null);
        if (existente != null) {
            existente.setCodMovimento(movimentoMotoAtualizado.getCodMovimento());
            existente.setMoto(movimentoMotoAtualizado.getMoto());
            existente.setFilial(movimentoMotoAtualizado.getFilial());
            existente.setTipoMovimento(movimentoMotoAtualizado.getTipoMovimento());
            existente.setDataMovimento(movimentoMotoAtualizado.getDataMovimento());
            existente.setManutencaoNecessaria(movimentoMotoAtualizado.getManutencaoNecessaria());
            return repository.save(existente);
        }
        return null;
    }

    public void deletar(Integer id) {
        repository.deleteById(id);
    }

    public Optional<MovimentoMoto> listarPorId(Integer id) {
        return repository.findById(id);
    }
}
