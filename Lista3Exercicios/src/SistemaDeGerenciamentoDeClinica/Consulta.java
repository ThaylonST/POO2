/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaDeGerenciamentoDeClinica;

/**
 *
 * @author aluno.saolucas
 */
import java.util.Date;

public class Consulta {
    private Medico medico;
    private Paciente paciente;
    private Date data;

    public Consulta(Medico medico, Paciente paciente, Date data) {
        this.medico = medico;
        this.paciente = paciente;
        this.data = data;
    }

    public Medico getMedico() {
        return medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Date getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Consulta com Dr. " + medico.getNome() + " - Paciente: " + paciente.getNome() + " - Data: " + data;
    }
}
