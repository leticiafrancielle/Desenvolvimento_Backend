package com.example.http.controller;

import com.example.http.model.Jogador;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {

    private List<Jogador> jogadores = new ArrayList<>();

    public JogadorController(){
        jogadores.add(new Jogador(1,"Lebron James", 2.06, "Pivô"));
        jogadores.add(new Jogador(2, "Stephen Curry", 1.88, "Armador"));
        jogadores.add(new Jogador(3, "Anthony Davis", 2.08, "Pivô"));

    }

    @GetMapping
    public List<Jogador> getAll(){
        return jogadores;
    }

    @GetMapping("/{id}")
    public Jogador getById(@PathVariable int id){
        for (Jogador jogador : jogadores){
            if (jogador.getId() == id){
                return jogador;
            }
        }
            return null;
    }

    @PostMapping
    public String save(@RequestBody Jogador jogador){
        this.jogadores.add(jogador);
        return "O jogador " + jogador.getNome() + " foi cadastrado com sucesso!";
    }

}
