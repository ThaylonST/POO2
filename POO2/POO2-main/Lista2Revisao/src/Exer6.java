/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno.saolucas
 */
import java.util.Scanner;

public class Exer6 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Digite seu nome completo:");
        String nomeCompleto = scanner.nextLine();

        
        String nomeFormatado = capitalizarNomes(nomeCompleto);

        
        System.out.println("Nome formatado: " + nomeFormatado);

      
        scanner.close();
    }

   
    public static String capitalizarNomes(String nomeCompleto) {
      
        String[] palavras = nomeCompleto.split("\\s+");

      
        StringBuilder nomeFormatado = new StringBuilder();

       
        for (String palavra : palavras) {
            if (!palavra.isEmpty()) {
               
                String palavraCapitalizada = palavra.substring(0, 1).toUpperCase() + palavra.substring(1).toLowerCase();
             
                nomeFormatado.append(palavraCapitalizada).append(" ");
            }
        }

       
        return nomeFormatado.toString().trim();
    }
}
