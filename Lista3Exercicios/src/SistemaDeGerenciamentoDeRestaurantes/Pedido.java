/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaDeGerenciamentoDeRestaurantes;

/**
 *
 * @author aluno.saolucas
 */
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Prato> pratos;

    public Pedido() {
        this.pratos = new ArrayList<>();
    }

    public void adicionarPrato(Prato prato) {
        pratos.add(prato);
    }

    public double calcularTotal() {
        double total = 0;
        for (Prato prato : pratos) {
            total += prato.getPreco();
        }
        return total;
    }

    public List<Prato> getPratos() {
        return pratos;
    }
}

