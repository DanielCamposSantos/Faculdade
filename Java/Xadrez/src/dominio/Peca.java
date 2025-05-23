package dominio;

public class Peca {
    private TipoPeca tipoPeca;
    private TimeJogo time;

    public Peca(TipoPeca tipoPeca, TimeJogo time) {
        this.tipoPeca = tipoPeca;
        this.time = time;
    }

    public TipoPeca getTipoPeca() {
        return tipoPeca;
    }

    public TimeJogo getTime() {
        return time;
    }
}
