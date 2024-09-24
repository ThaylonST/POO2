package SistemadeReservaDeQuartosdeHotel;

public class ReservaDTO {
    private String cliente;
    private int numeroDoQuarto;
    private String dataEntrada;
    private String dataSaida;

    // Construtor
    public ReservaDTO(String cliente, int numeroDoQuarto, String dataEntrada, String dataSaida) {
        this.cliente = cliente;
        this.numeroDoQuarto = numeroDoQuarto;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    // Getters
    public String getCliente() {
        return cliente;
    }

    public int getNumeroDoQuarto() {
        return numeroDoQuarto;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    // Método toString para facilitar a visualização
    @Override
    public String toString() {
        return "Cliente: " + cliente + ", Quarto: " + numeroDoQuarto + 
               ", Entrada: " + dataEntrada + ", Saída: " + dataSaida;
    }
}
