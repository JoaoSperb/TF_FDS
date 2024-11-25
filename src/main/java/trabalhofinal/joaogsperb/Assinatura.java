package trabalhofinal.joaogsperb;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Assinatura {
    @Id
    private long id;
    @ManyToOne
    private Cliente cliente;
    @ManyToOne
    private Aplicativo aplicativo;
    private Date dataInicio;
    private Date dataFim;

    public Assinatura(Cliente cliente, Aplicativo aplicativo, Date dataInicio, Date dataFim) {
        this.cliente = cliente;
        this.aplicativo = aplicativo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    protected Assinatura() {}

    public Cliente getCliente() {
        return cliente;
    }

    public Aplicativo getAplicativo() {
        return aplicativo;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public long getId() {
        return id;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setAplicativo(Aplicativo aplicativo) {
        this.aplicativo = aplicativo;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    @Override
    public String toString() {
        return "Assinatura{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", aplicativo=" + aplicativo +
                ", dataInicio=" + dataInicio +
                ", dataFim=" + dataFim +
                '}';
    }
}
