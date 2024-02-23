import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor para o primeiro Lanche: ");
        int lanche1 = entrada.nextInt();
        System.out.print("Digite o valor para o segundo Lanche: ");
        int lanche2 = entrada.nextInt();
        System.out.print("Digite o valor para o terceiro Lanche: ");
        int lanche3 = entrada.nextInt();

        int total = (lanche1 + lanche2 + lanche3);
        float media = (total / 3.0f);

        System.out.println("Total: " + total);
        System.out.println("Media: " + media);

        entrada.close();
    }
}