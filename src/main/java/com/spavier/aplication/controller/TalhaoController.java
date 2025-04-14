package com.spavier.aplication.controller;

import com.spavier.aplication.model.entity.Fazenda;
import com.spavier.aplication.model.entity.Talhao;
import com.spavier.aplication.repository.TalhaoRepository;
import com.spavier.aplication.service.FazendaService;
import com.spavier.aplication.service.TalhaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/talhao")
public class TalhaoController {
    @Autowired
    private TalhaoService talhaoService;

    @GetMapping
    public List<Talhao> listar(){
        return talhaoService.listarTodas();
    }
    @PostMapping
    public Talhao criar(@RequestBody Talhao talhao) {
        return talhaoService.salvar(talhao);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Talhao> buscar(@PathVariable Long id) {
        return talhaoService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/talhao/fazenda/{fazendaId}")
    public ResponseEntity<List<Talhao>> listarPorFazenda(@PathVariable Long fazendaId) {
        List<Talhao> talhoes = talhaoService.listarPorFazenda(fazendaId);
        return ResponseEntity.ok(talhoes);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        talhaoService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
