package com.spavier.aplication.repository;

import com.spavier.aplication.model.entity.Aplicacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AplicacaoRepository  extends JpaRepository<Aplicacao, Long> {
    List<Aplicacao> findByTalhaoId(Long talhaoId);
}
