import java.util.Date;
public class Escala {

    private String nome;
    private Date diaTrabalho;
    private int diaFolga;
    private char statusEscala;
    private Date dataBonificacao;
    private String observação;


    public void mostrar() {
        System.out.println("Escala");
    }

    public static void main(String[] args) {
        Escala escala = new Escala();
        escala.mostrar();
    }
}