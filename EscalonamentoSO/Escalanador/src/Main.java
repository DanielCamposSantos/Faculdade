import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Processo p1 = new Processo("P1", 0, 10);
        Processo p2 = new Processo("P2", 2, 5);
        Processo p3 = new Processo("P3", 4, 8);
        Processo p4 = new Processo("P4", 6, 4);

        List<Processo> processos = new ArrayList<>();
        processos.add(p1);
        processos.add(p2);
        processos.add(p3);
        processos.add(p4);

        EscalonadorFIFO escalonadorFIFO = new EscalonadorFIFO();
        escalonadorFIFO.simular(processos);
        imprimir(processos);
        System.out.println();
        simular(processos);

        for (int i = 0; i < 10; i++) {
            System.out.println();

        }

        EscalonadorSJF escalonadorSJF= new EscalonadorSJF();
        escalonadorSJF.simular(processos);
        imprimir(processos);
        System.out.println();
        simular(processos);


    }


    public static void simular(List<Processo> processos){
        double mediaRetorno = 0; 
        double mediaEspera = 0;

        for (Processo p : processos){
            int tempoRetorno = p.tempoConclusao - p.tempoChegada;
            mediaRetorno += tempoRetorno;
            mediaEspera += tempoRetorno - p.tempoExecucao;
        }
        
        mediaRetorno /= processos.size();
        mediaEspera /= processos.size();


        System.out.println("Media de tempo de retorno = " + mediaRetorno);
        System.out.println("Media de tempo de espera = " + mediaEspera);

    }







    public static void imprimir(List<Processo> processos){
        System.out.printf("%-10s | %-16s | %-18s | %-14s | %-22s | %-20s | %-16s\n",
                "Processo", "Tempo de Chegada", "Duração da Execução", "Tempo Restante", "Início do Processamento", "Tempo de Conclusão", "Tempo de Espera");
        for (Processo p : processos) {
            System.out.printf("%-10s | %-16d | %-19d | %-14d | %-23d | %-20d | %-16d\n",
                    p.id,
                    p.tempoChegada,
                    p.tempoExecucao,
                    p.tempoRestante,
                    p.tempoInicioExecucao,
                    p.tempoConclusao,
                    p.tempoEspera);
        }
    }
}
