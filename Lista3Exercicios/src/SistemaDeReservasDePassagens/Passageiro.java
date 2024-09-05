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

public class Passageiro {
    private String nome;
    private String cpf;
    private List<Reserva> reservas;

    public Passageiro(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.reservas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void adicionarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public void listarReservas() {
        System.out.println("Reservas de " + nome + ":");
        for (Reserva reserva : reservas) {
            System.out.println(reserva);
        }
    }
}
