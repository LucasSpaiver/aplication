package com.spavier.aplication.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Talhao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 50)
    private String nome;
    @Column( length = 50)
    private double tamanho;
    @ManyToOne
    @JoinColumn(name = "fazenda_id")
    private Fazenda fazenda;
    @OneToMany(mappedBy = "talhao", cascade = CascadeType.ALL)
    private List<Aplicacao> aplicacoes;

}
