package ContactsSet;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {
    // Atributos
    private Set<Contato> contatoSet;

    // Constructor
    public AgendaContato() {
        this.contatoSet = new HashSet<>();
    }

    // Adicionar contato
    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    // Exibir contato
    public void exibirContato(){
        System.out.println(contatoSet);
    }

    // Pesquisar contato por nome
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }

    // Método para atualizar número do contato
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        } return contatoAtualizado;
    }

    // Getters and Setters
    public Set<Contato> getContatoSet() {
        return contatoSet;
    }

    public void setContatoSet(Set<Contato> contatoSet) {
        this.contatoSet = contatoSet;
    }
}
