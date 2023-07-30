package com.programando.lojagamesback.service;

import com.programando.lojagamesback.model.Jogo;
import com.programando.lojagamesback.repository.BancoDeDados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogoService {

    @Autowired
    private BancoDeDados bancoDeDados;

    public List<Jogo> getAll() {
        return bancoDeDados.findAll();
    }

    public Jogo save(Jogo jogo) {
        return bancoDeDados.save(jogo);
    }

}
