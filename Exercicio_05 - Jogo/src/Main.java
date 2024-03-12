public class Main {

    public static void main(String[] args) {

    Arma arma = new Arma();
    Personagem personagem = new Personagem();

    personagem.nome = "Pedro";
    personagem.pontos = 10;

    arma.descricao = "Matadora";
    arma.resistencia = 100;
    arma.poder = 50;
    arma.nome = "AK-47";

    personagem.arma = arma;
    personagem.tomarDano();
    personagem.usarArma();
    arma.mostraInfoArma();

    }
}
