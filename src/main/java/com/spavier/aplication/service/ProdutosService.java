package com.spavier.aplication.service;

import com.spavier.aplication.model.entity.Fazenda;
import com.spavier.aplication.model.entity.Produtos;
import com.spavier.aplication.repository.FazendaRepository;
import com.spavier.aplication.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProdutosService {
    @Autowired
    private ProdutosRepository produtosRepository;

    public List<Produtos> listarTodas() {
        return produtosRepository.findAll();
    }
    public Produtos salvar(Produtos produtos) {
        return produtosRepository.save(produtos);
    }
    public Optional<Produtos> buscarPorId(Long id){
        return produtosRepository.findById(id);
    }
    public void deletar(Long id) {
        produtosRepository.deleteById(id);
    }
}
