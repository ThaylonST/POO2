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
// Projeto.java
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Projeto {
    private String nome;
    private List<Tarefa> tarefas;
    private Map<Desenvolvedor, List<Tarefa>> tarefasAtribuidas;

    public Projeto(String nome) {
        this.nome = nome;
        this.tarefas = new ArrayList<>();
        this.tarefasAtribuidas = new HashMap<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void atribuirTarefa(Desenvolvedor desenvolvedor, Tarefa tarefa) {
        tarefasAtribuidas.computeIfAbsent(desenvolvedor, k -> new ArrayList<>()).add(tarefa);
        desenvolvedor.adicionarTarefa(tarefa);
    }

    public int calcularCargaDeTrabalho() {
        int cargaTotal = 0;
        for (List<Tarefa> tarefas : tarefasAtribuidas.values()) {
            for (Tarefa tarefa : tarefas) {
                cargaTotal += tarefa.getTempoEstimado();
            }
        }
        return cargaTotal;
    }

    public List<Tarefa> listarTarefasDesenvolvedor(Desenvolvedor desenvolvedor) {
        return tarefasAtribuidas.getOrDefault(desenvolvedor, new ArrayList<>());
    }

    @Override
    public String toString() {
        return nome;
    }
}

