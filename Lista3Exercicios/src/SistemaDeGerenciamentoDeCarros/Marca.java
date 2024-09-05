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

public class Marca {
    private String nome;
    private List<Carro> carros;

    public Marca(String nome) {
        this.nome = nome;
        this.carros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void adicionarCarro(Carro carro) {
        carros.add(carro);
    }

    public double calcularMediaPrecos() {
        if (carros.isEmpty()) {
            return 0;
        }
        double soma = 0;
        int quantidade = 0;
        for (Carro carro : carros) {
            if (!carro.isVendido()) {
                soma += carro.getPreco();
                quantidade++;
            }
        }
        return quantidade == 0 ? 0 : soma / quantidade;
    }
}

