import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int aux;

        Computador[] promoçao = new Computador[3];
        promoçao[0] = new Computador("Positivo", 2300);
        promoçao[1] = new Computador("Acer", 5800);
        promoçao[2] = new Computador("Vaio", 1800);

        HardwareBasico hardwareBasico_1 = new HardwareBasico();
        HardwareBasico hardwareBasico_2 = new HardwareBasico();
        HardwareBasico hardwareBasico_3 = new HardwareBasico();

        promoçao[0].hardwareBasico[0] = hardwareBasico_1;
        promoçao[1].hardwareBasico[1] = hardwareBasico_2;
        promoçao[2].hardwareBasico[2] = hardwareBasico_3;

        // Promoção 1
        promoçao[0].hardwareBasico[0].nome = "Pentium Core I3 (2200 Mhz), 8gb de memoria RAM, 500GB de HD";
        promoçao[0].sistemaOperacional.nome = "Linux";
        promoçao[0].sistemaOperacional.tipo = 32;
        promoçao[0].memoriaUSB.nome = "Acompanha Pen-drive";
        promoçao[0].memoriaUSB.capacidade = 16;

        // Promoção 2
        promoçao[1].hardwareBasico[1].nome = "Pentium Core I5 (3370 Mhz), 16gb de memoria RAM, 1Tb de HD";
        promoçao[1].sistemaOperacional.nome = "Windows 8";
        promoçao[1].sistemaOperacional.tipo = 64;
        promoçao[1].memoriaUSB.nome = "Acompanha Pen-drive";
        promoçao[1].memoriaUSB.capacidade = 32;

        // Promoção 3
        promoçao[2].hardwareBasico[2].nome = "Pentium Core I7 (4500 Mhz), 32gb de memoria RAM, 2Tb de HD";
        promoçao[2].sistemaOperacional.nome = "Windows 10";
        promoçao[2].sistemaOperacional.tipo = 64;
        promoçao[2].memoriaUSB.nome = "Acompanha HD Externo";
        promoçao[2].memoriaUSB.capacidade = 1;

        while (true) {
            System.out.println("Promoção 1: Marca Positivo, preço R$2300, configurações: Pentium Core I3(2200 Mhz), 8gb de Memória RAM,500gb de HD,Sistema Operacional Linux (32 bits) e acompanha Pen-drive de 16Gb");
            System.out.println("Promoção 2: Marca Acer, preço R$5800, configurações: Pentium Core I5(3370 Mhz), 16gb de Memória RAM,1Tb de HD,Sistema Operacional Windows 8 (64 bits) e acompanha Pen-drive de 32Gb");
            System.out.println("Promoção 3: Marca Vaio, preço R$1800, configurações: Pentium Core I7(4500 Mhz), 32gb de Memória RAM,2Tb de HD,Sistema Operacional Windows 10 (64 bits) e acompanha HD externo 1Tb");
            System.out.println();
            System.out.println("Qual promoção você gostaria:  (1)Promoção-1  (2)Promoção-2  (3)Promoção-3  (0)Sair do Programa");
            System.out.print("Digite aqui:");
            aux = entrada.nextInt();
            System.out.println();

            System.out.println("Configuração escolhida: ");
            if (aux == 1) {
                promoçao[0].mostraPCConfigs();
                System.out.println();
            }
            if (aux == 2) {
                promoçao[1].mostraPCConfigs();
                System.out.println();
            }
            if (aux == 3) {
                promoçao[2].mostraPCConfigs();
                System.out.println();
            }
            if (aux == 0) {
                System.out.println("Saindo do programa");
                break;
            }
        }
    }
}
