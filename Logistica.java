import java.util.Date;

public class Logistica {

    private String nome;
    private Date data;
    private String produto;
    private int notaFiscal;
    private String mTransporte;
    private char statusFinanceiro;
    private String observacao;



    public void mostrar() {
        System.out.println("logistica");
    }

    public static void main(String[] args) {
        Logistica logistica = new Logistica();
        logistica.mostrar();
    }
}