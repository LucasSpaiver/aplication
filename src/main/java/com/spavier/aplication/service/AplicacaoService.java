package com.spavier.aplication.service;

import com.spavier.aplication.model.entity.Aplicacao;
import com.spavier.aplication.repository.AplicacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AplicacaoService {
    @Autowired
    private AplicacaoRepository aplicacaoRepository;

    public List<Aplicacao> listarTodas() {
        return aplicacaoRepository.findAll();
    }
    public Aplicacao salvar(Aplicacao aplicacao){
        return aplicacaoRepository.save(aplicacao);
    }
    public Optional<Aplicacao> buscarPorId(Long id){
        return aplicacaoRepository.findById(id);
    }
    public void deletar(Long id){
        aplicacaoRepository.deleteById(id);
    }
}
