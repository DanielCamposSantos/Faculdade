public class Processo {
    String id;
    int tempoChegada;
    int tempoExecucao;
    int tempoRestante;
    int tempoInicioExecucao;
    int tempoConclusao;
    int tempoEspera;


    public Processo(String id, int tempoChegada, int tempoExecucao) {
        this.id = id;
        this.tempoChegada = tempoChegada;
        this.tempoExecucao = tempoExecucao;
    }



}



