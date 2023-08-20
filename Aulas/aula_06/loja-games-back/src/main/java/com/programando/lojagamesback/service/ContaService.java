package com.programando.lojagamesback.service;


import com.programando.lojagamesback.model.Conta;
import com.programando.lojagamesback.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContaService {

    @Autowired
    private ContaRepository contaRepository;

    public List<Conta> getAll(){
        return contaRepository.findAll();
    }

    public Conta save(Conta conta){
        return contaRepository.save(conta);
    }
}
