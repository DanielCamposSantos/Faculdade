package dominio;


import java.util.Arrays;

public class Tabuleiro {
    private Peca[][] tabuleiro = new Peca[8][8];

    private final String ESPACO = " \u3000 ";

    private final String FUNDO_CASA_CLARA = "\u001B[48;2;240;217;181m";  // Bege claro tradicional
    private final String FUNDO_CASA_ESCURA = "\u001B[48;2;181;136;99m";
    private final String RESET = "\u001B[0m";



    private Peca[] criarNobres(TimeJogo time){
        Peca[] peoes = new Peca[8];

        peoes[0] = new Peca(TipoPeca.TORRE,time);
        peoes[1] = new Peca(TipoPeca.CAVALO,time);
        peoes[2] = new Peca(TipoPeca.BISPO,time);
        peoes[4] = new Peca(TipoPeca.RAINHA,time);
        peoes[3] = new Peca(TipoPeca.REI,time);
        peoes[5] = new Peca(TipoPeca.BISPO,time);
        peoes[6] = new Peca(TipoPeca.CAVALO,time);
        peoes[7] = new Peca(TipoPeca.TORRE,time);

        return peoes;
    }

    private Peca[] criarPeao(TimeJogo time){
        Peca[] peoes = new Peca[8];
        for (int i = 0; i < 8; i++) {
            peoes[i] = new Peca(TipoPeca.PEAO,time);
        }
        return peoes;
    }



    public Tabuleiro() {
        Peca[] peoesPretos = criarPeao(TimeJogo.PRETO);
        Peca[] peoesBrancos = criarPeao(TimeJogo.BRANCO);
        Peca[] nobresPretos = criarNobres(TimeJogo.PRETO);
        Peca[] nobresBrancos = criarNobres(TimeJogo.BRANCO);


        for (int linha = 0; linha < 8; linha++) {
            for (int coluna = 0; coluna < 8; coluna++) {
                switch (linha){
                    case 0:
                        tabuleiro[linha][coluna] = nobresPretos[coluna];
                        break;
                    case 1:
                        tabuleiro[linha][coluna] = peoesPretos[coluna];
                        break;
                    case 6:
                        tabuleiro[linha][coluna] = peoesBrancos[coluna];
                        break;
                    case 7:
                        tabuleiro[linha][coluna] = nobresBrancos[coluna];
                        break;
                    default:
                        tabuleiro[linha][coluna] = null;
                }
            }
        }
    }



    public void imprimirPeca(int linha,int coluna){
        if (tabuleiro[linha][coluna] == null){
            System.out.println("[  "+ ESPACO +"  ]");
        } else{

            System.out.println("[" + tabuleiro[linha][coluna].getTimePeca() + "]");
        }
    }



    public void exibir(){

        for (int linha = 0; linha < 8; linha++) {
            for (int coluna = 0; coluna < 8; coluna++) {
                if (tabuleiro[linha][coluna] == null){
                    if (linha%2 == 0 ^ coluna % 2 == 0){
                        System.out.print(FUNDO_CASA_CLARA + ESPACO + RESET);
                    } else {
                        System.out.print(FUNDO_CASA_ESCURA + ESPACO + RESET);
                    }

                } else{
                    if (linha%2 == 0 ^ coluna % 2 == 0){
                        System.out.print(FUNDO_CASA_CLARA + tabuleiro[linha][coluna].getTimePeca() + RESET);
                    } else {
                        System.out.print(FUNDO_CASA_ESCURA + tabuleiro[linha][coluna].getTimePeca() + RESET);
                    }

                }

            }
            System.out.println();
        }
    }


}
