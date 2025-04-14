package com.spavier.aplication.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class ProdutoAplicado {
    @Id
    @GeneratedValue (strategy =GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Produtos produto;
    @Column(precision = 10, scale = 3)
    private BigDecimal dose; // ex: 1.5 ml/ha
    @ManyToOne
    @JoinColumn(name = "aplicacao_id")
    private Aplicacao aplicacao;
}
