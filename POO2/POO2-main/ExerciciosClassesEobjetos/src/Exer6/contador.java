/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exer6;

/**
 *
 * Exercício 6: Contador
Crie uma classe chamada Contador que mantenha um valor inteiro. 
* Implemente métodos para incrementar e decrementar esse valor. 
* Crie um objeto Contador, faça algumas operações e exiba o valor final.
 */
public class contador {
    
    private int valor;

   public contador(){
       
       this.valor = 0;
       
   }
    
    public void incrementar(){
        
        valor++;
        
    }
    
    public void decrementar(){
        
        valor--;
        
    }
    
    public int valor(){
        
        return valor;
        
    }
    
     public static void main(String[] args) {
     
     contador contador1 = new contador();
     
     contador1.incrementar();
     contador1.incrementar();
     contador1.decrementar();
     
         System.out.println(contador1.valor);
     
     }
}
