/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaDeGerenciamentoDeFuncionários;

import javax.swing.JOptionPane;

/**
 *
 * @author tayl9
 */
public class FuncionarioDAO {
    
    public void imprimirFuncionario(FuncionarioDTO funcionario1){
        
        String nome = funcionario1.getNome();
         String cargo = funcionario1.getCargo();
          Double salario = funcionario1.getSalario();

          JOptionPane.showMessageDialog(null,nome + cargo + salario);
        
    }
    
}
