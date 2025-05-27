package dominio;

public enum Jogador {
    BRANCO("\u001B[38;2;255;253;230m"){
        @Override
        public int sentidoPeca() {
            return -1;
        }
    },
    PRETO("\u001B[38;2;40;40;40m"){
        @Override
        public int sentidoPeca() {
            return 1;
        }
    };
	

    private String corTexto;
    private final String RESET = "\u001B[0m";

    Jogador(String corTexto){
    	this.corTexto = corTexto;
    }
    
    
    
    
    
    public String colorirFundo(String texto) {
    	return corTexto + texto + RESET;
    }
    
    public abstract int sentidoPeca();
}
