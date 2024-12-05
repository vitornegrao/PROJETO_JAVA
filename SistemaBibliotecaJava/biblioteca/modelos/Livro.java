package biblioteca.modelos;

public enum Livro {
    FICCAO,
    ROMANCE,
    TERROR,
    AVENTURA,
    BIOGRAFIA
};



public class Livro {
    private String titulo;
    private String autor;
    private Livro genero; // Correção: agora usa a enumeração Livro

    public Livro(String titulo, String autor, Livro genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Livro getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Livro{" + "titulo='" + titulo + '\'' + ", autor='" + autor + '\'' + ", genero=" + genero + '}';
    }
}
