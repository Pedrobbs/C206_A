public class Twitter extends RedeSocial implements Compartilhamento{
    public Twitter(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Twitter!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um vídeo no Twitter!");
    }

    public void compartilhar() {
        System.out.println("Compartilhou um post no Twitter!");
    }

    public void us() {
        System.out.println("Usou o Twitter!");
    }

    @Override
    public void Compartilar() {
        System.out.println("Postou uma foto no Twitter!");
    }
}
