import java.util.Date;

public class PCP {

    private String nome;
    private char statusPCP;
    private Date dataPCP;
    private Date dataProcessamento;
    private float saldoEstoque;
    private float saldoMinimo;
    private char autorizacaoPCP;
    private Date dataAutorizacao;
    private String observacao;


    public void mostrar() {
        System.out.println("PCP");
    }

    public static void main(String[] args) {
        PCP pcp = new PCP();
        pcp.mostrar();
    }
}