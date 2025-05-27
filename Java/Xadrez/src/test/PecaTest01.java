package test;

import dominio.Peca;
import static dominio.TipoPeca.*;
import static dominio.Jogador.*;

public class PecaTest01 {
    public static void main(String[] args) {
        Peca peca = new Peca(PEAO,BRANCO);
        
        System.out.println(peca.getTipoPeca());
    }
}
