package br.com.fiap.controller;


import br.com.fiap.entity.MovimentoMoto;
import br.com.fiap.service.MovimentoMotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movimentacao-moto")
public class MovimentoMotoController {

    @Autowired
    private MovimentoMotoService movimentacaoMotoService;

    @PostMapping
    public MovimentoMoto criar(@RequestBody MovimentoMoto movimentoMoto) {
        return movimentacaoMotoService.salvar(movimentoMoto);
    }

    @GetMapping
    public List<MovimentoMoto> listar() {
        return movimentacaoMotoService.listarTodos();
    }

    @GetMapping("/{id}")
    public MovimentoMoto listarPorId(@PathVariable Integer id) {
        return movimentacaoMotoService.listarPorId(id).orElse(null);
    }

    @PutMapping("/{id}")
    public MovimentoMoto atualizar(@PathVariable Integer id, @RequestBody MovimentoMoto movimentoMoto) {
        return movimentacaoMotoService.atualizar(id, movimentoMoto);
    }

    @DeleteMapping("/{id}")

    public void deletar(@PathVariable Integer id) {
        movimentacaoMotoService.deletar(id);
    }

}
