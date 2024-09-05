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

public class Departamento {
    private String nome;
    private List<Funcionario> funcionarios;

    public Departamento(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
        funcionario.setDepartamento(this);
    }

    public double calcularMediaSalarial() {
        if (funcionarios.isEmpty()) return 0;
        double totalSalario = 0;
        for (Funcionario funcionario : funcionarios) {
            totalSalario += funcionario.getSalario();
        }
        return totalSalario / funcionarios.size();
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }
}
