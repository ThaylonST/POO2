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
public class Voo {
    private String numero;
    private String origem;
    private String destino;
    private int capacidade;
    private int assentosOcupados;

    public Voo(String numero, String origem, String destino, int capacidade) {
        this.numero = numero;
        this.origem = origem;
        this.destino = destino;
        this.capacidade = capacidade;
        this.assentosOcupados = 0;
    }

    public boolean verificarDisponibilidade() {
        return assentosOcupados < capacidade;
    }

    public boolean reservarAssento() {
        if (verificarDisponibilidade()) {
            assentosOcupados++;
            return true;
        }
        return false;
    }

    public String getNumero() {
        return numero;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    @Override
    public String toString() {
        return "Voo " + numero + " de " + origem + " para " + destino + " (Assentos disponíveis: " + (capacidade - assentosOcupados) + ")";
    }
}

