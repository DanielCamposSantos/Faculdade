package test;

import dominio.Jogador;
import dominio.Peca;
import dominio.Tabuleiro;
import dominio.TipoPeca;

public class TabuleiroTest01 {
    public static void main(String[] args) {
        Tabuleiro tabuleiro1 = new Tabuleiro(0,0);
       
        tabuleiro1.setPeca(5, 5, new Peca(TipoPeca.PEAO, Jogador.PRETO));
        tabuleiro1.setPeca(4, 4, new Peca(TipoPeca.PEAO, Jogador.BRANCO));
        tabuleiro1.setPeca(6, 0, new Peca(TipoPeca.PEAO, Jogador.BRANCO));
        tabuleiro1.setPeca(0, 0, new Peca(TipoPeca.TORRE, Jogador.PRETO));
        tabuleiro1.exibir();



        tabuleiro1.mover(0,0,5,0,tabuleiro1);
        tabuleiro1.exibir();
    }
}
