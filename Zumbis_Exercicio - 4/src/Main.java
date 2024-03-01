public class Main {
    public static void main(String[] args) {

        Zumbi zumbi1 = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        zumbi1.vida = 50;
        zumbi2.vida = 90;

        System.out.println("Vida do zumbi1: " + zumbi1.vida);
        System.out.println("Vida do zumbi2: " + zumbi2.vida);

        if (zumbi1.tranfereVida(zumbi2, 10)) {
            System.out.println("zumbi1 transferindo 10 para zumbi2");
            System.out.println("Vida do zumbi1: " + zumbi1.vida);
            System.out.println("Vida do zumbi2: " + zumbi2.vida);
        } else if (zumbi1.tranfereVida(zumbi2, 10)) {
            System.out.println("zumbi1 transferindo 10 para zumbi2");
            System.out.println("Vida do zumbi1: " + zumbi1.vida);
            System.out.println("Vida do zumbi2: " + zumbi2.vida);
        } else {
            System.out.println("A vida continua a mesma");
        }
    }
}