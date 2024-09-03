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

public class Exer5 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Digite uma frase:");
        String frase = scanner.nextLine();

        
        String[] palavras = frase.split("\\s+"); 

       
        int numeroDePalavras = palavras.length;

        
        System.out.println("Número de palavras: " + numeroDePalavras);

        
        scanner.close();
    }
}
