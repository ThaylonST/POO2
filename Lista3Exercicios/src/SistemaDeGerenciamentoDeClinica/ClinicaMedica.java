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

public class ClinicaMedica {
    public static void main(String[] args) {
        
        Medico medico1 = new Medico("Dr. Carlos", "Cardiologia");
        Medico medico2 = new Medico("Dra. Ana", "Dermatologia");

        
        Paciente paciente1 = new Paciente("João Silva", "123.456.789-00");
        Paciente paciente2 = new Paciente("Maria Oliveira", "987.654.321-00");

        
        Consulta consulta1 = new Consulta(medico1, paciente1, new Date());
        Consulta consulta2 = new Consulta(medico1, paciente2, new Date());
        Consulta consulta3 = new Consulta(medico2, paciente1, new Date());

        medico1.agendarConsulta(consulta1);
        medico1.agendarConsulta(consulta2);
        medico2.agendarConsulta(consulta3);

       
        System.out.println("Pacientes do Dr. Carlos:");
        for (Paciente paciente : medico1.listarPacientes()) {
            System.out.println(paciente.getNome());
        }

        
        System.out.println("\nPróximas consultas do Dr. Carlos:");
        for (Consulta consulta : medico1.listarProximasConsultas()) {
            System.out.println(consulta);
        }
    }
}

