package ConvidadoSet;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    // Atributos
    private Set<Convidado> convidadoSet;

    //Construtor
    public ConjuntoConvidados(){
        this.convidadoSet = new HashSet<>();
    }

    // Método para adicionar convidado
    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    // Método para remover convidado
    public void removerConvidado(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if(c.getcodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }
}
