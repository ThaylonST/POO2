/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaDeReservasDePassagens;

/**
 *
 * @author aluno.saolucas
 */
import java.util.ArrayList;
import java.util.List;

public class SistemaReservas {
    private List<Voo> voos;

    public SistemaReservas() {
        this.voos = new ArrayList<>();
    }

    public void adicionarVoo(Voo voo) {
        voos.add(voo);
    }

    public void listarVoosDisponiveis() {
        System.out.println("Voos disponíveis:");
        for (Voo voo : voos) {
            if (voo.verificarDisponibilidade()) {
                System.out.println(voo);
            }
        }
    }

    public void fazerReserva(Passageiro passageiro, String numeroVoo) {
        for (Voo voo : voos) {
            if (voo.getNumero().equals(numeroVoo)) {
                if (voo.reservarAssento()) {
                    Reserva reserva = new Reserva(passageiro, voo);
                    passageiro.adicionarReserva(reserva);
                    System.out.println("Reserva realizada com sucesso!");
                } else {
                    System.out.println("Não há assentos disponíveis nesse voo.");
                }
                return;
            }
        }
        System.out.println("Voo não encontrado.");
    }
}

