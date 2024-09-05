/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaDeGerenciamentoDeEstoque;

/**
 *
 * @author tayl9
 */
import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Produto> produtos;
    private List<Fornecedor> fornecedores;

    public Loja() {
        this.produtos = new ArrayList<>();
        this.fornecedores = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void adicionarFornecedor(Fornecedor fornecedor) {
        fornecedores.add(fornecedor);
    }

    public void listarProdutosComEstoqueBaixo(int limite) {
        System.out.println("Produtos com estoque baixo:");
        for (Produto produto : produtos) {
            if (produto.isEstoqueBaixo(limite)) {
                System.out.println(produto);
            }
        }
    }

    public void realizarPedido(Produto produto, int quantidade, Fornecedor fornecedor) {
        Pedido pedido = new Pedido(produto, quantidade, fornecedor);
        pedido.realizarPedido();
    }
}
