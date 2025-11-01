package br.com.fiap.controller;


import br.com.fiap.entity.ManutencaoMoto;
import br.com.fiap.service.ManutencaoMotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/manutencao-moto")
public class ManutencaoMotoController {

    @Autowired
    private ManutencaoMotoService manutencaoMotoService;

    @PostMapping
    public ManutencaoMoto criar(@RequestBody ManutencaoMoto manutencaoMoto) {
        return manutencaoMotoService.salvar(manutencaoMoto);
    }

    @GetMapping
    public List<ManutencaoMoto> listar() {
        return manutencaoMotoService.listarTodos();
    }

    @GetMapping("/{id}")
    public ManutencaoMoto listarPorId(@PathVariable Integer id) {
        return manutencaoMotoService.listarPorId(id).orElse(null);
    }

    @PutMapping("/{id}")
    public ManutencaoMoto atualizar(@PathVariable Integer id, @RequestBody ManutencaoMoto manutencaoMoto) {
        return manutencaoMotoService.atualizar(id, manutencaoMoto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id) {
        manutencaoMotoService.deletar(id);
    }
}
