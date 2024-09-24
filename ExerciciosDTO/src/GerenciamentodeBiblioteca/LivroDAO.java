/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GerenciamentodeBiblioteca;

/**
 *
 * @author tayl9
 */
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class LivroDAO {

    private List<LivroDTO> livros = new ArrayList<>();

    public void salvarLivro(LivroDTO livro) {
        livros.add(livro);
        JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!\n" + livro.toString());
    }

    public void removerLivro(String titulo) {
        for (LivroDTO livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                livros.remove(livro);
                JOptionPane.showMessageDialog(null, "Livro removido com sucesso!");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Livro não encontrado!");
    }

    public String listarLivros() {
    StringBuilder livrosListados = new StringBuilder();
    for (LivroDTO livro : livros) {
        livrosListados.append(livro.toString()).append("\n\n");
    }
    
    return livrosListados.length() == 0
            ? "Nenhum livro cadastrado."
            : livrosListados.toString();
}

}
