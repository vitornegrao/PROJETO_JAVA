package biblioteca.modelos;

public class Administrador extends Usuario {

    public Administrador(String nome, String email) {
        super(nome, email);
    }

    public void gerenciarSistema() {
        System.out.println("Administrador gerenciando o sistema...");
    }
}
