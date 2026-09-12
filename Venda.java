import java.util.Date;

public class Venda {

    private String nome;
    private Date dataVenda;
    private float valorTotalProdutos;
    private float valorTotalVenda;
    private float valorPedido;
    private float qtdeVenda;
    private String autorizacaoVenda;
    private String produto;
    private char statusVenda;
    private char logistica;

    public void mostrar() {
        System.out.println("Venda");
    }

    public static void main(String[] args) {
        Venda venda = new Venda();
        venda.mostrar();
    }
}