package dominio;


public class Peca {
    private final TipoPeca tipoPeca;
    private final Jogador jogador;
    protected int quantidadeMovimentos = 0;


    public Peca(TipoPeca tipoPeca, Jogador jogador) {
        this.tipoPeca = tipoPeca;
        this.jogador = jogador;

    }



    public String getTipoPeca() {
    	return this.tipoPeca.getRepresentacao(jogador);
    }

    public Jogador getJogador() {
        return jogador;
    }

    

       



}
