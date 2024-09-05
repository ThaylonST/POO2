/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaDeGerenciamentoDeEstoque;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tayl9
 */
import java.util.ArrayList;
import java.util.List;

public class Fornecedor {
    private String nome;
    private List<Produto> produtos;

    public Fornecedor(String nome) {
        this.nome = nome;
        this.produtos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void fazerPedido(Produto produto, int quantidade) {
        produto.atualizarEstoque(quantidade);
        System.out.println("Pedido feito para " + produto.getNome() + ": " + quantidade + " unidades.");
    }
}
