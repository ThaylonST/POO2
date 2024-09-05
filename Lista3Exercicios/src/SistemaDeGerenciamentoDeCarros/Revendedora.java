/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaDeGerenciamentoDeCarros;

/**
 *
 * @author aluno.saolucas
 */
public class Revendedora {
    public static void main(String[] args) {
       
        Marca marcaToyota = new Marca("Toyota");
        Marca marcaHonda = new Marca("Honda");

        
        Carro carro1 = new Carro("Corolla", marcaToyota, 85000);
        Carro carro2 = new Carro("Civic", marcaHonda, 90000);
        Carro carro3 = new Carro("Camry", marcaToyota, 110000);

        
        marcaToyota.adicionarCarro(carro1);
        marcaToyota.adicionarCarro(carro3);
        marcaHonda.adicionarCarro(carro2);

        
        Vendedor vendedor = new Vendedor("João");

        
        vendedor.venderCarro(carro1);

        
        vendedor.exibirCarrosVendidos();

        
        System.out.println("Média de preços da Toyota: " + marcaToyota.calcularMediaPrecos());
        System.out.println("Média de preços da Honda: " + marcaHonda.calcularMediaPrecos());
    }
}

