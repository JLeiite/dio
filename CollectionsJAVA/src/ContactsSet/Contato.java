package ContactsSet;

import java.util.Objects;

public class Contato {
    // Atributos
    private String nome;
    private int numero;

    // Constructor
    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    // Getter and Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    // Bloqueio de contatos duplicados
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;
        return getNumero() == contato.getNumero();
    }

    // Conversão ToString
    @Override
    public String toString() {
        return "Contato: " + nome + " (" + numero + ")";
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumero());
    }
}
