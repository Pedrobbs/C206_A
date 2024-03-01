public class Zumbi {
    double vida;
    String nome;

    double mostraVida() {
        return vida;
    }

    boolean tranfereVida(Zumbi outrozumbi, double quantia) {
        if (this.vida > quantia) {
            vida -= quantia;
            outrozumbi.vida += quantia;
            return true;
        } else {
            System.out.println("Não posso tranferir a quantidade de " + quantia + ", pois estou com " + this.vida + " de vida");
            return false;
        }
    }
}
