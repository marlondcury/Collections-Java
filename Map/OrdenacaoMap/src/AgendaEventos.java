import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class AgendaEventos {

    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos(){
        this.eventoMap = new HashMap<>();
    }

    private void adicionarEvento(LocalDate date, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventoMap.put(date,evento);
    }

    public void exibirEvento(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);

        for(Map.Entry<LocalDate, Evento> entry : eventoMap.entrySet()){
            if(entry.getKey().equals(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento sera: " + proximoEvento + " na data: " + proximaData);
                break;
            }
        }
    }

}
