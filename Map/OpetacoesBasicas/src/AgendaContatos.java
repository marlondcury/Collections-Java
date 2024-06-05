import java.util.HashMap;

public class AgendaContatos {
    private HashMap<String, Integer> agendaMap;

    public AgendaContatos(){
        this.agendaMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaMap.put(nome, telefone);
    }

    @Override
    public String toString() {
        return "AgendaContatos{" +
                "agendaMap=" + agendaMap +
                '}';
    }

    public void removerContato(String nome){
        if(!agendaMap.isEmpty()){
            agendaMap.remove(nome);
        }
    }

    public void exibirContato(){
        System.out.println(agendaMap);
    }

    public Integer pesquisaPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaMap.isEmpty()){
           numeroPorNome =  agendaMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("Marlon", 2342341);
        agenda.adicionarContato("Maria", 2675634);
        agenda.adicionarContato("Marcos", 67563412);
        agenda.adicionarContato("Joao", 2342343);
        System.out.println(agenda.agendaMap.size());
        agenda.exibirContato();
        agenda.removerContato("Marlon");
        agenda.exibirContato();
    }
}
