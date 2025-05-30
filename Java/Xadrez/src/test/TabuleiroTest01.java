package test;

import dominio.Jogador;
import dominio.Peca;
import dominio.Tabuleiro;
import dominio.TipoPeca;

public class TabuleiroTest01 {
    public static void main(String[] args) {
        Tabuleiro tabuleiro1 = new Tabuleiro(0,0);
       
        tabuleiro1.setPeca(5, 5, new Peca(TipoPeca.PEAO, Jogador.PRETO));
        tabuleiro1.setPeca(4, 4, new Peca(TipoPeca.PEAO, Jogador.PRETO));
        tabuleiro1.exibir();
        
        ;

        System.out.println(tabuleiro1.getPeca(5, 5).getTipoPecaObject().movimentoValido(5, 5, 4, 4, tabuleiro1));
    }
}
