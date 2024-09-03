/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * Desenvolva um programa que leia uma palavra do usuário e imprima essa palavra invertida.
 * Por exemplo, se o usuário digitar "Java", o programa deve imprimir "avaJ".
 */
public class Exer3 {
     public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
         System.out.println("digite uma palavra:");
         String palavra = ler.nextLine();
         
         
        String palavraInvertida = inverterPalavra(palavra);

        
        System.out.println("Palavra invertida: " + palavraInvertida);

       
        ler.close();
    }

    
    public static String inverterPalavra(String palavra) {
        StringBuilder sb = new StringBuilder(palavra);
        return sb.reverse().toString();
    }
}
         
     

