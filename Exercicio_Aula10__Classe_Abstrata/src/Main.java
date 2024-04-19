public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Cachorro", 100);
        Lontra lontra = new Lontra("Lontra", 90);
        Boi boi = new Boi("Boi", 50);

        cachorro.emitirSon();
        lontra.emitirSon();
        boi.emitirSon();

        System.out.println();

        System.out.println("Informações do cachorro: ");
        cachorro.mostraInfo();
        System.out.println("Informações da lontra:");
        lontra.mostraInfo();
        System.out.println("Informações de boi:");
        boi.mostraInfo();   
    }
}