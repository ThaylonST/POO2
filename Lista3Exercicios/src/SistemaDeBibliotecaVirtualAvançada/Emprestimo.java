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
    import java.time.LocalDate;
    import java.time.temporal.ChronoUnit;

    public class Emprestimo {
        private Livro livro;
        private Usuario usuario;
        private LocalDate dataEmprestimo;
        private LocalDate dataDevolucaoPrevista;
        private LocalDate dataDevolucaoReal;
        private static final double MULTA_POR_DIA = 1.50;

        public Emprestimo(Livro livro, Usuario usuario, int diasDeEmprestimo) {
            this.livro = livro;
            this.usuario = usuario;
            this.dataEmprestimo = LocalDate.now();
            this.dataDevolucaoPrevista = dataEmprestimo.plusDays(diasDeEmprestimo);
            this.livro.setDisponivel(false);
            this.livro.aumentarPopularidade();
        }

        public void devolverLivro() {
            this.dataDevolucaoReal = LocalDate.now();
            this.livro.setDisponivel(true);
            usuario.removerEmprestimo(this);
        }

        public long calcularDiasAtraso() {
            if (dataDevolucaoReal == null) {
                return 0;
            }
            return ChronoUnit.DAYS.between(dataDevolucaoPrevista, dataDevolucaoReal);
        }

        public double calcularMulta() {
            long diasAtraso = calcularDiasAtraso();
            return diasAtraso > 0 ? diasAtraso * MULTA_POR_DIA : 0;
        }

        public Livro getLivro() {
            return livro;
        }

        public Usuario getUsuario() {
            return usuario;
        }
    }
