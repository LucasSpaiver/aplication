package com.spavier.aplication.controller;


import com.spavier.aplication.model.entity.Aplicacao;
import com.spavier.aplication.service.AplicacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/aplicacao")
public class AplicacaoController {
    @Autowired
    private AplicacaoService aplicacaoService;

    @GetMapping
    public List<Aplicacao> listar() {
        return aplicacaoService.listarTodas();
    }

    @PostMapping
    public Aplicacao criar(@RequestBody Aplicacao aplicacao) {
        return aplicacaoService.salvar(aplicacao);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Aplicacao> buscar(@PathVariable Long id) {
        return aplicacaoService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        aplicacaoService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
