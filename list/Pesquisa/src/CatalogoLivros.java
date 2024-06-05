import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> listLivro;

    public CatalogoLivros(){
        this.listLivro = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao ){
        listLivro.add(new Livro(titulo, autor, anoPublicacao));
    }

    public void obterDescricaoLivro(){
        System.out.println(listLivro);
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!listLivro.isEmpty()){
            for(Livro l : listLivro){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public List<Livro> pesquisaPorAutor(String autor){
        List<Livro> listaPorAutor = new ArrayList<>();
        if(!listLivro.isEmpty()){
            for(Livro l : listLivro){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    listaPorAutor.add(l);
                }
            }
        }
        return listaPorAutor;
    }

    public List<Livro> pesquisarPorIntervalo(int ano1, int ano2){
        List<Livro> listaPorIntervalo = new ArrayList<>();
        if(!listLivro.isEmpty()){
            for(Livro l : listLivro){
                if(l.getAnoPublicacao() >= ano1 && l.getAnoPublicacao() <= ano2){
                    listaPorIntervalo.add(l);
                }
            }
        }
        return listaPorIntervalo;
    }



        public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 1990);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2000);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 2", 2010);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 3", 2020);
        catalogoLivros.adicionarLivro("Livro 5", "Autor 4", 2005);
        catalogoLivros.obterDescricaoLivro();
        catalogoLivros.pesquisaPorAutor("Autor 1");
        System.out.println(catalogoLivros.pesquisaPorAutor("Autor 2"));
        System.out.println(catalogoLivros.pesquisarPorIntervalo(2000,2005));

       

    }
}

