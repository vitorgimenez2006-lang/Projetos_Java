public class Estoque {

    private String produto;
    private int qtdeEstoque;
    private float valorProduto;
    private char statusEstoque;

    public void mostrar() {
        System.out.println("Estoque");
    }

    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        estoque.mostrar();
    }
}