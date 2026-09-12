public class Pessoa {

    private String nome;
    private String nomeFantasia;
    private String endereco;
    private String numero;
    private String cidade;
    private String uf;
    private char status;
    private char tipo;

    public void mostrar() {
        System.out.println("Pessoa");
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.mostrar();
    }
}