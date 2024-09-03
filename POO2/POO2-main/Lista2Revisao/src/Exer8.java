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

public class Exer8 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Digite o número do cartão de crédito:");
        String numeroCartao = scanner.nextLine();

       
        String numeroMascarado = mascararNumeroCartao(numeroCartao);
        System.out.println("Número do cartão mascarado: " + numeroMascarado);

       
        scanner.close();
    }

   
    public static String mascararNumeroCartao(String numeroCartao) {
      
        if (numeroCartao.length() >= 4) {
           
            String ultimos4Digitos = numeroCartao.substring(numeroCartao.length() - 4);
            
          
            int tamanhoMascara = numeroCartao.length() - 4;
            StringBuilder mascara = new StringBuilder();
            for (int i = 0; i < tamanhoMascara; i++) {
                mascara.append('*');
            }
            
          
            return mascara.toString() + ultimos4Digitos;
        } else {
           
            return numeroCartao;
        }
    }
}
