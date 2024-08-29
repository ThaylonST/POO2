/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista1;

/**
 *
 * @author aluno.saolucas
 */
public class Exer4 {
    
   
    public static void main(String[] args) {
        
        String frase = "Esta é uma frase de exemplo para exercício.";

       
        int tamanho = frase.length();
        System.out.println("Tamanho da frase: " + tamanho);

        
        String fraseMaiusculas = frase.toUpperCase();
        System.out.println("Frase em maiúsculas: " + fraseMaiusculas);

        
        String fraseMinusculas = frase.toLowerCase();
        System.out.println("Frase em minúsculas: " + fraseMinusculas);

       
        String substring = frase.substring(10, 25);
        System.out.println("Substring extraída: " + substring);
    }
}

   
    


    

