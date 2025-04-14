package com.spavier.aplication.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity
@Data
public class Fazenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, length = 50)
    private String nome;
    @Column(nullable = false, length = 4)
    private String codigo;

    @OneToMany(mappedBy = "fazenda", cascade = CascadeType.ALL)
    private List<Talhao> talhoes;


}
