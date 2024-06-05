import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    //Criando um atributo Set do tipo Convidado chamado convidadosSet
    private Set<Convidado> convidadosSet;

    //Construtor da classe, ao instanciar o objeto cria um Set convidadosSet
    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    // Ao adicionar o convidado instancia um novo objeto do tipo Convidado com os dados inseridos
    public void adicionarConvidado(int codigo, String nome){
       convidadosSet.add(new Convidado(codigo, nome));
    }

    public void removerConvidadoPorCodigo(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadosSet){
            if(c.getCodigo() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
            else{
                System.out.println("Não existe convidado com esse codigo de convite");
            }
        }
        convidadosSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadosSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados c1 = new ConjuntoConvidados();
        c1.adicionarConvidado(1,"Marlon");
        c1.adicionarConvidado(1,"Pedro");
        c1.adicionarConvidado(2,"Maria");
        c1.adicionarConvidado(4,"Joao");
        System.out.println(c1.contarConvidados());
        c1.exibirConvidados();
    }
}
