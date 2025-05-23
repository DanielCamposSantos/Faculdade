package test;

import dominio.Peca;
import static dominio.TipoPeca.*;
import static dominio.TimeJogo.*;

public class PecaTest01 {
    public static void main(String[] args) {
        Peca peca = new Peca(BISPO,BRANCO);

        System.out.println("TIPO DA PEÇA = " + peca.getTipoPeca());
        System.out.println("COR = " + peca.getTime());

        Peca peca1 = new Peca(PEAO);

        System.out.println(peca1.getTipoPeca());


        System.out.println();
        System.out.println("♙");
    }
}
