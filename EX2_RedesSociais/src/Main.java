public class Main {
    public static void main(String[] args) {
        try {
            Usuario usuario = new Usuario("João", "joão@gmail.com",
                    new Facebook("123456", 100),
                    new GooglePlus("123456", 100),
                    new Twitter("123456", 100),
                    new Instagram("123456", 100));

            usuario.usarRedesSociais();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}