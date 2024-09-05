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
public class SistemaUniversidade {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Dr. João");
        Disciplina disc1 = new Disciplina("Matemática", prof1);
        Disciplina disc2 = new Disciplina("Física", prof1);

        Estudante est1 = new Estudante("Alice", 12345);
        Estudante est2 = new Estudante("Bob", 67890);

        est1.matricularDisciplina(disc1);
        est1.matricularDisciplina(disc2);
        est2.matricularDisciplina(disc1);

        est1.adicionarNota(8.0);
        est1.adicionarNota(7.5);
        est2.adicionarNota(9.0);

        System.out.println("Média de " + est1.getNome() + ": " + est1.calcularMedia());
        System.out.println("Disciplinas do Professor " + prof1.getNome() + ":");
        for (Disciplina d : prof1.getDisciplinas()) {
            System.out.println(d.getNome());
        }
    }
}

