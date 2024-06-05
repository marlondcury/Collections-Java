import java.util.Comparator;
import java.util.Objects;

public class Produtos implements Comparable<Produtos>{

    private int cod;
    private String nome;
    private double preco;
    private int quantidade;

    public Produtos(int cod, String nome, int quantidade, double preco) {
        this.cod = cod;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }


    @Override
    public String toString() {
        return "Produtos{" +
                "cod=" + cod +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produtos produtos)) return false;
        return cod == produtos.cod;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cod);
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Produtos p) {
        return nome.compareToIgnoreCase(p.getNome());
    }
}

class ComparatorPorPreco implements Comparator<Produtos> {


    @Override
    public int compare(Produtos p1, Produtos p2) {
        return Double.compare(p1.getPreco(),p2.getPreco());
    }
}
