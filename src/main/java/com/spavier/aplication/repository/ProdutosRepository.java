package com.spavier.aplication.repository;

import com.spavier.aplication.model.entity.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface ProdutosRepository extends JpaRepository<Produtos, Long> {
    List<Produtos> findAllById(Long produtos);
}
