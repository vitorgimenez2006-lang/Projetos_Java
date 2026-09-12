public class Produto {

    private String nome;
    private String descricao;
    private double valor;
    private int qtde;
    private String status;
    private String categoria;
    private String fornecedor;

    public void mostrar() {
        System.out.println("Produto");
    }

    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.mostrar();
    }
}