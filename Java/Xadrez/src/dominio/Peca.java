package dominio;


public class Peca {
    private final TipoPeca tipoPeca;
    private final Jogador jogador;
    protected int quantidadeMovimentos = 0;


    public Peca(TipoPeca tipoPeca, Jogador jogador) {
        this.tipoPeca = tipoPeca;
        this.jogador = jogador;

    }





    public TipoPeca getTipoPeca() {
        return tipoPeca;
    }

    public Jogador getJogador() {
        return jogador;
    }

    

       



}
