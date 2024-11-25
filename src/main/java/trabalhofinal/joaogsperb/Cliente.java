package trabalhofinal.joaogsperb;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cliente {
    @Id
    private long id;
    private String nome;
    private String email;

    
    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    protected Cliente() {}

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public long getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
