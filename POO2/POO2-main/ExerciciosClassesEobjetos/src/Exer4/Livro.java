/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exer4;

/**
 *
 * Exercício 4: Livro
Crie uma classe chamada Livro com os atributos: título, autor, número de páginas e número de exemplares disponíveis. 
* Implemente métodos para emprestar e devolver o livro, garantindo que o número de exemplares disponíveis seja atualizado corretamente.
 */
public class Livro {
    
    private String titulo;
    private String autor;
    private int paginas;
    private int unidades;
    private int emprestado;

    
    public Livro(String titulo, String autor, int paginas, int unidades, int emprestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.unidades = unidades;
        this.emprestado = emprestado;
    }
    
    
    public Livro() {
        this.titulo = "";
        this.autor = "";
        this.paginas = 0;
        this.unidades = 300; 
        this.emprestado = 0;
    }

    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public int getEmprestado() {
        return emprestado;
    }

    public void setEmprestado(int emprestado) {
        this.emprestado = emprestado;
    }
    
   
    public void emprestar(int quantidade) {
        if (quantidade <= unidades) {
            unidades -= quantidade;
            emprestado += quantidade;
            System.out.println("Livros emprestados: " + quantidade);
            System.out.println("Unidades restantes: " + unidades);
        } else {
            System.out.println("Não há unidades suficientes para emprestar.");
        }
    }
    
    
    public void devolvido(int quantidade) {
        if (quantidade <= emprestado) {
            unidades += quantidade;
            emprestado -= quantidade;
            System.out.println("Livros devolvidos: " + quantidade);
            System.out.println("Unidades disponíveis: " + unidades);
        } else {
            System.out.println("Quantidade devolvida excede o número de livros emprestados.");
        }
    }
    
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        
       
        livro1.emprestar(100);
        
       
        livro1.devolvido(0);
        
       
        livro1.devolvido(0);
    }
}
