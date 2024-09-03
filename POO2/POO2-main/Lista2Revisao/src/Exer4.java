/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author aluno.saolucas
 */
public class Exer4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("digite uma palavra:");
        String palavra = ler.nextLine();
       
        String palavraInvertida = inverterPalavra(palavra);
        
        System.out.println("Palavra invertida: " + palavraInvertida);

       if(palavraInvertida.equals(palavra)) {
            System.out.println("A palavra \"" + palavra + "\" é um palíndromo");
        } else {
            System.out.println("A palavra \"" + palavra + "\" não é um palíndromo");
        }
        
        ler.close();
   
       
    }
    
      public static String inverterPalavra(String palavra) {
        StringBuilder sb = new StringBuilder(palavra);
        return sb.reverse().toString();
      }
    
}
