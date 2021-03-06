public class Divida {

    private double total;
    private String credor;
    private Cnpj cnpjCredor = new Cnpj();
    private Pagamentos pagamentos = new Pagamentos();

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getCredor() {
        return credor;
    }

    public void setCredor(String credor) {
        this.credor = credor;
    }

    public Cnpj getCnpjCredor() {
        return cnpjCredor;
    }

    public void registra(Pagamento pagamento) {
        pagamentos.registra(pagamento);
    }

    public Double getValorPago() {
       return pagamentos.getValorPago();
    }
}
