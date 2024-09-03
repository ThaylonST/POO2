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

public class Exer10 {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Digite uma palavra:");
        String palavra = scanner.nextLine();

        
        int[] contagem = contarVogaisConsoantes(palavra);
        int numeroVogais = contagem[0];
        int numeroConsoantes = contagem[1];

       
        System.out.println("Número de vogais: " + numeroVogais);
        System.out.println("Número de consoantes: " + numeroConsoantes);

        
        scanner.close();
    }

    //
    public static int[] contarVogaisConsoantes(String palavra) {
        
        int vogais = 0;
        int consoantes = 0;

       
        String vogaisString = "aeiouAEIOU";

        
        for (char c : palavra.toCharArray()) {
            if (Character.isLetter(c)) {
                if (vogaisString.indexOf(c) != -1) {
                   
                    vogais++;
                } else {
                    //
                    consoantes++;
                }
            }
        }

       
        return new int[] { vogais, consoantes };
    }
}
