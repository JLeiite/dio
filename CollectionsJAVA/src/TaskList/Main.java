package TaskList;

public class Main {
    public static void main(String[] args) {

        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O número total de elementos na lista é: " + listaTarefa.totalTarefas());

        listaTarefa.adicionarTarefa("TaskList.Tarefa 1");
        listaTarefa.adicionarTarefa("TaskList.Tarefa 2");
        listaTarefa.adicionarTarefa("TaskList.Tarefa 2");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.totalTarefas());

        // listaTarefa.removerTarefa("TaskList.Tarefa 2");
        // System.out.println("O número total de elementos na lista é: " + listaTarefa.totalTarefas());

        listaTarefa.descricoesTarefa();
    }
}