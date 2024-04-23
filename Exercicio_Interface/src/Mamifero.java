public abstract class Mamifero {

    protected String nome;
    protected double vida;

    public Mamifero(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public void emitirSom() {
        System.out.println("Animal emitindo som...");
    }

    public void mostraInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
    }
}
