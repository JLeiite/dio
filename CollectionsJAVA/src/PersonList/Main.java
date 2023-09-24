package PersonList;

public class Main {
    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.60);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 22, 1.70);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 25, 1.55);
        ordenacaoPessoa.adicionarPessoa("Nome 4", 17, 1.80);

        // System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}
