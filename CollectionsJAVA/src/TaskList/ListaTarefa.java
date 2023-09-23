package TaskList;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    // Atributos
    private List<Tarefa> tarefaList;

    // Constructor para criar novo ArrayList
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    // Método para adicionar tarefa na lista pela descricao
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    // Método para remover tarefa da lista pela descricao
    public void removerTarefa(String descricao){

        // Adidionando tarefas para serem removidas em uma lista
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){
            // Verificando se possui a descrição informada para ser removida
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    // Método para obter o número total de tarefas
    public int totalTarefas(){
        return tarefaList.size();
    }

    // Método para mostrar todas as descrições da tarefa
    public void descricoesTarefa(){
        System.out.println(tarefaList);
    }

    // Getter and Setter
    public List<Tarefa> getTarefaList() {
        return tarefaList;
    }
    public void setTarefaList(List<Tarefa> tarefaList) {
        this.tarefaList = tarefaList;
    }
}
