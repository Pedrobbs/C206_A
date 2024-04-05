
public class Main {
    public static void main(String[] args) {

        BrownieNutella bn = new BrownieNutella("Brownie", 20, "Nutella");
        BrownieCafe bc = new BrownieCafe("Brownie", 10, "Café");
        BrownieDoceDeLeite bl = new BrownieDoceDeLeite("Brownie", 15, "Doce De Leite");

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
    }
}
