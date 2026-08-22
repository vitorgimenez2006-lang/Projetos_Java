public class Main {
     public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        pessoa.nome = " Vitor Tasso";
        pessoa.idade = 52;

        pessoa2.nome = " Joao pedro";
        pessoa2.idade = 52;

        pessoa.apresentar();
        pessoa2.apresentar();
    
    }
}