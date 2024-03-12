public class Cantina {

    Salgado salgados[] = new Salgado[3];

    public String nome;

    public void addSalgado(Salgado novoSalgado) {
        for (int i = 0; i < this.salgados.length; ++i) {
            if (this.salgados[i] == null) {
                this.salgados[i] = novoSalgado;
                break;
            }
        }
    }

    public void mostraInfo() {
        System.out.println("Nome: " + this.nome);
        for (int i = 0; i < this.salgados.length; ++i) {
            if (this.salgados[i] != null) {
                System.out.println("Salgado(" + i + "): " + salgados[i].nome);
            }
        }
    }
}
