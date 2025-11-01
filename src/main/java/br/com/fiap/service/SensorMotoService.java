package br.com.fiap.service;

import br.com.fiap.entity.SensorMoto;
import br.com.fiap.repository.SensorMotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SensorMotoService {
    @Autowired
    private SensorMotoRepository repository;

    public SensorMoto salvar(SensorMoto sensorMoto) {
        return repository.save(sensorMoto);
    }

    public List<SensorMoto> listarTodos() {
        return repository.findAll();
    }

    public SensorMoto atualizar(Integer id, SensorMoto sensorMotoAtualizado) {
        SensorMoto existente = repository.findById(id).orElse(null);
        if (existente != null) {
            existente.setCodSensor(sensorMotoAtualizado.getCodSensor());
            existente.setFilial(sensorMotoAtualizado.getFilial());
            existente.setTipoSensor(sensorMotoAtualizado.getTipoSensor());
            existente.setLocalInstalacao(sensorMotoAtualizado.getLocalInstalacao());
            existente.setMoto(sensorMotoAtualizado.getMoto());
            return repository.save(existente);
        }
        return null;
    }

    public void deletar(Integer id) {
        repository.deleteById(id);
    }

    public Optional<SensorMoto> listarPorId(Integer id) {
        return repository.findById(id);
    }
}
