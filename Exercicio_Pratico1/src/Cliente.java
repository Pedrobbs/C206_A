public class Cliente {
    public String nome;
    public long cpf;

    Computador[] computador = new Computador[10];

    public Cliente() {
        
    }

    public void calculaTotalCompra() {
        float custo = 0;
        for (int i = 0; i < computador.length; i++) {
            if (computador[i] != null) {
                custo = custo + computador[i].preco;
            }
            break;
        }
    }

    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
}
