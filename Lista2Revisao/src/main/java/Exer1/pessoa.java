/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exer1;

/**
 *Exercício 1: Criando uma Classe simples
Crie uma classe chamada Pessoa com os seguintes atributos: nome, idade e profissão. 
* Em seguida, crie um objeto da classe Pessoa e preencha seus atributos. Por fim, exiba 
* os detalhes da pessoa na saída.
 * 
 */
public class pessoa{
    
    private String nome;
    private int idade;
    private String profissao;

    public pessoa(String nome, int idade, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    
    public void exibir(){
        
        System.out.println("Nome:" + nome);
        System.out.println("idade:" + idade);
        System.out.println("profissão:" + profissao);
        
    }
    
    public static void main(String[] args) {
        
        pessoa pessoa1 = new pessoa("thaylon", 18, "programador");
        
        pessoa1.exibir();
        
    }
    
}
