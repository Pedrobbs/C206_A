import br.inatel.cdg.inimigo.Asteroide;
import br.inatel.cdg.jogador.Nave;
public class Main {
    public static void main(String[] args) {

        Nave nave1 = new Nave("Navinha1", 100, "Explosivo");
        Nave nave2 = new Nave("Navinha2", 100, "Normal");

        Asteroide ast1 = new Asteroide("Asteroide1", "Grande");
        Asteroide ast2 = new Asteroide("Asteroide2", "Pequeno");

        nave1.atira(ast1);  // Nave1 atirando com tiros esplosivos no asteroide 1
        nave1.atira(ast2);  // Nave1 atirando com tiros explosivos no asteroide 2

        nave2.atira(ast1);  // Nave2 atirando com tiros normais no asteroide 1
        nave2.atira(ast2);  // Nave2 atirando com tiros normais no asteroide 2
    }
}
