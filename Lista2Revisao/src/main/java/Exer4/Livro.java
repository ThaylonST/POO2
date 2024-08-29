/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exer4;

/**
 *
 * @author aluno.saolucas
 */
public class Livro {
    
    private String titulo;
    private String autor;
    private int paginas;
    private int unidades = 300;
    private int emprestado;

    public Livro(String titulo, String autor, int paginas, int unidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.unidades = unidades;
        this.emprestado = emprestado;
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
    
    public int emprestar(int emprestado){
        
        unidades -= emprestado;
        
        return unidades;
    }
    
    public int devolvel(){
        
        unidades  += emprestado;
        
    }
    
}
