package com.programando.varejo.controller;

import com.programando.varejo.model.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private List<Produto> produtos = new ArrayList<>();

    public ProdutoController(){
        produtos.add(new Produto(1234567, "Arroz", 15));
        produtos.add(new Produto(6789321, "Feijão", 15));
        produtos.add(new Produto(9876543, "Macarrão", 15));
    }

    @GetMapping
    public List<Produto> getAll(){
        return produtos;
    }

    @GetMapping("/{codigoDeBarras}")
    public Produto getAll(@PathVariable int codidoDeBarras){
        for (Produto produto : produtos){
            if (produto.getCodigoDeBarras() == codidoDeBarras){
                return produto;
            }
        }
        return null;
    }

    
}
