package com.spavier.aplication.controller;

import com.spavier.aplication.model.entity.ProdutoAplicado;
import com.spavier.aplication.service.ProdutoAplicadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/produtoAplicado")
public class ProdutoAplicadoController {
    @Autowired
    private ProdutoAplicadoService produtoAplicadoService;

    @GetMapping
    public List<ProdutoAplicado> listar(){
        return produtoAplicadoService.listarTodas();
    }
    @PostMapping
    public ProdutoAplicado criar(@RequestBody ProdutoAplicado produtoAplicado) {
        return produtoAplicadoService.salvar(produtoAplicado);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProdutoAplicado> buscar(@PathVariable Long id) {
        return produtoAplicadoService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        produtoAplicadoService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
