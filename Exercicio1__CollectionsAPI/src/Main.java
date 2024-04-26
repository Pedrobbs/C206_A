import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Double> listaDeDouble = new ArrayList<Double>();

        listaDeDouble.add(0.5);
        listaDeDouble.add(0.3);
        listaDeDouble.add(0.1);
        listaDeDouble.add(0.4);
        listaDeDouble.add(0.2);

        System.out.println("Valores desordenados: ");
        for (int i = 0; i < listaDeDouble.size(); i++) {
            System.out.println(listaDeDouble.get(i));
        }

        Collections.sort(listaDeDouble, new Comparator<Double>() { // colocando em ordem decrescente
            @Override
            public int compare(Double o1, Double o2) {
                return Double.compare(o2, o1); // saindo do menor para o maior
            }
        });

        System.out.println("Ordem decrescente: ");
        for (int i = 0; i < listaDeDouble.size(); i++) {
            System.out.println(listaDeDouble.get(i));
        }

    }
}