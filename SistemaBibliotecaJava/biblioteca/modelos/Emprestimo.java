package biblioteca.modelos;

import java.util.Date;

public class Emprestimo {
    private Cliente cliente;
    private Livro livro;
    private Date dataEmprestimo;

    public Emprestimo(Cliente cliente, Livro livro, Date dataEmprestimo) {
        this.cliente = cliente;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Livro getLivro() {
        return livro;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    @Override
    public String toString() {
        return "Emprestimo{" + "cliente=" + cliente + ", livro=" + livro + ", dataEmprestimo=" + dataEmprestimo + '}';
    }
}
