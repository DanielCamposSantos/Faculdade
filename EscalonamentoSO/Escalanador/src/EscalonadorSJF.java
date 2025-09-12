import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EscalonadorSJF implements Escalonador{
    @Override
    public void simular(List<Processo> processos) {
        List<Processo> fila = new ArrayList<>(processos);
        processos.sort((a,b) -> Integer.max(a.tempoChegada,b.tempoChegada));
        int tempoAtual = 0;
        int processosCompletos = 0;
        int tempoConclusao = 0;

        while(processosCompletos < processos.size()){
            List<Processo> disponiveis = new ArrayList<>();
            for (Processo p : fila){
                if (p.tempoChegada <= tempoAtual){
                    disponiveis.add(p);
                }
            }




            for (Processo p : fila){
                System.out.print("[" + p.tempoChegada + "]");
            }

        }







        /*
        preciso ver o tempo de chegada de todos
        posso usar um arra normal para isso

        executar é passar o tempo atual para o tempo de execução dos disóniveis, um por vez e passar os dados para os objetos
         */




    }
}
