package trabalhofinal.joaogsperb;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Pagamento {
    @Id
    private long id;
    @ManyToOne
    private Assinatura assinaturaPaga;
    private Date dataPagamento;
    private double valorPago;
    private String promocao;

    public Pagamento(Assinatura assinaturaPaga, Date dataPagamento, double valorPago, String promocao) {
        this.assinaturaPaga = assinaturaPaga;
        this.dataPagamento = dataPagamento;
        this.valorPago = valorPago;
        this.promocao = promocao;
    }

    protected Pagamento() {}

    public Assinatura getAssinaturaPaga() {
        return assinaturaPaga;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public double getValorPago() {
        return valorPago;
    }

    public String getPromocao() {
        return promocao;
    }

    public long getId() {
        return id;
    }

    public void setAssinaturaPaga(Assinatura assinaturaPaga) {
        this.assinaturaPaga = assinaturaPaga;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public void setPromocao(String promocao) {
        this.promocao = promocao;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "id=" + id +
                ", assinaturaPaga=" + assinaturaPaga +
                ", dataPagamento=" + dataPagamento +
                ", valorPago=" + valorPago +
                ", promocao='" + promocao + '\'' +
                '}';
    }
}
