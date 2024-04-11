public class Brownie {

    protected String nome;
    protected double preco;
    protected String sabor;

    public Brownie(String nome, double preco, String sabor) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void addCarrinhoDeCompras() {
        System.out.println("Adicionando o Brownie de " + nome + " no carrinho.");
    }

    public void calculaValorTotal() {
        System.out.println("Valor para o " + nome + " com sabor de " + sabor + ": " + preco);
    }

    public void mostraInfo() {
        System.out.println("Nome : " + nome);
        System.out.println("Preço: " + preco + " R$");
        System.out.println("Sabor: " + sabor);
    }
}