package br.uniso;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class UnisoController {

    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    @PostMapping("criarAluno")
    public void criarAluno(@RequestBody Aluno aluno) {

    }

    @RequestMapping("hello")
    public String helloWorld(@RequestParam String nome, @RequestParam String idade) {
        return "Hello " + nome + " idade de " + idade;
    }

    @GetMapping("alunos")
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
}
