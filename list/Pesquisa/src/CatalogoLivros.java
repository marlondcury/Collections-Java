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

    public void pesquisarPorTitulo(String titulo){
        for( Livro t : listLivro){
            if( t.getTitulo().equalsIgnoreCase(titulo)){
                System.out.println(t);
            }
        }
    }

    public void pesquisarPorAutor(String autor){
        for(Livro t : listLivro){
            if(t.getAutor().equalsIgnoreCase(autor)){
                System.out.println(t);
            }
        }
    }

    public void pesquisarPorIntervalo( int ano1, int ano2){
        for(Livro t : listLivro){
            if( t.getAnoPublicacao() >= ano1 && t.getAnoPublicacao() <= ano2){
                System.out.println(t);
            }
        }
    }



        public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        System.out.println(catalogoLivros.listLivro.size());
        catalogoLivros.adicionarLivro("Grandes Sertoes", "Guimarares Rosa", 1956);
        System.out.println(catalogoLivros.listLivro.size());
        catalogoLivros.obterDescricaoLivro();
        catalogoLivros.pesquisarPorTitulo("Grandes Sertoes");
        catalogoLivros.adicionarLivro("As meninas", "Lygia Fagundes Telles", 1973);
        catalogoLivros.pesquisarPorIntervalo(1900,2000);
       

    }
}

