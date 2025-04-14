package com.spavier.aplication.controller;

import com.spavier.aplication.model.entity.Fazenda;
import com.spavier.aplication.service.FazendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/fazendas")
public class FazendaController {
    @Autowired
    private FazendaService fazendaService;

    @GetMapping
    public List<Fazenda> listar(){
        return fazendaService.listarTodas();
    }
    @PostMapping
    public Fazenda criar(@RequestBody Fazenda fazenda) {
        return fazendaService.salvar(fazenda);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Fazenda> buscar(@PathVariable Long id) {
        return fazendaService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        fazendaService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
