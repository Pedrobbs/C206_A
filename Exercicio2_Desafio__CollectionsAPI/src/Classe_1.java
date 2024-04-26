public abstract class Classe_1 implements Comparable<Classe_1> {

    public String nome;
    public int idade;

    public Classe_1(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public int compareTo(Classe_1 o) {
        if (this.idade < o.idade) {
            return 1;
        }
        if (this.idade > o.idade) {
            return -1;
        }
        return  0;
    }
}
