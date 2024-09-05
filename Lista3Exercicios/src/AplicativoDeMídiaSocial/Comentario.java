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
public class Comentario {
    private Usuario autor;
    private String conteudo;

    public Comentario(Usuario autor, String conteudo) {
        this.autor = autor;
        this.conteudo = conteudo;
    }

    public Usuario getAutor() {
        return autor;
    }

    public String getConteudo() {
        return conteudo;
    }

    @Override
    public String toString() {
        return autor.getNome() + ": " + conteudo;
    }
}

