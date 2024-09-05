/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaDeGerenciamentoDeEstudantes;

/**
 *
 * @author aluno.saolucas
 */
import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private Professor professor;
    private List<Estudante> estudantes;

    public Disciplina(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
        this.estudantes = new ArrayList<>();
        professor.adicionarDisciplina(this);
    }

    public void adicionarEstudante(Estudante estudante) {
        if (!estudantes.contains(estudante)) {
            estudantes.add(estudante);
        }
    }

    public String getNome() {
        return nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public List<Estudante> getEstudantes() {
        return estudantes;
    }
}
