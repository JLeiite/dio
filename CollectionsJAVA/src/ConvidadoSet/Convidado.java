package ConvidadoSet;

import java.util.Objects;

public class Convidado {
    // Atributos
    private String nome;
    private int codigoConvite;

    // Construtor
    public Convidado(String nome, int
            codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    // Getter and Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getcodigoConvite() {
        return codigoConvite;
    }

    public void setcodigoConvite(int codigoConvite) {
        this.codigoConvite = codigoConvite;
    }

    // Método ToString
    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoConvite=" + codigoConvite +
                '}';
    }

    // Método pra conferir duplicidade
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return codigoConvite == convidado.codigoConvite;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoConvite);
    }
}
