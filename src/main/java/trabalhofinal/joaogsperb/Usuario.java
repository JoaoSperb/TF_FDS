package trabalhofinal.joaogsperb;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Usuario {
    @Id
    private long id;
    private String nome;
    private String senha;
    
    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    protected Usuario() {}

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public long getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
