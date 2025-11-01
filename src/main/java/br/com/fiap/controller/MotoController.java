package br.com.fiap.controller;


import br.com.fiap.entity.Moto;
import br.com.fiap.service.MotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/motos")
public class MotoController {

    @Autowired
    private MotoService motoService;

    @PostMapping
    public Moto criar(@RequestBody Moto moto) {
        return motoService.salvar(moto);
    }

    @GetMapping
    public List<Moto> listar() {
        return motoService.listarTodos();
    }

    @GetMapping("/{id}")
    public Moto listarPorId(@PathVariable Integer id) {
        return motoService.listarPorId(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Moto atualizar(@PathVariable Integer id, @RequestBody Moto moto) {
        return motoService.atualizar(id, moto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id) {
        motoService.deletar(id);
    }

}
