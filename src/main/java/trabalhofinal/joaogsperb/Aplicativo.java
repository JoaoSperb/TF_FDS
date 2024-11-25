package trabalhofinal.joaogsperb;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Aplicativo {
    @Id
    private long id;
    private String nome;
    private double custoMensal;

    public Aplicativo(long id, String nome, double custoMensal) {
        this.id = id;
        this.nome = nome;
        this.custoMensal = custoMensal;
    }

    protected Aplicativo() {}

    public long getId() {
        return id;
    } 

    public String getNome() {
        return nome;
    }

    public double getCustoMensal() {
        return custoMensal;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCustoMensal(double custoMensal) {
        this.custoMensal = custoMensal;
    }

    @Override
    public String toString() {
        return "Aplicativo{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", custoMensal=" + custoMensal +
                '}';
    }
}
