/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exer7;

/**
 *
 * Exercício 7: Estudante
Crie uma classe chamada Estudante com os atributos: nome, idade e lista de disciplinas matriculadas.
* Implemente um método para adicionar disciplinas à lista e outro para exibir as disciplinas matriculadas. 
* Crie um objeto Estudante, realize algumas matrículas e exiba a lista de disciplinas.
 */

    
import java.util.ArrayList;
import java.util.List;

public class Estudante {
    
    private String nome;
    private int idade;
    private List<String> disciplinasMatriculadas;

   
    public Estudante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.disciplinasMatriculadas = new ArrayList<>();
    }

   
    public void adicionarDisciplina(String disciplina) {
        disciplinasMatriculadas.add(disciplina);
    }

    
    public void exibirDisciplinas() {
        System.out.println("Disciplinas matriculadas por " + nome);
        for (String disciplina : disciplinasMatriculadas) {
            System.out.println(disciplina);
        }
    }

   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static void main(String[] args) {
       
        Estudante estudante = new Estudante("Pedro", 20);

    
        estudante.adicionarDisciplina("Matemática");
        estudante.adicionarDisciplina("Física");
        estudante.adicionarDisciplina("Química");

        
        estudante.exibirDisciplinas();
    }
}

