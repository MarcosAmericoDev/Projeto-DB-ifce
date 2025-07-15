package com.example.locadora.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
public class Aluguel {

    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_filme", nullable = false)
    private Filme filme;


    @Column(nullable = false)
    private List<Filme> lista_filmes = new ArrayList<Filme>();

    @Column(nullable = false)
    private Date data_aluguel;

    @Column(nullable = false)
    private Date data_devolucao;

    @Column(nullable = false)
    private String status;

}