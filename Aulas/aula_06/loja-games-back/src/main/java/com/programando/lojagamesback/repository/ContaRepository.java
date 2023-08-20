package com.programando.lojagamesback.repository;

import com.programando.lojagamesback.model.Conta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaRepository extends JpaRepository<Conta, Integer> {
}
