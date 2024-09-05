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

public class Restaurante {
    private List<Mesa> mesas;
    private List<String> reservas;

    public Restaurante(int quantidadeMesas) {
        mesas = new ArrayList<>();
        reservas = new ArrayList<>();
        for (int i = 1; i <= quantidadeMesas; i++) {
            mesas.add(new Mesa(i));
        }
    }

    public void fazerReserva(String reserva) {
        reservas.add(reserva);
    }

    public void exibirReservasFuturas() {
        System.out.println("Reservas Futuras:");
        for (String reserva : reservas) {
            System.out.println(reserva);
        }
    }

    public Mesa encontrarMesa(int numero) {
        for (Mesa mesa : mesas) {
            if (mesa.getNumero() == numero) {
                return mesa;
            }
        }
        return null;
    }

    public void adicionarPedido(int numeroMesa, Pedido pedido) {
        Mesa mesa = encontrarMesa(numeroMesa);
        if (mesa != null) {
            mesa.adicionarPedido(pedido);
        } else {
            System.out.println("Mesa não encontrada.");
        }
    }

    public void calcularConta(int numeroMesa) {
        Mesa mesa = encontrarMesa(numeroMesa);
        if (mesa != null) {
            double total = 0;
            for (Pedido pedido : mesa.getPedidos()) {
                total += pedido.calcularTotal();
            }
            System.out.printf("Total da conta da Mesa %d: R$ %.2f%n", numeroMesa, total);
        } else {
            System.out.println("Mesa não encontrada.");
        }
    }

    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante(5);

        
        restaurante.fazerReserva("Reservado para 2 pessoas às 19:00");
        restaurante.fazerReserva("Reservado para 4 pessoas às 21:00");

       
        restaurante.exibirReservasFuturas();

       
        Prato prato1 = new Prato("Pizza Margherita", 29.90);
        Prato prato2 = new Prato("Espaguete Carbonara", 35.50);

       
        Pedido pedido = new Pedido();
        pedido.adicionarPrato(prato1);
        pedido.adicionarPrato(prato2);

       
        restaurante.adicionarPedido(1, pedido);

       
        restaurante.calcularConta(1);
    }
}

