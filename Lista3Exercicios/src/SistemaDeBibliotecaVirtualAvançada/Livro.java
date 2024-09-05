/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaDeBibliotecaVirtualAvançada;

/**
 *
 * @author aluno.saolucas
 */
public class Livro {
    private String titulo;
    private Autor autor;
    private boolean disponivel;
    private int popularidade;

    public Livro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true; 
        this.popularidade = 0;
        autor.adicionarLivro(this);
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void aumentarPopularidade() {
        this.popularidade++;
    }

    public int getPopularidade() {
        return popularidade;
    }
}

