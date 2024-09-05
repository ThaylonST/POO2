/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaDeGerenciamentoDeEstoque;

/**
 *
 * @author tayl9
 */
public class Pedido {
    private Produto produto;
    private int quantidade;
    private Fornecedor fornecedor;

    public Pedido(Produto produto, int quantidade, Fornecedor fornecedor) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.fornecedor = fornecedor;
    }

    public void realizarPedido() {
        fornecedor.fazerPedido(produto, quantidade);
    }

    @Override
    public String toString() {
        return "Pedido: " + produto.getNome() + ", Quantidade: " + quantidade + ", Fornecedor: " + fornecedor.getNome();
    }
}
