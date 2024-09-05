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
public class Main {
    public static void main(String[] args) {
      
        Departamento ti = new Departamento("Tecnologia da Informação");
        Departamento rh = new Departamento("Recursos Humanos");

       
        Funcionario f1 = new Funcionario("João", 5000);
        Funcionario f2 = new Funcionario("Maria", 6000);
        Funcionario f3 = new Funcionario("Pedro", 4500);

        
        ti.adicionarFuncionario(f1);
        ti.adicionarFuncionario(f2);
        rh.adicionarFuncionario(f3);

      
        Projeto projetoA = new Projeto("Projeto A");
        Projeto projetoB = new Projeto("Projeto B");

       
        f1.adicionarProjeto(projetoA);
        f2.adicionarProjeto(projetoB);
        f3.adicionarProjeto(projetoA);
        f3.adicionarProjeto(projetoB);

        
        f1.exibirProjetos();
        f3.exibirProjetos();

       
        System.out.println("Média salarial do departamento de TI: " + ti.calcularMediaSalarial());
        System.out.println("Média salarial do departamento de RH: " + rh.calcularMediaSalarial());
    }
}

