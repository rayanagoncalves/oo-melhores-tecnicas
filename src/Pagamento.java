import java.util.Calendar;

public class Pagamento {

    private String pagador;
    private String cnjPagador;
    private Calendar data;

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public String getPagador() {
        return pagador;
    }

    public void setPagador(String pagador) {
        this.pagador = pagador;
    }

    public String getCnjPagador() {
        return cnjPagador;
    }

    public void setCnjPagador(String cnjPagador) {
        this.cnjPagador = cnjPagador;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    private double valor;
}
