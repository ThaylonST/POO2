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
import java.util.ArrayList;
import java.util.List;

public class Vendedor {
    private String nome;
    private List<Carro> carrosVendidos;

    public Vendedor(String nome) {
        this.nome = nome;
        this.carrosVendidos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Carro> getCarrosVendidos() {
        return carrosVendidos;
    }

    public void venderCarro(Carro carro) {
        carro.setVendido(true);
        carrosVendidos.add(carro);
    }

    public void exibirCarrosVendidos() {
        if (carrosVendidos.isEmpty()) {
            System.out.println("Nenhum carro vendido por " + nome + ".");
        } else {
            System.out.println("Carros vendidos por " + nome + ":");
            for (Carro carro : carrosVendidos) {
                System.out.println("- " + carro.getModelo() + " (Marca: " + carro.getMarca().getNome() + ", Preço: " + carro.getPreco() + ")");
            }
        }
    }
}

