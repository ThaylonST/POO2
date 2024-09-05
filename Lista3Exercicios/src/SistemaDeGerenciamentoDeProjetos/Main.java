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
// Main.java
public class Main {
    public static void main(String[] args) {
       
        Projeto projeto1 = new Projeto("Projeto Alpha");
        
        
        Tarefa tarefa1 = new Tarefa("Desenvolver API", 20);
        Tarefa tarefa2 = new Tarefa("Design da interface", 15);
        Tarefa tarefa3 = new Tarefa("Testes unitários", 10);
        
       
        projeto1.adicionarTarefa(tarefa1);
        projeto1.adicionarTarefa(tarefa2);
        projeto1.adicionarTarefa(tarefa3);
        
        
        Desenvolvedor dev1 = new Desenvolvedor("Alice");
        Desenvolvedor dev2 = new Desenvolvedor("Bob");
        
       
        projeto1.atribuirTarefa(dev1, tarefa1);
        projeto1.atribuirTarefa(dev1, tarefa2);
        projeto1.atribuirTarefa(dev2, tarefa3);
        
        
        System.out.println("Carga de trabalho do projeto: " + projeto1.calcularCargaDeTrabalho() + " horas");
        
       
        System.out.println("Tarefas de Alice: " + dev1.getTarefas());
        System.out.println("Tarefas de Bob: " + dev2.getTarefas());
    }
}
