import java.util.Date;

public class Patrimonio {

    private String nome;
    private Date data;
    private char status;
    private String local;

    public void mostrar() {
        System.out.println("Patrimonio");
    }

    public static void main(String[] args) {
        Patrimonio patrimonio = new Patrimonio();
        patrimonio.mostrar();
    }
}