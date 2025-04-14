package com.spavier.aplication.controller;


import com.spavier.aplication.model.entity.Produtos;

import com.spavier.aplication.service.ProdutosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/produtos")
public class ProdutosController {
    @Autowired
    private ProdutosService produtosService;

    @GetMapping
    public List<Produtos> listar(){
        return produtosService.listarTodas();
    }
    @PostMapping
    public Produtos criar(@RequestBody Produtos produtos) {
        return produtosService.salvar(produtos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produtos> buscar(@PathVariable Long id) {
        return produtosService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        produtosService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
