public class Kart {

    public String nome;

    Motor motor;
    Piloto piloto;


    public Kart() {
        motor = new Motor();
    }

    public void pular() {
        System.out.println("Carro " + nome + " esta pulando!");
    }

    public void soltarTurbo() {
        System.out.println("Carro " + nome + " esta soltando turbo!");
    }

    public void fazerDrift() {
        System.out.println("Carro " + nome + " esta fazendo drift!");
    }
}
