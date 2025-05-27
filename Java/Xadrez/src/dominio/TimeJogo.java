package dominio;

public enum TimeJogo {
    BRANCO{
        @Override
        public int sentidoPeca() {
            return -1;
        }
    },
    PRETO{
        @Override
        public int sentidoPeca() {
            return 1;
        }
    };
    public abstract int sentidoPeca();
}
