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
// Tarefa.java
public class Tarefa {
    private String descricao;
    private int tempoEstimado; // em horas

    public Tarefa(String descricao, int tempoEstimado) {
        this.descricao = descricao;
        this.tempoEstimado = tempoEstimado;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getTempoEstimado() {
        return tempoEstimado;
    }

    @Override
    public String toString() {
        return descricao + " (" + tempoEstimado + " horas)";
    }
}

