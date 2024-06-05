public class Tarefa {

    private String descricao;

    Tarefa(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
