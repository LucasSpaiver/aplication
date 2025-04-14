package com.spavier.aplication.service;

import com.spavier.aplication.model.entity.Fazenda;
import com.spavier.aplication.model.entity.Talhao;
import com.spavier.aplication.repository.FazendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FazendaService {
    @Autowired
    private FazendaRepository fazendaRepository;

    public List<Fazenda> listarTodas() {
        return fazendaRepository.findAll();
    }
    public Fazenda salvar(Fazenda fazenda) {
        return fazendaRepository.save(fazenda);
    }
    public Optional<Fazenda> buscarPorId(Long id){
        return fazendaRepository.findById(id);
    }
    public void deletar(Long id) {
        fazendaRepository.deleteById(id);
    }


}
