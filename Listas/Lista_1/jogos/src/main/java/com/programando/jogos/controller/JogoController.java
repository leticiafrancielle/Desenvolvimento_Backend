package com.programando.jogos.controller;

import com.programando.jogos.model.Jogo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/jogos")
public class JogoController {

    private List<Jogo> jogos = new ArrayList<>();

    public JogoController(){

        jogos.add(new Jogo(1,"The Last of Us", 100.00));
        jogos.add(new Jogo(2,"Assassin's Creed", 105.00));
        jogos.add(new Jogo(3,"Spider-Man", 179));
        jogos.add(new Jogo(4,"The Legend of Zelda", 149));

    }

    @GetMapping
    public List<Jogo> getAll(){
        return jogos;
    }

    @GetMapping("/{id}")
    public Jogo getById(@PathVariable int id){
        for (Jogo jogo : jogos){
            if (jogo.getId() == id){
                return jogo;
            }
        }
        return null;
    }

    @GetMapping("/jogo")
    public Jogo getByNome(@RequestHeader String nome){
        for (Jogo jogo : jogos){
            if (jogo.getNome().equalsIgnoreCase(nome)){
                return jogo;
            }
        }
        return null;
    }

    @GetMapping("/menor-preco")
    public Jogo getByMenorPrecoJogo(){
        double menorPreco = 0;
        int index = 0;
        for (int i = 0; i < jogos.size(); i ++){
            if (jogos.get(i).getPreco() < menorPreco){
                menorPreco = jogos.get(i).getPreco();
                index = i;

            }
        }
        return jogos.get(index);
    }

    @PostMapping
    public String cadastrarJogo(@RequestBody Jogo jogo){
        for (Jogo jogoAtual : jogos){
            if(jogoAtual .getId() == jogo.getId()){
                return "O jogo já existe!";
            }
        }
        jogos.add(jogo);
        return "O jogo " + jogo.getNome() + " foi adicionado com sucesso!";
    }

}
