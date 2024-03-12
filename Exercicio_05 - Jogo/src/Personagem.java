public class Personagem {

    public String nome;
    public int pontos;

    Arma arma;

    public void usarArma() {
        arma.resistencia = arma.resistencia - 2;
        System.out.println(arma.resistencia);
    }

    public void tomarDano() {
        pontos = pontos - 5;
        System.out.println(pontos);
    }
}
