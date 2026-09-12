import java.util.Date;

public class OrdemServico {

    private Date data;
    private String servico;
    private float valor;
    private int qtde;
    private Date dataAltorizacao;
    private String altorizacaoServico;
    private char statusServico;
    private String observacao;


    public void mostrar() {
        System.out.println("Ordem de Serviço");
    }

    public static void main(String[] args) {
        OrdemServico ordemServico = new OrdemServico();
        ordemServico.mostrar();
    }
}
