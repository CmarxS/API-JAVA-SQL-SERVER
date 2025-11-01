package br.com.fiap.controller;


import br.com.fiap.entity.Estado;
import br.com.fiap.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estados")
public class EstadoController {

    @Autowired
    private EstadoService estadoService;

    @PostMapping
    public Estado criar(@RequestBody Estado estado) {
        return estadoService.salvar(estado);
    }

    @GetMapping
    public List<Estado> listar() {
        return estadoService.listarTodos();
    }

    @GetMapping("/{id}")
    public Estado listarPorId(@PathVariable Integer id) {
        return estadoService.listarPorId(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Estado atualizar(@PathVariable Integer id, @RequestBody Estado estado) {
        return estadoService.atualizar(id, estado);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id) {
        estadoService.deletar(id);
    }
}
