import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaLista;

    public ListaTarefa() {
        this.tarefaLista = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaLista.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemorer = new ArrayList<>();
        for (Tarefa f : tarefaLista) {
            if (f.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemorer.add(f);
            }
        }
        tarefaLista.removeAll(tarefasParaRemorer);
    }

    public int obterNumeroToltaTarefas() {
        return tarefaLista.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaLista);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println(listaTarefa.obterNumeroToltaTarefas());;
        listaTarefa.obterDescricoesTarefas();
        listaTarefa.adicionarTarefa("Tarefa #1");
        System.out.println(listaTarefa.obterNumeroToltaTarefas());;
        listaTarefa.adicionarTarefa("Tarefa #2");
        listaTarefa.adicionarTarefa("Tarefa #2");
        listaTarefa.adicionarTarefa("Tarefa #4");
        System.out.println(listaTarefa.obterNumeroToltaTarefas());
        //listaTarefa.removerTarefa("Tarefa #2");
        System.out.println(listaTarefa.obterNumeroToltaTarefas());
        listaTarefa.obterDescricoesTarefas();
    }
}
