/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaDeGerenciamentoDeFuncionarios;

/**
 *
 * @author aluno.saolucas
 */
import java.util.ArrayList;
import java.util.List;

public class Funcionario {
    private String nome;
    private double salario;
    private Departamento departamento;
    private List<Projeto> projetos;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        this.projetos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public void adicionarProjeto(Projeto projeto) {
        projetos.add(projeto);
        projeto.adicionarFuncionario(this);
    }

    public List<Projeto> getProjetos() {
        return projetos;
    }

    public void exibirProjetos() {
        if (projetos.isEmpty()) {
            System.out.println(nome + " não está alocado em nenhum projeto.");
        } else {
            System.out.println("Projetos de " + nome + ":");
            for (Projeto projeto : projetos) {
                System.out.println("- " + projeto.getNome());
            }
        }
    }
}
