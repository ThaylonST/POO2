/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exer3;

/**
 *
 * Exercício 3: Carro
Crie uma classe chamada Carro com os atributos: marca, modelo, ano e velocidade. 
* Implemente um método para acelerar o carro e outro para desacelerar. 
* Crie um objeto Carro, teste os métodos de aceleração e desaceleração e exiba a velocidade atual.
 */

    public class carro {
    
    private String modelo;
    private String marca;
    private int ano;
    private int Velocidade = 0;

    public carro(String modelo, String marca, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.Velocidade = 0;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getVelocidade() {
        return Velocidade;
    }

    public void setVelocidade(int Velocidade) {
        this.Velocidade = Velocidade;
    }
    
    
    
    public void acelerar(double acelerar ){
        
        if(acelerar > 0){
            
            Velocidade += acelerar;
            System.out.println("Velocidade aumentada para:" + Velocidade);
            
        }
          
    }
    
    public void frear (double frear){
        
        if(frear > 0){
            
            Velocidade -= frear;
            
            System.out.println("Velocidade reduzida para:" + Velocidade);
        }
        
        
    }
    
    public double velAtual(){
        
        return Velocidade;
        
    }
    
    public static void main(String[] args) {
        carro carro1 = new carro("Fusca", "Volkswagen", 1978);
        
        carro1.acelerar(30);
        carro1.frear(20);
        System.out.println(carro1.velAtual());
    }
    
    
}

    

