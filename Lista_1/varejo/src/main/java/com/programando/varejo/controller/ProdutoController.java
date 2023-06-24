package com.programando.varejo.controller;

import com.programando.varejo.model.Produto;
import org.springframework.web.bind.annotation.*;

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
    public Produto getByCodigoDeBarras(@PathVariable int codigoDeBarras){
        for (Produto produto : produtos){
            if (produto.getCodigoDeBarras() == codigoDeBarras){
                return produto;
            }
        }
        return null;
    }

    @PostMapping
    public String save(@RequestBody Produto produto) {
        for (Produto products : produtos) {
            if (products.getCodigoDeBarras() == produto.getCodigoDeBarras()) {
                return "O produto já existe no estoque!";
            }
        }
        this.produtos.add(produto);
        return "O produto " + produto.getNome() + " foi adicionado ao estoque!";
    }
}
