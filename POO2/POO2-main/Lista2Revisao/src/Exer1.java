/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * Escreva um programa que solicite ao usuário que digite uma palavra. 
 * Em seguida, conte e imprima quantas letras a palavra possui.
 */

public class Exer1 {
     public static void main(String[] args) {
         
    Scanner ler = new Scanner(System.in);
     System.out.print("Digite uma palavra: ");
     String palavra = ler.nextLine();
     
     int numeroDeLetras = palavra.length();
     
         System.out.println("a palavra," + palavra + " possui " + numeroDeLetras + " letras");
     
         ler.close();
     }
}
