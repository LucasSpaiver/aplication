package com.spavier.aplication.repository;

import com.spavier.aplication.model.entity.Fazenda;
import com.spavier.aplication.model.entity.Talhao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FazendaRepository extends JpaRepository<Fazenda, Long> {
}
