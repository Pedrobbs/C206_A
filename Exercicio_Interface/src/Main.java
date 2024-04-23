public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Cachorro", 32);
        Boi boi = new Boi("Boi", 50);
        Lontra lontra = new Lontra("Lontra", 20);

        System.out.println("Sons de cachorro e boi: ");
        cachorro.emitirSom();
        boi.emitirSom();

        System.out.println();

        System.out.println("Animal Aquatico: ");
        lontra.nadar();

        System.out.println();

        System.out.println("Info Cachorro: ");
        cachorro.mostraInfo();
        System.out.println();
        System.out.println("Info Boi: ");
        boi.mostraInfo();
        System.out.println();
        System.out.println("Info Lontra: ");
        lontra.mostraInfo();


    }
}