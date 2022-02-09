import java.text.NumberFormat;
import java.util.Locale;

public class RelatorioDeDivida {

    private final Divida divida;

    public RelatorioDeDivida(Divida divida) {
        this.divida = divida;
    }

    public void geraRelatorio(NumberFormat formatador) {
        System.out.println("Cnpj credor: " + divida.getCnpjCredor().getValor());
        System.out.println("Credor: " + divida.getCredor());

        System.out.println("Valor da dívida: " + formatador.format(divida.getTotal()));
        System.out.println("Valor pago: " + formatador.format(divida.getValorPago()));
    }

}
