/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaDeBibliotecaVirtualAvançada;

/**
 *
 * @author aluno.saolucas
 */
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private List<Emprestimo> emprestimosAtuais;

    public Usuario(String nome) {
        this.nome = nome;
        this.emprestimosAtuais = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarEmprestimo(Emprestimo emprestimo) {
        emprestimosAtuais.add(emprestimo);
    }

    public void removerEmprestimo(Emprestimo emprestimo) {
        emprestimosAtuais.remove(emprestimo);
    }

    public List<Emprestimo> getEmprestimosAtuais() {
        return emprestimosAtuais;
    }
}

