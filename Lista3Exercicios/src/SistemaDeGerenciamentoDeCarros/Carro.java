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
public class Carro {
    private String modelo;
    private Marca marca;
    private double preco;
    private boolean vendido;

    public Carro(String modelo, Marca marca, double preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
        this.vendido = false;
    }

    public String getModelo() {
        return modelo;
    }

    public Marca getMarca() {
        return marca;
    }

    public double getPreco() {
        return preco;
    }

    public boolean isVendido() {
        return vendido;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }
}

