package TaskList;

public class Tarefa {

    // Atributos
    private String descricao;

    // Convertendo para String
    @Override
    public String toString() {
        return "Descrição: " + descricao + '\n';
    }

    // Constructor
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    // Getters and Setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
