
public class Main {
    public static void main(String[] args) {

        BrownieNutella bn = new BrownieNutella("Brownie de Nutella", 20, "Nutella");
        BrownieCafe bc = new BrownieCafe("Brownie de Café", 10, "Café");
        BrownieDoceDeLeite bl = new BrownieDoceDeLeite("Brownie Doce de Leite", 15, "Doce De Leite");
        Comprador comprador = new Comprador("Anna", 15.00);

        // Adicionando complementos ao Brownie
        bn.adicionaNutella();
        bc.adicionaCafe();
        bl.adicionaDoceDeLeite();

        System.out.println();

        // Adicionando os Brownies ao carrinho
        bn.addCarrinhoDeCompras();
        bc.addCarrinhoDeCompras();
        bl.addCarrinhoDeCompras();

        System.out.println();

        // Calculando os total gasto em brownie
        bn.calculaValorTotal();
        bc.calculaValorTotal();
        bl.calculaValorTotal();

        System.out.println();

        // Mostrando as informações de cada Brownie
        bn.mostraInfo();
        System.out.println();
        bc.mostraInfo();
        System.out.println();
        bl.mostraInfo();

        System.out.println();

        // Comprandor comprando um brownie
        comprador.efetuarCompra(bn);
        comprador.efetuarCompra(bc);
        comprador.efetuarCompra(bl);
    }
}