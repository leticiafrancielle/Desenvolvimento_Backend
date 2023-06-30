package com.programando.jogos.controller;

import com.programando.jogos.model.Jogo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/jogos")
public class JogoController {

    private List<Jogo> jogos = new ArrayList<>();

    public JogoController(){

    }
}
