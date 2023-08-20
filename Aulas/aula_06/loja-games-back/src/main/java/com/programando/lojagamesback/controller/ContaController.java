package com.programando.lojagamesback.controller;

import com.programando.lojagamesback.model.Conta;
import com.programando.lojagamesback.repository.ContaRepository;
import com.programando.lojagamesback.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contas")
@CrossOrigin("*")
public class ContaController {

    @Autowired
    private ContaService contaService;

    @GetMapping
    public ResponseEntity<List<Conta>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(contaService.getAll());
    }

    @PostMapping
    public ResponseEntity<Conta> save(@RequestBody Conta conta){
        return ResponseEntity.status(HttpStatus.OK).body(contaService.save(conta));
    }
}
