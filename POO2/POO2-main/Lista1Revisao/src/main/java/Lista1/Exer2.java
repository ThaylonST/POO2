/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista1;
import java.util.Scanner; 
/**
 *
 * @author aluno.saolucas
 */
public class Exer2 {
    

public class Saudacao {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

       
        System.out.println("Olá, " + nome + "! Bem-vindo ao programa.");

      
        scanner.close();
    }
}

}
