package br.com.fiap.controller;


import br.com.fiap.entity.LocalizacaoMoto;
import br.com.fiap.service.LocalizacaoMotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/localizacao-moto")
public class LocalizacaoMotoController {

    @Autowired
    private LocalizacaoMotoService localizacaoMotoService;

    @PostMapping
    public LocalizacaoMoto criar(@RequestBody LocalizacaoMoto localizacaoMoto) {
        return localizacaoMotoService.salvar(localizacaoMoto);
    }

    @GetMapping
    public List<LocalizacaoMoto> listar() {
        return localizacaoMotoService.listarTodos();
    }

    @GetMapping("/{id}")
    public LocalizacaoMoto listarPorId(@PathVariable Integer id) {
        return localizacaoMotoService.listarPorId(id).orElse(null);
    }

    @PutMapping("/{id}")
    public LocalizacaoMoto atualizar(@PathVariable Integer id, @RequestBody LocalizacaoMoto localizacaoMoto) {
        return localizacaoMotoService.atualizar(id, localizacaoMoto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id) {
        localizacaoMotoService.deletar(id);
    }
}
