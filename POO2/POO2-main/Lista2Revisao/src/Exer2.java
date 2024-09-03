/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * Crie um programa que receba uma frase do usuário e substitua todas as ocorrências da letra 'a' por '*'. 
 * Em seguida, imprima a frase modificada.
 */
public class Exer2 {
     public static void main(String[] args) {
    
         Scanner ler = new Scanner(System.in);
    
         System.out.println("Digite uma frase:");
         String frase = ler.nextLine();
         
         String fraseModificada = frase.replace("a", "*");
         
         System.out.println(fraseModificada);
         
         ler.close();
     }
}
