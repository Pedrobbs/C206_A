public abstract class RedeSocial {
    private String senha;
    private int numAmigos;

    public RedeSocial(String senha, int numAmigos) {
        this.senha = senha;
        this.numAmigos = numAmigos;
    }

    public abstract void postarFoto();

    public abstract void postarVideo();
}
