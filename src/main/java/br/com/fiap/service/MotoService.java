package br.com.fiap.service;

import br.com.fiap.entity.Moto;
import br.com.fiap.repository.MotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MotoService {
    @Autowired
    private MotoRepository repository;

    public Moto salvar(Moto moto) {
        return repository.save(moto);
    }

    public List<Moto> listarTodos() {
        return repository.findAll();
    }

    public Optional<Moto> listarPorId(Integer id) {
        return repository.findById(id);
    }

    public Moto atualizar(Integer id, Moto motoAtualizada) {
        Moto existente = repository.findById(id).orElse(null);
        if (existente != null) {
            existente.setCodMoto(motoAtualizada.getCodMoto());
            existente.setModelo(motoAtualizada.getModelo());
            existente.setAnoFabricacao(motoAtualizada.getAnoFabricacao());
            existente.setCategoria(motoAtualizada.getCategoria());
            existente.setCliente(motoAtualizada.getCliente());
            existente.setPlaca(motoAtualizada.getPlaca());
            return repository.save(existente);
        }
        return null;
    }

    public void deletar(Integer id) {
        repository.deleteById(id);
    }
}
