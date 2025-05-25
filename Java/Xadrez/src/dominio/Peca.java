package dominio;

import static dominio.TipoPeca.*;

public class Peca {
    private TipoPeca tipoPeca;
    private TimeJogo time;
    private final String TEXTO_BRANCO = "\u001B[38;2;255;253;230m";
    private final String TEXTO_PRETO = "\u001B[38;2;40;40;40m";
    private final String RESET = "\u001B[0m";


    public Peca(TipoPeca tipoPeca, TimeJogo time) {
        this.tipoPeca = tipoPeca;
        this.time = time;
    }

    public TipoPeca getTipoPeca() {
        return tipoPeca;
    }

    public TimeJogo getTime() {
        return time;
    }

    public String getTimePeca() {
        String saida = "";
        String corPeca = "";

        switch (time){
            case BRANCO -> {
                corPeca = TEXTO_BRANCO;
            }
            case PRETO -> {
                corPeca = TEXTO_PRETO;
            }
        }

        switch (tipoPeca){
            case PEAO -> {
                saida = " ♟ ";
            }
            case CAVALO -> {
                saida = " ♞ ";
            }
            case BISPO -> {
                saida = " ♝ ";
            }
            case TORRE -> {
                saida = " ♜ ";
            }
            case RAINHA -> {
                saida = " ♛ ";
            }
            case REI -> {
                saida = " ♚ ";
            }
        }


        return corPeca + saida +RESET;
    }


}
