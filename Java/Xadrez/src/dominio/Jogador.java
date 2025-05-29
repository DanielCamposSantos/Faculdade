package dominio;

public enum Jogador {
    BRANCO("\u001B[38;2;255;253;230m",-1),
    PRETO("\u001B[38;2;40;40;40m",1);
	

    private String corTexto;
    public int orientacao;
    private final String RESET = "\u001B[0m";

    Jogador(String corTexto,int orientacao){
    	this.corTexto = corTexto;
        this.orientacao = orientacao;
    }
    
    
    
    
    
    public String colorirFundo(String texto) {
    	return corTexto + texto + RESET;
    }


}
