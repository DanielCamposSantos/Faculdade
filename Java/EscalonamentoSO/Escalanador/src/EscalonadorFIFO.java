import java.util.List;

public class EscalonadorFIFO implements Escalonador{
    @Override
    public void simular(List<Processo> processos) {
        processos.sort((p1, p2) -> Integer.compare(p1.tempoChegada, p2.tempoChegada));
        int tempoConclusao = 0;
        for (Processo p : processos){
            p.tempoInicioExecucao = tempoConclusao;
            tempoConclusao += p.tempoExecucao;
            p.tempoConclusao = tempoConclusao;
            p.tempoEspera = p.tempoConclusao - p.tempoChegada - p.tempoExecucao;

        }


    }







}
