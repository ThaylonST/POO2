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

public class Exer9 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Digite uma frase com possíveis espaços extras:");
        String frase = scanner.nextLine();

       
        String fraseFormatada = removerEspacosExtras(frase);
        System.out.println("Frase formatada: " + fraseFormatada);

      
        scanner.close();
    }

   
    public static String removerEspacosExtras(String frase) {
      
        return frase.trim().replaceAll("\\s+", " ");
    }
}

