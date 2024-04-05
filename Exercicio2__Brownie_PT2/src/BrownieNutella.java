public class BrownieNutella extends Brownie {

    public BrownieNutella(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    @Override
    public void addCarrinhoDeCompras() {
        System.out.println("Adicionando um Brownie de Nutella no carrinho.");
    }

    public void adicionaNutella() {
        System.out.println("Adicionando mais nutella...");
    }
}
