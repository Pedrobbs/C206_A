public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento {
    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    public void postarComentario() {
        System.out.println("Postou um comentário no GooglePlus!");
    }

    public void curtirPublicacao() {
        System.out.println("Curtiu uma publicação no GooglePlus!");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no GooglePlus!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um vídeo no GooglePlus!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Realizou uma video conferência no GooglePlus!");
    }

    @Override
    public void Compartilar() {
        System.out.println("Curtiu uma publicação na GooglePlus!");
    }
}
