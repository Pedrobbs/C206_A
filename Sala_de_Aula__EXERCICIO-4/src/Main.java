import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num_alunos; // Numero de alunos matriculados
        int sala16 = 0; // contador para sala I-16
        int sala22 = 0; // contador para sala I-22
        int nenhuma_sala = 0; // quando a sala não for encontrada
        int op;

        System.out.println("Digite a quantidade de alunos: ");
        num_alunos = entrada.nextInt();
        for (int i = 0; i < num_alunos; i++) {
            System.out.println("Escolha a sala que deseja ir: ");
            System.out.println("(10, 20) -> Sala I-16  ,  (30) -> Sala I-20");
            op = entrada.nextInt();
            switch (op) {
                case 10:
                case 20:
                    sala16++;
                    break;
                case 30:
                    sala22++;
                    break;
                default:
                    System.out.println("Nenhuma sala encontrada, digite novamente: ");
                    nenhuma_sala++;
                    break;
            }
        }

        System.out.println("Quantidade de alunos na Sala I-16: " + sala16);
        System.out.println("Quantidade de alunos na Sala I-22: " + sala22);
        System.out.println("Alunos perdidos: " + nenhuma_sala);

        entrada.close();
    }
}
