public class GerenciadorDeDividas {

    public void efetuaPagamento(Divida divida, double valor, String nomePagador, String cnpjPagador) {
        Pagamento pagamento = new Pagamento();
        pagamento.setPagador(nomePagador);
        pagamento.setCnjPagador(cnpjPagador);
        pagamento.setValor(valor);
        divida.getPagamentos().registra(pagamento);
    }
}
