package com.programando.biblioteca.controller;

import com.programando.biblioteca.model.Livro;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

        private List<Livro> livros = new ArrayList<>();

        public LivroController(){
            livros.add(new Livro(1,"Ensaio sobre cequeira"));
            livros.add(new Livro(2,"Dom Casmurro"));
            livros.add(new Livro(3,"O Pequeno principe"));
            livros.add(new Livro(4,"Brida"));
            livros.add(new Livro(5,"Biblia sagrada"));
            livros.add(new Livro(6,"A menina que roubava livros"));
            livros.add(new Livro(7,"Um caminho para a Liberdade"));
            livros.add(new Livro(8,"A menina feita de espinhos"));
            livros.add(new Livro(9,"Aftas"));
            livros.add(new Livro(10,"Blade Runner"));


        }

    @GetMapping
    public List<Livro> getAll(){
            return livros;
    }

    @GetMapping("/{id}")
    public  Livro getById(@PathVariable int id){
            for (Livro livro : livros){
                if (livro.getId() == id){
                    return livro;
                }
            }
            return null;
    }

    @GetMapping("/livro")
    public Livro getByNome(@RequestHeader String nome){
        for (Livro livro : livros){
            if (livro.getNome().equalsIgnoreCase(nome)){
                return livro;
            }
        }
        return null;
    }

    @PostMapping
    public String cadastrarLivro(@RequestBody Livro livro){
            for (Livro livroAtual : livros){
                if(livroAtual.getId() == livro.getId()){
                    return "O livro já existe no acervo!";
                }
            }
            livros.add(livro);
            return "O livro foi adicionado ao acervo!";
    }

    @PutMapping
    public String atualizar(@RequestBody Livro livro){
            for (Livro livroDaLista : livros){
                if (livroDaLista.getId() == livro.getId()){
                    livroDaLista.setNome(livro.getNome());
                    return "O livro de id: " + livro.getId() + " teve o nome alterado para " + livro.getNome();
                }
            }
            return "O livro informado não existe";
    }

    @DeleteMapping("/{id}")
    public  String deletar(@PathVariable int id){
        for (Livro livro : livros){
            if (livro.getId() == id){
                String mensagem = "O livro foi removido com sucesso!";
                livros.remove(livro);
                return mensagem;
            }
        }
        return null;
    }
}
