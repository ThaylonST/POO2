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
public class App {
    public static void main(String[] args) {
       
        Usuario usuario1 = new Usuario("Alice");
        Usuario usuario2 = new Usuario("Bob");

        
        usuario1.criarPublicacao("Hoje o dia está lindo!");
        usuario1.criarPublicacao("Alguém tem sugestões de filmes?");

      
        Publicacao publicacaoDeAlice = usuario1.getPublicacoes().get(0);
        publicacaoDeAlice.adicionarComentario(usuario2, "Concordo, o dia está incrível!");

        
        usuario1.listarPublicacoes();

       
        usuario2.criarPublicacao("Acabei de assistir um filme ótimo!");

       
        usuario2.listarPublicacoes();
    }
}

