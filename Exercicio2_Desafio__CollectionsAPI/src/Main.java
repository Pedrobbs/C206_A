import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Classe_1> ListaDeClasse_1 = new ArrayList<Classe_1>();

        // instanciando classe filha Classe_2
        Classe_2 classe_2a = new Classe_2("Classe2a", 2);
        Classe_2 classe_2b = new Classe_2("Classe2b", 22);

        // instanciando classe filha Classe_3
        Classe_3 classe_3a = new Classe_3("Classe3a", 3);
        Classe_3 classe_3b = new Classe_3("Classe3b", 33);

        // instanciando classe filha Classe_4
        Classe_4 classe_4a = new Classe_4("Classe_4a", 4);
        Classe_4 classe_4b = new Classe_4("Classe_4b", 44);

        ListaDeClasse_1.add(classe_2a);
        ListaDeClasse_1.add(classe_2b);
        ListaDeClasse_1.add(classe_3a);
        ListaDeClasse_1.add(classe_3b);
        ListaDeClasse_1.add(classe_4a);
        ListaDeClasse_1.add(classe_4b);

        Collections.sort(ListaDeClasse_1);

        for (int i = 0; i < ListaDeClasse_1.size(); i++) {
            System.out.println(ListaDeClasse_1.get(i).idade);
        }
    }
}