package br.inatel.cdg.jogador;

import br.inatel.cdg.inimigo.Asteroide;

public class Nave {
    private String nome;
    private double vida;
    private String tipoTiro;

    public Nave(String nome, double vida, String tipoTiro) {
        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tipoTiro;
    }

    public void atira(Asteroide ast) {
        if (tipoTiro == "Explosivo") {
            ast.destruir(); // tiro explosivo destroi qualquer asteroide
        } else {
            if (ast.getTipoAsteroide() == "Grande") {
                System.out.println("Não é possivel destruir o asteroide grande com tiros normais!!!");
            } else {
                ast.getTipoAsteroide(); // destruindo asteroide pequenos
            }
        }
    }
}
