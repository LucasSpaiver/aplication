package com.spavier.aplication.service;

import com.spavier.aplication.model.entity.Fazenda;
import com.spavier.aplication.model.entity.Talhao;
import com.spavier.aplication.repository.FazendaRepository;
import com.spavier.aplication.repository.TalhaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TalhaoService {
    @Autowired
    private TalhaoRepository talhaoRepository;

    public List<Talhao> listarTodas() {
        return talhaoRepository.findAll();
    }
    public Talhao salvar(Talhao talhao) {
        return talhaoRepository.save(talhao);
    }
    public Optional<Talhao> buscarPorId(Long id){
        return talhaoRepository.findById(id);
    }
    public void deletar(Long id) {
        talhaoRepository.deleteById(id);
    }
}
