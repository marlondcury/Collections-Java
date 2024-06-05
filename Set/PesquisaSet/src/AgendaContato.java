import java.util.HashSet;
import java.util.Set;

public class AgendaContato {

    private Set<Contato> agendaSet;

    public AgendaContato(){
        this.agendaSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        agendaSet.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(agendaSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> listaPorNome = new HashSet<>();
        for(Contato c : agendaSet){
            if(c.getNome().startsWith(nome)){
                listaPorNome.add(c);
            }
        }

        return listaPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : agendaSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContato agenda1 = new AgendaContato();
        agenda1.exibirContato();
        agenda1.adicionarContato("Marlon", 213);
        agenda1.adicionarContato("Maria", 213);
        agenda1.adicionarContato("Maria Eduarda", 213);
        agenda1.adicionarContato("Mario", 113);
        agenda1.adicionarContato("Joao", 3413);
        agenda1.exibirContato();
        agenda1.atualizarNumeroContato("Maria", 11111);
        agenda1.exibirContato();
        agenda1.pesquisarPorNome("Maria");
        System.out.println(agenda1.pesquisarPorNome("Maria"));
    }
}
