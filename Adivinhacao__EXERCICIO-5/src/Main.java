import java.util.Random;
import java.util.Scanner;
    
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();

        int x = rand.nextInt(10) + 1; // Gera numero entre 1 e 10
        int valor;

        do {
            System.out.print("Digite um numero de 1 a 10: ");
            valor = entrada.nextInt();

            if (valor != x) {
                System.out.println("Voce errou, tente novamente!");
                System.out.println("Numero Gerado: " + x);
                System.out.println("Numero Digitado: " + valor);

                System.out.print("Digite novamente: ");
                valor = entrada.nextInt();
            }
        } while (valor != x);
        System.out.println();
        System.out.println("VOCE ACERTOU!!!");
        System.out.println("Numero Gerado: " + x);
        System.out.println("Numero Digitado: " + valor);

        entrada.close();
    }
}