/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemadeReservaDeQuartosdeHotel;

/**
 *
 * @author tayl9
 */


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReservaDAO {
    private List<ReservaDTO> reservas;

    public ReservaDAO() {
        reservas = new ArrayList<>();
    }

    public void adicionarReserva(ReservaDTO reserva) {
        reservas.add(reserva);
    }

    public List<ReservaDTO> buscarReservasPorData(LocalDate data) {
        List<ReservaDTO> reservasEncontradas = new ArrayList<>();
        for (ReservaDTO reserva : reservas) {
            // Convertendo as strings para LocalDate
            LocalDate dataEntrada = LocalDate.parse(reserva.getDataEntrada());
            LocalDate dataSaida = LocalDate.parse(reserva.getDataSaida());
            
            // Verificando as condições de data
            if ((dataEntrada.equals(data) || dataSaida.equals(data)) ||
                (dataEntrada.isBefore(data) && dataSaida.isAfter(data))) {
                reservasEncontradas.add(reserva);
            }
        }
        return reservasEncontradas;
    }

    public List<ReservaDTO> listarReservas() {
        return reservas;
    }
}
