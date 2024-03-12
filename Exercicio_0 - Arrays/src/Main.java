public class Main {
    public static void main(String[] args) {

        Cantina cantina = new Cantina();
        cantina.nome = "Cantina do Inatel";

        Salgado salgado1 = new Salgado();
        salgado1.nome = "Pastel";
        cantina.addSalgado(salgado1);

        Salgado salgado2 = new Salgado();
        salgado2.nome = "Coxinha";
        cantina.addSalgado(salgado2);

        Salgado salgado3 = new Salgado();
        salgado3.nome = "Esfirra";
        cantina.addSalgado(salgado3);

        cantina.mostraInfo();


    }
}