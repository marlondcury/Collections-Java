import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

    private List<Pessoa> pesssoaList;

    public OrdenacaoPessoa(){
        this.pesssoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pesssoaList.add(new Pessoa(nome, idade, altura));
    }

    public void obterPessoa(){
        System.out.println(pesssoaList.toString());
    }

    public List<Pessoa> ordenadoPorIdade(){
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pesssoaList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pesssoaList);
        Collections.sort(pessoaPorAltura,new ComparatorPorAltura());
        return pessoaPorAltura;
    }



    public static void main(String[] args) {
        OrdenacaoPessoa pessoa = new OrdenacaoPessoa();
        pessoa.adicionarPessoa("Marlon", 32, 1.80);
        pessoa.adicionarPessoa("Maria", 21, 1.55);
        pessoa.adicionarPessoa("Carlos", 50, 1.72);
        pessoa.obterPessoa();
        pessoa.ordenadoPorIdade();
        System.out.println(pessoa.ordenadoPorIdade());
        System.out.println(pessoa.ordenarPorAltura());
    }

}
