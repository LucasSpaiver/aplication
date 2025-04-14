package com.spavier.aplication.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class Produtos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, length = 50)
    private String nome;
    @Column(nullable = false, length = 50)
    private String principioAtivo;
    @Column(nullable = false, length = 50)
    private String empresa;
    @Column(nullable = false, length = 50)
    private BigDecimal dose;
    @Column(nullable = false, length = 50)
    private String tipo;
    @ManyToOne
    @JoinColumn(name = "id_talhao")
    private Talhao talhao;
}
