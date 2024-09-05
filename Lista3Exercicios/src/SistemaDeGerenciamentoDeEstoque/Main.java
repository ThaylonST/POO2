/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaDeGerenciamentoDeEstoque;

/**
 *
 * @author tayl9
 */
public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja();

        Produto produto1 = new Produto("Arroz", 20.50, 10);
        Produto produto2 = new Produto("Feijão", 7.30, 5);

        Fornecedor fornecedor1 = new Fornecedor("Fornecedor A");
        fornecedor1.adicionarProduto(produto1);
        fornecedor1.adicionarProduto(produto2);

        loja.adicionarProduto(produto1);
        loja.adicionarProduto(produto2);
        loja.adicionarFornecedor(fornecedor1);

        loja.listarProdutosComEstoqueBaixo(6);

        loja.realizarPedido(produto2, 20, fornecedor1);
        loja.listarProdutosComEstoqueBaixo(6);
    }
}

