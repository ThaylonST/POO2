/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaDeGerenciamentoDeProjetos;

/**
 *
 * @author aluno.saolucas
 */
// Desenvolvedor.java
import java.util.ArrayList;
import java.util.List;

public class Desenvolvedor {
    private String nome;
    private List<Tarefa> tarefas;

    public Desenvolvedor(String nome) {
        this.nome = nome;
        this.tarefas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public int calcularCargaDeTrabalho() {
        int carga = 0;
        for (Tarefa tarefa : tarefas) {
            carga += tarefa.getTempoEstimado();
        }
        return carga;
    }

    @Override
    public String toString() {
        return nome;
    }
}
