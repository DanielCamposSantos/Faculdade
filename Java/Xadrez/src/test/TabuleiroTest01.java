package test;

import dominio.Jogador;
import dominio.Peca;
import dominio.Tabuleiro;
import dominio.TipoPeca;

public class TabuleiroTest01 {
    public static void main(String[] args) {
        Tabuleiro tabuleiro1 = new Tabuleiro(1,1);
       
        tabuleiro1.exibir();



        tabuleiro1.getPeca(1,1).getTipoPecaObject().isDiagonal(1,1,0,0,tabuleiro1);







    }
}
