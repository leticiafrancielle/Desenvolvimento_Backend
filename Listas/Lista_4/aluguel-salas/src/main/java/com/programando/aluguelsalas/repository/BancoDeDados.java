package com.programando.aluguelsalas.repository;

import com.programando.aluguelsalas.model.Sala;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BancoDeDados {

    List<Sala> salas = new ArrayList<>();

    public BancoDeDados(){
        salas.add(new Sala(1, false,null));
        salas.add(new Sala(2, false,null));
        salas.add(new Sala(3, false,null));
        salas.add(new Sala(4, false,null));
        salas.add(new Sala(5, false,null));
        salas.add(new Sala(6, false,null));
        salas.add(new Sala(7, false,null));
        salas.add(new Sala(8, false,null));
    }

    public List<Sala> findAll(){
        return salas;
    }

    public String update(Sala sala){
        for (Sala salaAtual : salas) {
            if (salaAtual.getId() == sala.getId() && !salaAtual.getEstaAlugada()) {
                salaAtual.setEstaAlugada(sala.getEstaAlugada());
                salaAtual.setNomeLocatario(sala.getNomeLocatario());
                return "Sala alugada com sucesso!!";
            }
        }
        return "Esta sala já está alugada";
    }
}