import java.util.Date;

public class Fiscal {

    private String nome;
    private Date data;
    private int notaFiscal;
    private String produto;
    private float qtde;
    private float valor;
    private char status;
    private float valorTotal;

    public void mostrar() {
        System.out.println("Fiscal");
    }

    public static void main(String[] args) {
        Fiscal fiscal = new Fiscal();
        fiscal.mostrar();
    }
}