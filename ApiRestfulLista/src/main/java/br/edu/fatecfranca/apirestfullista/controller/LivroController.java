package br.edu.fatecfranca.apirestfullista.controller;

import br.edu.fatecfranca.apirestfullista.model.Livro;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;


@RestController  // indica que a classe recebe e responde requisição REST
@RequestMapping("/livro") // recebe e responde o endpoint /livro
public class LivroController {
    // endpoint http://localhost:8080/livro

    // banco de dados em memória
    List<Livro> livros = new ArrayList<>();

    @GetMapping // método responde requisição GET
    public List<Livro> getLivros(){
        return this.livros; //retorna o vetor com os livros
    }

//    @GetMapping // método responde requisição GET
//    public String getLivros(){
//          return "Livros Cadastrados";
//    }

    @PostMapping // método responde requisição POST
    public Livro addLivro(@RequestBody Livro livro){
        //return "Livro cadastrado com sucesso";
        this.livros.add(livro); // adiciona o livro no vetor
        return livro;
    }
}