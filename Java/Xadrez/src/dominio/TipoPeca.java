package dominio;

public enum TipoPeca {
    PEAO(" ♟ ") {
        @Override
        public boolean movimentoValido(int xInicial, int yInicial, int xAlvo, int yAlvo, Tabuleiro tabuleiro) {
            return false;
        }
    },
    CAVALO(" ♞ ") {
        @Override
        public boolean movimentoValido(int xInicial, int yInicial, int xAlvo, int yAlvo, Tabuleiro tabuleiro) {
            return false;
        }
    },
    BISPO(" ♝ ") {
        @Override
        public boolean movimentoValido(int xInicial, int yInicial, int xAlvo, int yAlvo, Tabuleiro tabuleiro) {
            return false;
        }
    },
    TORRE(" ♜ ") {
        @Override
        public boolean movimentoValido(int xInicial, int yInicial, int xAlvo, int yAlvo, Tabuleiro tabuleiro) {
           return isLinear(xInicial, yInicial, xAlvo, yAlvo, tabuleiro);
        }
    },
    RAINHA(" ♛ ") {
        @Override
        public boolean movimentoValido(int xInicial, int yInicial, int xAlvo, int yAlvo, Tabuleiro tabuleiro) {
            return false;
        }
    },
    REI(" ♚ ") {
        @Override
        public boolean movimentoValido(int xInicial, int yInicial, int xAlvo, int yAlvo, Tabuleiro tabuleiro) {
            return false;
        }
    };

    private String representacao;


    TipoPeca(String representacao) {
        this.representacao = representacao;
    }

    public String getRepresentacao(Jogador jogador) {
        return jogador.colorirFundo(representacao);
    }

    public abstract boolean movimentoValido(int xInicial, int yInicial, int xAlvo, int yAlvo, Tabuleiro tabuleiro);

    public boolean isLinear(int linhaInicial, int colunaInicial, int linhaAlvo, int colunaAlvo, Tabuleiro tabuleiro) {
        if (linhaInicial != linhaAlvo && colunaInicial != colunaAlvo) return false;

        int passoLinha = Integer.compare(linhaAlvo,linhaInicial);
        int passoColuna = Integer.compare(colunaAlvo,colunaInicial);

        int linhaAtual = linhaInicial + passoLinha;
        int colunaAtual = colunaInicial + passoColuna;

        while(linhaAtual != linhaAlvo || colunaAtual != colunaAlvo){
            if (!tabuleiro.isVazio(linhaAtual,colunaAtual)) return false;

            linhaAtual += passoLinha;
            colunaAtual += passoColuna;
        }



        return true;
    }
}
