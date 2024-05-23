import java.util.HashSet;

public class Usuario {
    private String nome;
    private String email;
    private HashSet<RedeSocial> redesSociais;

    public Usuario(String nome, String email, RedeSocial... redesSociais) {
        this.nome = nome;
        this.email = email;
        this.redesSociais = new HashSet<>();
        for (RedeSocial redeSocial : redesSociais) {
            this.redesSociais.add(redeSocial);
        }
    }

    public void usarRedesSociais() {
        for (RedeSocial redeSocial : redesSociais) {
            try {
                if (redeSocial instanceof Facebook) {
                    ((Facebook) redeSocial).postarFoto();
                    ((Facebook) redeSocial).postarVideo();
                    ((Facebook) redeSocial).fazStreaming();
                } else if (redeSocial instanceof GooglePlus) {
                    ((GooglePlus) redeSocial).postarFoto();
                    ((GooglePlus) redeSocial).postarVideo();
                    ((GooglePlus) redeSocial).postarComentario();
                } else if (redeSocial instanceof Twitter) {
                    ((Twitter) redeSocial).postarFoto();
                    ((Twitter) redeSocial).postarVideo();
                    ((Twitter) redeSocial).compartilhar();
                } else if (redeSocial instanceof Instagram) {
                    ((Instagram) redeSocial).postarFoto();
                    ((Instagram) redeSocial).postarVideo();
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}
