package br.com.fiap.controller;


import br.com.fiap.entity.SensorMoto;
import br.com.fiap.service.SensorMotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sensor-moto")
public class SensorMotoController {

    @Autowired
    private SensorMotoService sensorMotoService;

    @PostMapping
    public SensorMoto criar(@RequestBody SensorMoto sensorMoto) {
        return sensorMotoService.salvar(sensorMoto);
    }

    @GetMapping
    public List<SensorMoto> listar() {
        return sensorMotoService.listarTodos();
    }

    @GetMapping("/{id}")
    public SensorMoto listarPorId(@PathVariable Integer id) {
        return sensorMotoService.listarPorId(id).orElse(null);
    }

    @PutMapping("/{id}")
    public SensorMoto atualizar(@PathVariable Integer id, @RequestBody SensorMoto sensorMoto) {
        return sensorMotoService.atualizar(id, sensorMoto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id) {
        sensorMotoService.deletar(id);
    }
}
