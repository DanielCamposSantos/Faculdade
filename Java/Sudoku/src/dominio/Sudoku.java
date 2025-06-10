package dominio;

public class Sudoku {
    Bloco[][] blocos = new Bloco[3][3];

    public Sudoku() {
        criarBlocos();
    }


    private void criarBlocos() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                blocos[i][j] = new Bloco();
            }
        }
    }


    public void corrigirLinhas(){
        int[] blocoAtual=  new int[3];
        int[] valorAtual =  new int[9];
    }


    public void exibirJogo() {
        for (int linhaGrande = 0; linhaGrande < 3; linhaGrande++) {
            for (int linhaPequena = 0; linhaPequena < 3; linhaPequena++) {
                for (int colunaGrande = 0; colunaGrande < 3; colunaGrande++) {
                    for (int colunaPequena = 0; colunaPequena < 3; colunaPequena++) {
                        System.out.print(" " + blocos[linhaGrande][colunaGrande].getValor(linhaPequena, colunaPequena) + " ");
                    }
                    System.out.print(" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}


