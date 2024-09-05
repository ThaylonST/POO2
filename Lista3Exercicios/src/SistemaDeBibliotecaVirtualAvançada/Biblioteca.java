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
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Biblioteca {
    private List<Livro> livros;
    private List<Usuario> usuarios;
    private List<Emprestimo> emprestimos;

    public Biblioteca() {
        livros = new ArrayList<>();
        usuarios = new ArrayList<>();
        emprestimos = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Emprestimo realizarEmprestimo(Livro livro, Usuario usuario, int dias) {
        if (livro.isDisponivel()) {
            Emprestimo emprestimo = new Emprestimo(livro, usuario, dias);
            emprestimos.add(emprestimo);
            usuario.adicionarEmprestimo(emprestimo);
            return emprestimo;
        } else {
            System.out.println("Livro não disponível para empréstimo.");
            return null;
        }
    }

    public void devolverLivro(Emprestimo emprestimo) {
        emprestimo.devolverLivro();
        double multa = emprestimo.calcularMulta();
        if (multa > 0) {
            System.out.println("Multa por atraso: R$ " + multa);
        }
    }

    public List<Livro> listarLivrosPopulares() {
        return livros.stream()
                     .sorted(Comparator.comparing(Livro::getPopularidade).reversed())
                     .limit(10)
                     .collect(Collectors.toList());
    }
}

