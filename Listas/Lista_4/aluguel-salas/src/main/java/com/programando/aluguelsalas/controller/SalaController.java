package com.programando.aluguelsalas.controller;

import com.programando.aluguelsalas.model.Sala;
import com.programando.aluguelsalas.service.SalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salas")
public class SalaController {

    @Autowired
    private SalaService salaService;

    @GetMapping
    public List<Sala> getAll() {
        return salaService.getAll();
    }

    @PutMapping
    public String alugarSala(@RequestBody Sala sala){
        return salaService.alugarSala(sala);
    }
}
