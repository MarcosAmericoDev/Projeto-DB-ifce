package com.example.locadora.repository;

import com.example.locadora.model.Aluguel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AluguelRepository extends JpaRepository <Aluguel, Long>{
}
