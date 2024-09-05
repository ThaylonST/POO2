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

public class Publicacao {
    private Usuario autor;
    private String conteudo;
    private List<Comentario> comentarios;

    public Publicacao(Usuario autor, String conteudo) {
        this.autor = autor;
        this.conteudo = conteudo;
        this.comentarios = new ArrayList<>();
    }

    public Usuario getAutor() {
        return autor;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void adicionarComentario(Usuario usuario, String comentarioTexto) {
        Comentario comentario = new Comentario(usuario, comentarioTexto);
        comentarios.add(comentario);
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(autor.getNome()).append(": ").append(conteudo).append("\n");
        if (!comentarios.isEmpty()) {
            sb.append("Comentários:\n");
            for (Comentario comentario : comentarios) {
                sb.append("  - ").append(comentario).append("\n");
            }
        }
        return sb.toString();
    }
}
