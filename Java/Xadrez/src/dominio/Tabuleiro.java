package dominio;

import java.sql.Time;

public class Tabuleiro {
    private Peca[][] tabuleiro = new Peca[8][8];
    private Peca[] peoes = new Peca[8];

    private void criarPeoes(TimeJogo timeJogo){
        for (Peca peao:peoes) {
            peao = new Peca(TipoPeca.PEAO,timeJogo);
        }
    }




    public Tabuleiro() {




        for (int linha = 0; linha < 8; linha++) {
            for (int coluna = 0; coluna < 8; coluna++) {
                switch (linha){
                    case 0:

                        break;
                    case 1:
                        criarPeoes(TimeJogo.PRETO);


                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    default:
                        System.out.println(" ");
                }
            }
        }
    }

    public void exibir(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(tabuleiro);
            }
            System.out.println();
        }
    }


}
