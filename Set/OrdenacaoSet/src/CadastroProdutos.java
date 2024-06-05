import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produtos> listaProdutos;

    public CadastroProdutos(){
        this.listaProdutos = new HashSet<>();
    }

    public void adicionarProduto(int cod, String nome, int quantidade, double preco){
        listaProdutos.add(new Produtos(cod, nome, quantidade, preco));
    }

    public void exibirProdutos(){
        System.out.println(listaProdutos);
    }

    public Set<Produtos> exibirProdutosPorNome(){
        Set<Produtos> produtosPorNome = new TreeSet<>(listaProdutos); //treeSet ja ordena
        return produtosPorNome;
    }

    public Set<Produtos> exibirProPreco(){
        Set<Produtos> listaPorPreco = new TreeSet<>(new ComparatorPorPreco());
        listaPorPreco.addAll(listaProdutos);
        return listaPorPreco;
    }



    public static void main(String[] args) {
        CadastroProdutos listaProdutos = new CadastroProdutos();
        System.out.println(listaProdutos);
        listaProdutos.adicionarProduto(2, "Coca", 10, 3.50);
        listaProdutos.adicionarProduto(2, "Coca", 10, 3.50);
        listaProdutos.exibirProdutos();

    }
}
