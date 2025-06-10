package dominio;

public enum TipoPeca {
	PEAO(" ♟ ") {
		@Override
		public boolean movimentoValido(int linhaInicial, int colunaInicial, int linhaAlvo, int colunaAlvo, Tabuleiro tabuleiro) {
			if(colunaAlvo != colunaInicial) {
				
				int passoLinha = Integer.compare(linhaAlvo, linhaInicial);
				int passoColuna = Integer.compare(colunaAlvo,colunaInicial);
				int linhaAtual = linhaInicial + passoLinha;
				int colunaAtual = colunaInicial + passoColuna;
				
				
				if(tabuleiro.isVazio(linhaAtual, colunaAtual)) return false;
				
			}
			
			
			int passoLinha = Integer.compare(linhaAlvo, linhaInicial);
			int linhaAtual = linhaInicial + passoLinha;
		
			
					
			while (linhaAtual != linhaAlvo) {
				if (!tabuleiro.isVazio(linhaAtual, colunaInicial))
					return false;
				linhaAtual += passoLinha;
				
			}
			
			
			
			
			
			return true;
		}
	},
	CAVALO(" ♞ ") {
		@Override
		public boolean movimentoValido(int linhaInicial, int colunaInicial, int linhaAlvo, int colunaAlvo, Tabuleiro tabuleiro) {
			int passoLinha = Math.abs(linhaInicial - linhaAlvo);
			int passoColuna = Math.abs(colunaInicial - colunaAlvo);
			int somaPosicoes = Math.abs(passoLinha + passoColuna);
				
			return (somaPosicoes == 3);
			
		}
	},
	BISPO(" ♝ ") {
		@Override
		public boolean movimentoValido(int linhaInicial, int colunaInicial, int linhaAlvo, int colunaAlvo, Tabuleiro tabuleiro) {
			return isDiagonal(linhaInicial, colunaInicial, linhaAlvo, colunaAlvo, tabuleiro);
		}
	},
	TORRE(" ♜ ") {
		@Override
		public boolean movimentoValido(int linhaInicial, int colunaInicial, int linhaAlvo, int colunaAlvo, Tabuleiro tabuleiro) {
			return isLinear(linhaInicial, colunaInicial, linhaAlvo, colunaAlvo, tabuleiro);
		}
	},
	RAINHA(" ♛ ") {
		@Override
		public boolean movimentoValido(int linhaInicial, int colunaInicial, int linhaAlvo, int colunaAlvo, Tabuleiro tabuleiro) {
			return isLinear(linhaInicial, colunaInicial, linhaAlvo, colunaAlvo, tabuleiro)
					|| isDiagonal(linhaInicial, colunaInicial, linhaAlvo, colunaAlvo, tabuleiro);
		}
	},
	REI(" ♚ ") {
		@Override
		public boolean movimentoValido(int linhaInicial, int colunaInicial, int linhaAlvo, int colunaAlvo, Tabuleiro tabuleiro) {

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

	public abstract boolean movimentoValido(int linhaInicial, int colunaInicial, int linhaAlvo, int colunaAlvo,
			Tabuleiro tabuleiro);

	public boolean isLinear(int linhaInicial, int colunaInicial, int linhaAlvo, int colunaAlvo, Tabuleiro tabuleiro) {
		if (linhaInicial != linhaAlvo && colunaInicial != colunaAlvo)
			return false;

		int passoLinha = Integer.compare(linhaAlvo, linhaInicial);
		int passoColuna = Integer.compare(colunaAlvo, colunaInicial);

		int linhaAtual = linhaInicial + passoLinha;
		int colunaAtual = colunaInicial + passoColuna;

		while (linhaAtual != linhaAlvo || colunaAtual != colunaAlvo) {
			if (!tabuleiro.isVazio(linhaAtual, colunaAtual))
				return false;

			linhaAtual += passoLinha;
			colunaAtual += passoColuna;
		}

		return true;
	}

	public boolean isDiagonal(int linhaInicial, int colunaInicial, int linhaAlvo, int colunaAlvo, Tabuleiro tabuleiro) {
		if (linhaInicial == linhaAlvo || colunaInicial == colunaAlvo)
			return false;

		int passoLinha = Integer.compare(linhaAlvo, linhaInicial);
		int passoColuna = Integer.compare(colunaAlvo, colunaInicial);

		int linhaAtual = linhaInicial + passoLinha;
		int colunaAtual = colunaInicial + passoColuna;

		while (linhaAtual != linhaAlvo || colunaAtual != colunaAlvo) {
			if (!tabuleiro.isVazio(linhaAtual, colunaAtual))
				return false;

			linhaAtual += passoLinha;
			colunaAtual += passoColuna;
		}

		return true;
	}
}
