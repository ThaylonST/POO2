/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaDeBibliotecaVirtualAvançada;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Autor autor1 = new Autor("J.K. Rowling");
        Livro livro1 = new Livro("Harry Potter e a Pedra Filosofal", autor1);
        Livro livro2 = new Livro("Harry Potter e a Câmara Secreta", autor1);

        Autor autor2 = new Autor("J.R.R. Tolkien");
        Livro livro3 = new Livro("O Senhor dos Anéis", autor2);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        Usuario usuario1 = new Usuario("Maria");
        biblioteca.adicionarUsuario(usuario1);

       
        Emprestimo emprestimo1 = biblioteca.realizarEmprestimo(livro1, usuario1, 15);

        
        biblioteca.devolverLivro(emprestimo1);

       
        List<Livro> livrosPopulares = biblioteca.listarLivrosPopulares();
        System.out.println("Livros mais populares:");
        for (Livro livro : livrosPopulares) {
            System.out.println(livro.getTitulo() + " - Popularidade: " + livro.getPopularidade());
        }
    }
}
