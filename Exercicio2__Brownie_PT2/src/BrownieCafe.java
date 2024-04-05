public class BrownieCafe extends Brownie {

    public BrownieCafe(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    @Override
    public void addCarrinhoDeCompras() {
        System.out.println("Adicionando um Brownie de Cafe no carrinho.");
    }

    public void adicionaCafe() {
        System.out.println("Adicionando mais cafe...");
    }
}