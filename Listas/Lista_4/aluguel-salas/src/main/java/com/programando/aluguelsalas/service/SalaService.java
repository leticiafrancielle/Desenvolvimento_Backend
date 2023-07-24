package com.programando.aluguelsalas.service;

import com.programando.aluguelsalas.model.Sala;
import com.programando.aluguelsalas.repository.BancoDeDados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaService {

    @Autowired
    private BancoDeDados bancoDeDados;

    public List<Sala> getAll(){
        return bancoDeDados.findAll();
    }

    public String alugarSala(Sala sala){
        return bancoDeDados.update(sala);
    }
}
