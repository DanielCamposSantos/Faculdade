package test;

import dominio.Jogador;
import dominio.Peca;
import dominio.Tabuleiro;
import dominio.TipoPeca;

public class TabuleiroTest01 {
    public static void main(String[] args) {
        Tabuleiro tabuleiro1 = new Tabuleiro();
       
        tabuleiro1.exibir();


        System.out.println(
                tabuleiro1.getPeca(1,0).getTipoPecaObject().isLinear(1,0,2,0,tabuleiro1)

        );





    }
}
