package dominio;


public class Tabuleiro {
    private Peca[][] tabuleiro = new Peca[8][8];
    private final String ESPACO_GRANDE = "\u3000";
    private final String ESPACO_PEQUENO = "\u202F";
    private final String FUNDO_CASA_CLARA = "\u001B[48;2;240;217;181m";  // Bege claro tradicional
    private final String FUNDO_CASA_ESCURA = "\u001B[48;2;181;136;99m";
    private final String RESET = "\u001B[0m";

    public Peca getPeca(int x, int y) {
        return tabuleiro[x][y];
    }

    public void setPeca(int x, int y,Peca peca) {
        tabuleiro[x][y] = peca;
    }


    private Peca[] criarNobres(Jogador jogador) {
        Peca[] peoes = new Peca[8];

        peoes[0] = new Peca(TipoPeca.TORRE, jogador);
        peoes[1] = new Peca(TipoPeca.CAVALO, jogador);
        peoes[2] = new Peca(TipoPeca.BISPO, jogador);
        peoes[4] = new Peca(TipoPeca.RAINHA, jogador);
        peoes[3] = new Peca(TipoPeca.REI, jogador);
        peoes[5] = new Peca(TipoPeca.BISPO, jogador);
        peoes[6] = new Peca(TipoPeca.CAVALO, jogador);
        peoes[7] = new Peca(TipoPeca.TORRE, jogador);

        return peoes;
    }

    private Peca[] criarPeao(Jogador jogador) {
        Peca[] peoes = new Peca[8];
        for (int i = 0; i < 8; i++) {
            peoes[i] = new Peca(TipoPeca.PEAO, jogador);
        }
        return peoes;
    }

    public Tabuleiro() {
        Peca[] peoesPretos = criarPeao(Jogador.PRETO);
        Peca[] peoesBrancos = criarPeao(Jogador.BRANCO);
        Peca[] nobresPretos = criarNobres(Jogador.PRETO);
        Peca[] nobresBrancos = criarNobres(Jogador.BRANCO);


        for (int linha = 0; linha < 8; linha++) {
            for (int coluna = 0; coluna < 8; coluna++) {
                switch (linha) {
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

    public Tabuleiro(int x, int y) {
        Peca[] peoesPretos = criarPeao(Jogador.PRETO);
        Peca[] peoesBrancos = criarPeao(Jogador.BRANCO);
        Peca[] nobresPretos = criarNobres(Jogador.PRETO);
        Peca[] nobresBrancos = criarNobres(Jogador.BRANCO);


        for (int linha = 0; linha < 8; linha++) {
            for (int coluna = 0; coluna < 8; coluna++) {
                switch (linha) {
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

                if (linha != x || coluna != y) {
                    tabuleiro[linha][coluna] = null;
                }
            }


        }


    }


    private String repetir(String texto, int quantidade) {
        return texto + texto.repeat(Math.max(0, quantidade - 1));
    }


    public void exibir() {
        char[] letras = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};


        System.out.print(repetir(" ", 5) + ESPACO_PEQUENO);

        for (char letra : letras) {
            System.out.print(letra + ESPACO_GRANDE + repetir(ESPACO_PEQUENO, 2));
        }
        System.out.println();


        for (int linha = 0; linha < 8; linha++) {
            System.out.print(linha + 1 + " - ");
            for (int coluna = 0; coluna < 8; coluna++) {
                if (tabuleiro[linha][coluna] == null) {
                    if (linha % 2 == 0 ^ coluna % 2 == 0) {
                        System.out.print(FUNDO_CASA_CLARA + " " + ESPACO_GRANDE + " " + RESET);
                    } else {
                        System.out.print(FUNDO_CASA_ESCURA + " " + ESPACO_GRANDE + " " + RESET);
                    }

                } else {
                    if (linha % 2 == 0 ^ coluna % 2 == 0) {
                        System.out.print(FUNDO_CASA_CLARA + tabuleiro[linha][coluna].getTipoPeca() + RESET);
                    } else {
                        System.out.print(FUNDO_CASA_ESCURA + tabuleiro[linha][coluna].getTipoPeca() + RESET);
                    }

                }

            }
            System.out.println();

        }

    }

    public boolean isVazio(int x, int y) {
        return tabuleiro[x][y] == null;
    }

    public boolean jogadorArversario(int linhaInicial, int colunaInicial, int linhaAlvo, int colunaAlvo){
        if (isVazio(linhaAlvo,colunaAlvo)) return false;



        return tabuleiro[linhaInicial][colunaInicial].getJogador() != tabuleiro[linhaAlvo][linhaAlvo].getJogador();
    }

    public void mover(int linhaInicial, int colunaInicial, int linhaAlvo, int colunaAlvo,Tabuleiro tab){
        try {
            Peca selecionada = tabuleiro[linhaInicial][colunaInicial];
            TipoPeca tipoSelecionada = selecionada.getTipoPecaObject();
            boolean movimentoValido = tipoSelecionada.movimentoValido(linhaInicial,colunaInicial,linhaAlvo,colunaAlvo,tab);
            boolean adversario = jogadorArversario(linhaInicial,colunaInicial,linhaAlvo,colunaAlvo);
            Peca alvo = tabuleiro[linhaAlvo][colunaAlvo];

            if (movimentoValido && movimentoValido){
                tabuleiro[linhaAlvo][colunaAlvo] = selecionada;
                tabuleiro[linhaInicial][colunaInicial] = null;
            }


        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}
