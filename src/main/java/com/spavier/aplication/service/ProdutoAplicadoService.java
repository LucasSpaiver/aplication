package com.spavier.aplication.service;

import com.spavier.aplication.model.entity.Fazenda;
import com.spavier.aplication.model.entity.ProdutoAplicado;
import com.spavier.aplication.repository.FazendaRepository;
import com.spavier.aplication.repository.ProdutoAplicadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoAplicadoService {
    @Autowired
    private ProdutoAplicadoRepository produtoAplicadoRepository;

    public List<ProdutoAplicado> listarTodas() {
        return produtoAplicadoRepository.findAll();
    }
    public ProdutoAplicado salvar(ProdutoAplicado produtoAplicado) {
        return produtoAplicadoRepository.save(produtoAplicado);
    }
    public Optional<ProdutoAplicado> buscarPorId(Long id){
        return produtoAplicadoRepository.findById(id);
    }
    public void deletar(Long id) {
        produtoAplicadoRepository.deleteById(id);
    }
}
