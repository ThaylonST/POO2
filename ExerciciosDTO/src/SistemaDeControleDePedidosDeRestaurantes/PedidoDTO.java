/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaDeControleDePedidosDeRestaurantes;

import java.util.List;

/**
 *
 * @author tayl9
 */
public class PedidoDTO {
    
    private int numeroDoPedido;
    private String cliente;
    private List<String> itens;
    private double total;

    public PedidoDTO(int numeroDoPedido, String cliente, List<String> itens, double total) {
        this.numeroDoPedido = numeroDoPedido;
        this.cliente = cliente;
        this.itens = itens;
        this.total = total;
    }

    public int getNumeroDoPedido() {
        return numeroDoPedido;
    }

    public void setNumeroDoPedido(int numeroDoPedido) {
        this.numeroDoPedido = numeroDoPedido;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<String> getItens() {
        return itens;
    }

    public void setItens(List<String> itens) {
        this.itens = itens;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
    
}
