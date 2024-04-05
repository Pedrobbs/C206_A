public class BrownieDoceDeLeite extends Brownie {

    public BrownieDoceDeLeite(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    @Override
    public void addCarrinhoDeCompras() {
        System.out.println("Adicionando um Brownie Doce de Leite no carrinho.");
    }

    public void adicionaDoceDeLeite() {
        System.out.println("Adicionando mais doce de leite...");
    }
}
