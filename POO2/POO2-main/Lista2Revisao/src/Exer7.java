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
public class Exer7 {
    
    

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Digite seu endereço de e-mail:");
        String email = scanner.nextLine();

      
        String dominio = extrairDominio(email);
        if (dominio != null) {
            System.out.println("O domínio do e-mail é: " + dominio);
        } else {
            System.out.println("O e-mail digitado não é válido.");
        }

        
        scanner.close();
    }

   
    public static String extrairDominio(String email) {
        
        int posicaoArroba = email.indexOf('@');
        if (posicaoArroba != -1 && posicaoArroba < email.length() - 1) {
           
            return email.substring(posicaoArroba + 1);
        } else {
           
            return null;
        }
    }
}

    

