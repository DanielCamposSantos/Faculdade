package dominio;

public class Tabuleiro {
    private Peca[][] tabuleiro = new Peca[8][8];

    public void exibir(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(tabuleiro);
            }
            System.out.println();
        }
    }


}
