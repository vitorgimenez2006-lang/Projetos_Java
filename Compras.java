import java.util.Date;
public class Compras {

    private String fornecedor;
    private Date dataCompra;
    private double valorCompra;
    private int qtdeCompra;
    private String autorizacaoCompra;
    private String statusCompra;
    private String formaPagamento;
    private String notaFiscal;
    private String CNPJ;

    public void mostrar() {
        System.out.println("Compras");
    }

    public static void main(String[] args) {
        Compras compras = new Compras();
        compras.mostrar();
    }
}