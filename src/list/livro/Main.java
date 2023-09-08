package list.livro;

public class Main {
    public static void main(String[] args) {
        var livros = new CatalogoLivros();

        livros.adicionarLivro(new Livro("Livro 1", 1996, "Kevin Moura"));
        livros.adicionarLivro(new Livro("Livro 2", 2000, "Kevin Silva"));
        livros.adicionarLivro(new Livro("Livro 3", 2003, "Fulano da Silva"));
        livros.adicionarLivro(new Livro("Livro 4", 2005, "Maria Alice"));

        System.out.println(livros.pesquisaLivroPorAutor("Kevin Silva"));

        System.out.println(livros.pesquisarLivroPorTitulo("Livro 1"));

        System.out.println(livros.pesquisarPorIntervaloAnos(1996, 2003));
    }
}
