/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AplicativoDeMídiaSocial;

/**
 *
 * @author aluno.saolucas
 */
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private List<Publicacao> publicacoes;

    public Usuario(String nome) {
        this.nome = nome;
        this.publicacoes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void criarPublicacao(String conteudo) {
        Publicacao novaPublicacao = new Publicacao(this, conteudo);
        publicacoes.add(novaPublicacao);
    }

    public void listarPublicacoes() {
        if (publicacoes.isEmpty()) {
            System.out.println(nome + " não possui publicações.");
        } else {
            System.out.println("Publicações de " + nome + ":");
            for (Publicacao publicacao : publicacoes) {
                System.out.println(publicacao);
            }
        }
    }

    public List<Publicacao> getPublicacoes() {
        return publicacoes;
    }
}

