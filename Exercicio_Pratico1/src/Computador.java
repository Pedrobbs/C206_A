public class Computador {
    public String marca;
    public float preco;

    SistemaOperacional sistemaOperacional = new SistemaOperacional();
    MemoriaUSB memoriaUSB = new MemoriaUSB();
    HardwareBasico[] hardwareBasico = new HardwareBasico[10];

    public void mostraPCConfigs() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$" + preco);
        System.out.println("Sistema Operacional(Nome/Tipo): " + sistemaOperacional.nome + " / " + sistemaOperacional.tipo + " bits");
        System.out.println("Memoria(Modelo/Capacidade): " + memoriaUSB.nome + " / " + memoriaUSB.capacidade + " Gb de Memória RAM");

        for (int i = 0; i < hardwareBasico.length; i++) {
            if (hardwareBasico[i] != null) {
                System.out.println("Hardware(Nome/Capacidade): " + hardwareBasico[i].nome + "/" + hardwareBasico[i].capacidade);
            }
            break;
        }
    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        System.out.println("Memoria adicionada!");
    }

    public Computador(String marca, float preco) {
        this.marca = marca;
        this.preco = preco;
    }
}
