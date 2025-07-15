package com.example.locadora.model;

import java.sql.Date;

import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Cliente {

    @Id
    private Long id;


    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private VarcharJdbcType cpf;

    @Column(nullable = false)
    private Date data_nascimento;

}