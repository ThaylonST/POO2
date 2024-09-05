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
public class Main {
    public static void main(String[] args) {
        SistemaReservas sistema = new SistemaReservas();
        
       
        Voo voo1 = new Voo("101", "São Paulo", "Rio de Janeiro", 5);
        Voo voo2 = new Voo("202", "Brasília", "Salvador", 3);
        
        sistema.adicionarVoo(voo1);
        sistema.adicionarVoo(voo2);
        
        
        Passageiro passageiro1 = new Passageiro("João", "12345678900");
        Passageiro passageiro2 = new Passageiro("Maria", "98765432100");

        
        sistema.listarVoosDisponiveis();
        
        
        sistema.fazerReserva(passageiro1, "101");
        sistema.fazerReserva(passageiro2, "101");
        sistema.fazerReserva(passageiro1, "202");
        
        
        passageiro1.listarReservas();
        passageiro2.listarReservas();
    }
}

