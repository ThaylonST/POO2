/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exer2;

/**
 *
 * Crie uma classe chamada ContaBancaria com os atributos: titular, saldo e número da conta.
 * Implemente métodos para depositar e sacar dinheiro da conta. Crie um objeto ContaBancaria,
 * realize algumas operações e exiba o saldo final.
 */
public class ContaBancaria {
    
    private double saldo = 0;
    private String titular;
    private int numeroConta;

    public ContaBancaria(double saldo, String titular, int numeroConta) {
        this.saldo = saldo;
        this.titular = titular;
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    
    
   
    public void depositar(double valor){
        
        
        if(valor > 0){
            saldo += valor;
            System.out.println("Valor de deposito:" + valor);
            
        }else{
            
            System.out.println("valor de deposito deve ser positivo.");     
        }
   
    }

    
    public void sacar(double valor){
        
        if(valor > 0){
            if(valor <= saldo){
                saldo -= valor;
                System.out.println("Sacado: R$" + valor);     
            }else{
                
                System.out.println("saldo insuficiente para saque");
                
            }
            
            
            
        }
        
        
    }

    public void exibirSaldo(){
        
        System.out.println("saldo atual: R$" + saldo);
        
    }
    
    public static void main(String[] args) {
        
        ContaBancaria ContaBancaria1 = new ContaBancaria(1000,"Thaylon" ,123);
        
        ContaBancaria1.depositar(500);
        ContaBancaria1.exibirSaldo();
        
    }
}