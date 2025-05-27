package dominio;

public enum TipoPeca {
	PEAO(" ♟ "),
    CAVALO(" ♞ "),
    BISPO(" ♝ "),
    TORRE(" ♜ "),
    RAINHA(" ♛ "),
    REI(" ♚ ");
    
	private String representacao;
	
	
	TipoPeca(String representacao) {
		this.representacao = representacao;
		
	}
	
	public String getRepresentacao(Jogador jogador) {
		return jogador.colorirFundo(representacao);
	}
}
