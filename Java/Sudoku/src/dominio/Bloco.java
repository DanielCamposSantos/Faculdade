package dominio;

import java.util.Random;

public class Bloco {
    private final int[][] bloco = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
    };

    public Bloco() {
        randomizarBloco();
    }

    private void randomizarBloco(){
        Random random = new Random();
        int aux;
        int linhaAleatoria;
        int colunaAleatoria;

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                linhaAleatoria = random.nextInt(3);
                colunaAleatoria = random.nextInt(3);

                aux = bloco[linha][coluna];
                bloco[linha][coluna] = bloco[linhaAleatoria][colunaAleatoria];
                bloco[linhaAleatoria][colunaAleatoria] = aux;
            }

        }
    }

    public void exibirBloco(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + bloco[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int getValor(int i, int j) {
        return bloco[i][j];
    }
}
