public class Zumbi {
    double vida;
    String nome;

    double mostraVida() {
        return vida;
    }

    void tranfereVida(Zumbi outrozumbi, double quantia) {
        vida -= quantia;
        outrozumbi.vida += quantia;
    }
}
