package com.spavier.aplication.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class Aplicacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Data", nullable = false)
    private LocalDate dataAplicacao;
    @ManyToMany
    @JoinTable(
            name = "aplicacao_talhao",
            joinColumns = @JoinColumn(name = "aplicacao_id"),
            inverseJoinColumns = @JoinColumn(name = "talhao_id")
    )

    private List<Talhao> talhao; // ou lista de talhões, se a aplicação abranger vários
    @OneToMany(mappedBy = "aplicacao", cascade = CascadeType.ALL)
    private List<ProdutoAplicado> produtos;
    @Column(nullable = false, length = 50)
    private String tipoAplicacao; // ex: aérea, tratorizada
}
