import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int op1, op2;

        Zumbi zumbi1 = new Zumbi();
        Zumbi zumbi2 = new Zumbi();
        Zumbi zumbi3 = new Zumbi();

        System.out.print("Vida para Zumbi1, maximo 100: ");
        zumbi1.vida = entrada.nextInt();
        System.out.print("Vida para Zumbi2, maximo 100: ");
        zumbi2.vida = entrada.nextInt();
        System.out.print("Vida para Zumbi3, maximo 100: ");
        zumbi3.vida = entrada.nextInt();

        entrada.nextLine();

        System.out.print("Quantidade de ataque para Zumbi1, maximo 100: ");
        zumbi1.ataque = entrada.nextInt();
        System.out.print("Quantidade de ataque para Zumbi2, maximo 100: ");
        zumbi2.ataque = entrada.nextInt();
        System.out.print("Quantidade de ataque para Zumbi3, maximo 100: ");
        zumbi3.ataque = entrada.nextInt();

        System.out.println();

        System.out.println("Vamos começar o jogo!!!");
        System.out.println("Unica regra, derrotar os outros Zumbis.");
        System.out.println("Qual Zumbi você gostaria de ser, 1-(Zumbi1) , 2-(Zumbi2) , 3-(Zumbi3): ");

        op1 = entrada.nextInt();

        switch (op1) {
            case 1 -> {
                System.out.println("Você escolheu o Zumbi1!");
                System.out.println("Vida: " + zumbi1.vida);
                System.out.println("Ataque: " + zumbi1.ataque);
            }
            case 2 -> {
                System.out.println("Você escolheu o Zumbi2!");
                System.out.println("Vida: " + zumbi2.vida);
                System.out.println("Ataque: " + zumbi2.ataque);
            }
            case 3 -> {
                System.out.println("Você escolheu o Zumbi3.");
                System.out.println("Vida: " + zumbi3.vida);
                System.out.println("Ataque: " + zumbi3.ataque);
            }
        }

        if (op1 == 1) {
            System.out.println("Qual Zumbi deseja batalhar, 1-(Zumbi2) , 2-(Zumbi3): ");
            op2 = entrada.nextInt();
            if (op2 == 1) {
                if (zumbi1.ataque > zumbi2.ataque)
                    System.out.println("Parabéns você ganhou a batalha!!!");
                else
                    System.out.println("DERROTA!!!");

            } else if (op2 == 2) {
                if (zumbi1.ataque > zumbi3.ataque)
                    System.out.println("Parabéns você ganhou a batalha!!!");
                else
                    System.out.println("DERROTA!!!");

            }
        } else if (op1 == 2) {
            System.out.println("Qual Zumbi deseja batalhar, 1-(Zumbi1) , 2-(Zumbi3): ");
            op2 = entrada.nextInt();
            if (op2 == 1) {
                if (zumbi2.ataque > zumbi1.ataque)
                    System.out.println("Parabéns você ganhou a batalha!!!");
                else
                    System.out.println("DERROTA!!!");
            } else if (op2 == 2) {
                if (zumbi2.ataque > zumbi3.ataque)
                    System.out.println("Parabéns você ganhou a batalha!!!");
                else
                    System.out.println("DERROTA!!!");
            }
        } else if (op1 == 3) {
            System.out.println("Qual Zumbi deseja batalhar, 1-(Zumbi2) , 2-(Zumbi3): ");
            op2 = entrada.nextInt();
            if (op2 == 1) {
                if (zumbi3.ataque > zumbi1.ataque) {
                    System.out.println("Parabéns você ganhou a batalha!!!");
                } else
                    System.out.println("DERROTA!!!");
            } else if (op2 == 2) {
                if (zumbi3.ataque > zumbi2.ataque) {
                    System.out.println("Parabéns você ganhou a batalha!!!");
                } else
                    System.out.println("DERROTA!!!");
            }
        }
    }
}

