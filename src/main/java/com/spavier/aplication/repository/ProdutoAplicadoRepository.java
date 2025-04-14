package com.spavier.aplication.repository;


import com.spavier.aplication.model.entity.ProdutoAplicado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoAplicadoRepository extends JpaRepository<ProdutoAplicado, Long> {
}
