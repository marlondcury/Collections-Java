import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoquesProdutosMap;

    public EstoqueProdutos(){
        this.estoquesProdutosMap = new HashMap<>();
    }

    public void adicionarProdutos(Long cod, String nome, int quantidade, double preco){
        estoquesProdutosMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos(){
        System.out.println(estoquesProdutosMap);
    }

    public double calculaValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if(!estoquesProdutosMap.isEmpty()){
            for(Produto p : estoquesProdutosMap.values()){
                valorTotalEstoque += (p.getPreco() * p.getQuantidade());
            }
        }
        return valorTotalEstoque;
    }

   public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for( Produto p : estoquesProdutosMap.values()){
            if(p.getPreco() > maiorPreco){
                produtoMaisCaro = p;
            }
        }
        return produtoMaisCaro;
   }



    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.adicionarProdutos(121l, "cafe", 10,15.0);
        estoque.exibirProdutos();
        estoque.calculaValorTotalEstoque();
        estoque.adicionarProdutos(1234l, "cafe", 10,15.0);
        estoque.adicionarProdutos(3241l, "arroz", 5,35.0);
        estoque.adicionarProdutos(1676l, "feijao", 3,.0);
        estoque.adicionarProdutos(14554l, "vinagre", 1,3.0);

        System.out.println(estoque.calculaValorTotalEstoque());
        estoque.exibirProdutos();
        estoque.obterProdutoMaisCaro();
        System.out.println(estoque.obterProdutoMaisCaro());
    }
}
