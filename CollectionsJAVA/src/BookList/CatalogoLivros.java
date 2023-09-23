package BookList;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    // Atributos
    private List<Livro> livroList;

    // Constructor
    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    // Getter and Setter
    public List<Livro> getLivroList() {
        return livroList;
    }

    public void setLivroList(List<Livro> livroList) {
        this.livroList = livroList;
    }

    // Adicionar Livro
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }
    
    // Pesquisar por autor
    public List<Livro> pesquisarAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        // Verifica se a lista está vazia
        if (!livroList.isEmpty()){
         for(Livro l : livroList){
             if(l.getAutor().equalsIgnoreCase(autor)){
                 livrosPorAutor.add(l);
             }
         }
        }
        return livrosPorAutor;
    }

    // Método para pesquisar por intervalo de anos
    public List<Livro> pesquisaPorAno(int anoInicial, int anoFinal) {
        List<Livro> livrosPorAno = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorAno.add(l);
                }
            }
        }
        return livrosPorAno;
    }

    // Método para pesquisar por título
    public Livro pesquisaTitulo (String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for (Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        } return livroPorTitulo;
    }
}
