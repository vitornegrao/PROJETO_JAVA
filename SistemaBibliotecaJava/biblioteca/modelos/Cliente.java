package biblioteca.modelos;

public class Cliente extends Usuario {
    private int id;

    public Cliente(String nome, String email, int id) {
        super(nome, email);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + getNome() + ", email=" + getEmail() + ", id=" + id + '}';
    }
}
