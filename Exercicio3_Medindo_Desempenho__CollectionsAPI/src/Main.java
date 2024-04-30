import java.util.*;

public class Main {

    public static void main(String[] args) {

        int aux = 100000;
        long TempoInicial, TempoFinal;

        List<Integer> listaInteria = new ArrayList<>();
        Set<Integer> hashSet = new HashSet<>();
        Map<Integer, Integer> mapadesempenho = new HashMap<>();

        // Inserindo na Lista
        TempoInicial = System.currentTimeMillis();
        for (int i = 0; i < aux; i++) {
            listaInteria.add(i);
        }
        TempoFinal = System.currentTimeMillis();
        System.out.println("Tempo para inserir na Lista: " + (TempoFinal - TempoInicial) + "ms");

        // Buscando na Lista
        TempoInicial = System.currentTimeMillis();
        for (int i = 0; i < aux; i++) {
            listaInteria.contains(i);
        }
        TempoFinal = System.currentTimeMillis();
        System.out.println("Tempo para buscar na Lista: " + (TempoFinal - TempoInicial) + "ms");

        System.out.println();

        // Inserindo no HashSet
        TempoInicial = System.currentTimeMillis();
        for (int i = 0; i < aux; i++) {
            hashSet.add(i);
        }
        TempoFinal = System.currentTimeMillis();
        System.out.println("Tempo para inserir no HashSet: " + (TempoFinal - TempoInicial) + "ms");

        // Buscando na HashSet
        TempoInicial = System.currentTimeMillis();
        for (int i = 0; i < aux; i++) {
            hashSet.contains(i);
        }
        TempoFinal = System.currentTimeMillis();
        System.out.println("Tempo para buscar na HashSet: " + (TempoFinal - TempoInicial) + "ms");

        System.out.println();

        // Inserindo em HashMap
        TempoInicial = System.currentTimeMillis();
        for (int i = 0; i < aux; i++) {
            mapadesempenho.put(i, i);
        }
        TempoFinal = System.currentTimeMillis();
        System.out.println("Tempo para inserir no HashMap: " + (TempoFinal - TempoInicial) + "ms");

        // Buscando na HashMap
        TempoInicial = System.currentTimeMillis();
        for (int i = 0; i < aux; i++) {
            mapadesempenho.containsKey(i);
        }
        TempoFinal = System.currentTimeMillis();
        System.out.println("Tempo para buscar na HashMap: " + (TempoFinal - TempoInicial) + "ms");

    }

}