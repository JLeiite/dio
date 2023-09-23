package BookList;

public class Main {
    public static void main(String[]args){
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Titulo 1", "Autor 1", 2000);
        catalogoLivros.adicionarLivro("Titulo 1", "Autor 2", 2000);
        catalogoLivros.adicionarLivro("Titulo 3", "Autor 2", 2001);
        catalogoLivros.adicionarLivro("Titulo 4", "Autor 4", 2002);
        catalogoLivros.adicionarLivro("Titulo 5", "Autor 5", 2004);

        System.out.println(catalogoLivros.pesquisarAutor("Autor 2"));
        System.out.println(catalogoLivros.pesquisaPorAno(2000, 2003));
        System.out.println(catalogoLivros.pesquisaTitulo("Titulo 1"));
    }
}
