/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exer5;

/**
 *
 * Exercício 5: Retângulo
Crie uma classe chamada Retangulo com os atributos: largura e altura. 
* Implemente métodos para calcular a área e o perímetro do retângulo. 
* Crie um objeto Retangulo, faça os cálculos e exiba os resultados.
 */
public class Retangulo {
    
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }
    
    public Retangulo(){
    
    this.altura = 0;
    this.largura = 0;
    
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
    public void calcular(double res){
        
        res = largura * altura;
        System.out.println("Resultado:" + res);
        
    }
    
   public static void main(String[] args) {
   
       Retangulo retangulo1 = new Retangulo();

       retangulo1.setLargura(10);
       retangulo1.setAltura(10);
       retangulo1.calcular(0);
   
   }
}
