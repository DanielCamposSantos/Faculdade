package test;

import  dominio.Peca;
import static dominio.TipoPeca.*;
import static dominio.TimeJogo.*;


public class PecaTest01 {
    public static void main(String[] args) {
        Peca peca = new Peca(BISPO,BRANCO);
        System.out.println(peca.getTipoPeca());
        System.out.println(peca.getTime());
    }
}
