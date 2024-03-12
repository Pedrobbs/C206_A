public class Main {

    public static void main(String[] args) {

        Kart kart1 = new Kart(); // instanciando um kart1
        Kart kart2 = new Kart(); // instanciando um kart1

        kart1.nome = "Kart1";
        kart2.nome = "Kart2";

        kart1.motor.cilindradas = "150";
        kart1.motor.velocidadeMaxima = 100.50F;

        kart2.motor.cilindradas = "100";
        kart2.motor.velocidadeMaxima = 50.25F;

        Piloto piloto1 = new Piloto(); // instanciando o piloto1
        Piloto piloto2 = new Piloto(); // instanciando o piloto1

        piloto1.nome = "Piloto1";
        piloto2.nome = "Piloto2";

        kart1.piloto = piloto1; // associando kart1 para piloto1
        kart2.piloto = piloto2; // associando kart2 para piloto2

        piloto1.soltaSuperPoder();
        piloto2.soltaSuperPoder();

        kart1.fazerDrift();
        kart1.motor.mostraInfo();

        kart2.fazerDrift();
        kart2.motor.mostraInfo();

    }
}
