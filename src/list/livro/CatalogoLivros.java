package list.livro;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    List<Livro> listaLivros;

    CatalogoLivros() {
        this.listaLivros = new ArrayList<>();
    }

    void adicionarLivro(Livro livro){
        this.listaLivros.add(livro);
    }

    List<Livro> pesquisaLivroPorAutor(String autor){
        if(listaLivros.isEmpty()) return listaLivros;
        List<Livro> livrosEncontrados = new ArrayList<>();
        listaLivros.forEach(livro -> {
            if (livro.getAutor().equalsIgnoreCase(autor)) livrosEncontrados.add(livro);
        });
        return livrosEncontrados;
    }

    List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        if(listaLivros.isEmpty()) return listaLivros;
        List<Livro> livrosEncontrados = new ArrayList<>();
        listaLivros.forEach(livro -> {
            if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) livrosEncontrados.add(livro);
        });
        return livrosEncontrados;
    }

    Livro pesquisarLivroPorTitulo(String titulo){
        if(listaLivros.isEmpty()) return null;
        Livro livro = null;
        for(Livro l : listaLivros){
            if(l.getTitulo().equalsIgnoreCase(titulo)) {
                livro = new Livro(l.getTitulo(), l.getAnoPublicacao(), l.getAutor());
                break;
            }
        }
        return livro;
    }
}
