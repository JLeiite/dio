package ConvidadoSet;

public class Main {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1001);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1002);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1002);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1004);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de convidados.");

        conjuntoConvidados.exibirConvidados();
        conjuntoConvidados.removerConvidado(1004);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de convidados.");
        conjuntoConvidados.exibirConvidados();

    }
}
