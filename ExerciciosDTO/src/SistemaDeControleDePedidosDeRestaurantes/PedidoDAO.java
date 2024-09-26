/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaDeControleDePedidosDeRestaurantes;

/**
 *
 * @author tayl9
 */
import java.util.ArrayList;
import java.util.List;

public class PedidoDAO {
    private List<PedidoDTO> pedidos;

    public PedidoDAO() {
        this.pedidos = new ArrayList<>();
    }

    public void adicionarPedido(PedidoDTO pedido) {
        pedidos.add(pedido);
    }

    public void removerPedido(int numeroDoPedido) {
        pedidos.removeIf(p -> p.getNumeroDoPedido() == numeroDoPedido);
    }

    public List<PedidoDTO> listarPedidos() {
        return pedidos;
    }
}

