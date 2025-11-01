package br.com.fiap.controller;

import br.com.fiap.entity.Pais;
import br.com.fiap.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/paises")
public class PaisController {
    @Autowired
    private PaisService service;

    @PostMapping
    public Pais criar(@RequestBody Pais pais) {
        return service.salvar(pais);
    }

    @GetMapping
    public List<Pais> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Pais listarPorId(@PathVariable Integer id) {
        return service.listarPorId(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Pais atualizar(@PathVariable Integer id, @RequestBody Pais pais) {
        return service.atualizar(id, pais);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id) {
        service.deletar(id);
    }
}
