import java.util.List;
import java.util.ArrayList;


public class CarrinhoCompras {

    private List<Item> listaItem;

    public CarrinhoCompras(){
        this.listaItem = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        listaItem.add(new Item(nome, preco, quantidade));
    }

    public void obterDescricaoItem(){
        System.out.println(listaItem);
    }

    public double calcularValorTotal(){
        double soma = 0;
        for(Item i : listaItem){
            soma += (i.getPreco()*i.getQuantidade());
        }
        return soma;
    }

    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();
        for(Item i : listaItem){
            if(i.getNome().equalsIgnoreCase(nome)){
                itemParaRemover.add(i);
            }
        }
        listaItem.removeAll(itemParaRemover);
    }

    public static void main(String[] args) {
        CarrinhoCompras c1 = new CarrinhoCompras();
        c1.adicionarItem("gelo",2.0,3);
        c1.adicionarItem("carne",32.0,1);
        c1.adicionarItem("carvao",15.0,2);
        c1.adicionarItem("pao",1.0,30);
        c1.obterDescricaoItem();
        System.out.println("_______________");
        c1.removerItem("gelo");

        c1.obterDescricaoItem();
        c1.calcularValorTotal();
        System.out.println(c1.calcularValorTotal());
        c1.adicionarItem("cafe", 15, 4);
        System.out.println(c1.calcularValorTotal());


    }
}
