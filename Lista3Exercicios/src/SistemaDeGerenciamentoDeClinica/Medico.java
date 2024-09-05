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
import java.util.ArrayList;
import java.util.List;

public class Medico {
    private String nome;
    private String especialidade;
    private List<Paciente> pacientes;
    private List<Consulta> consultas;

    public Medico(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.pacientes = new ArrayList<>();
        this.consultas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void adicionarPaciente(Paciente paciente) {
        if (!pacientes.contains(paciente)) {
            pacientes.add(paciente);
        }
    }

    public void agendarConsulta(Consulta consulta) {
        consultas.add(consulta);
        consulta.getPaciente().adicionarConsulta(consulta);
    }

    public List<Paciente> listarPacientes() {
        return pacientes;
    }

    public List<Consulta> listarProximasConsultas() {
        return consultas;
    }
}
