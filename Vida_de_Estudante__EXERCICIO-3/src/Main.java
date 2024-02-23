import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int NPA;
        int NP3;

        System.out.print("Digite a nota da NPA: ");
        NPA = entrada.nextInt();

        if (NPA >= 60) {
            System.out.println("Voce passou de ano, parabens!!!");
        } else {
            System.out.println("Voce ficou de recuperacao!!!");
            System.out.print("Digite a nota da NP3: ");
            NP3 = entrada.nextInt();

            double nota_final = (NPA + NP3) / 2.;

            if (nota_final >= 50)
                System.out.println("Aluno APROVADO");
            else
                System.out.println("Aluno REPROVADO");


        }
    }
}