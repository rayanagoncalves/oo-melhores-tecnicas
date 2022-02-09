import java.text.NumberFormat;
import java.util.Locale;

public class GerenciadorDeDividas {

    public void efetuaPagamento(Divida divida, double valor, String nomePagador, String cnpjPagador) {
        Pagamento pagamento = new Pagamento();
        pagamento.setPagador(nomePagador);
        pagamento.setCnjPagador(cnpjPagador);
        pagamento.setValor(valor);
        divida.registra(pagamento);
    }

    public static void main(String[] args) {
        Divida divida = new Divida();
        divida.setCredor("Uma empresa");
        divida.setTotal(100);
        divida.getCnpjCredor().setValor("000");

        Pagamento pagamento = new Pagamento();
        pagamento.setCnjPagador("010");
        pagamento.setPagador("Outra empresa");

        NumberFormat formatador = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        RelatorioDeDivida relatorioDeDivida = new RelatorioDeDivida(divida);
        relatorioDeDivida.geraRelatorio(formatador);
    }
}
