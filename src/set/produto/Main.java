package set.produto;

public class Main {
    public static void main(String[] args) {
        var cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto(1L, "Feijão", 12d, 5);
        cadastroProdutos.adicionarProduto(2L, "Arroz", 13d, 6);
        cadastroProdutos.adicionarProduto(3L, "Açúcar", 14d, 7);
        cadastroProdutos.adicionarProduto(4L, "Sal", 15d, 8);

        System.out.println(cadastroProdutos.exibirPorPreco());

        System.out.println(cadastroProdutos.exibirProdutoPorNome());

        cadastroProdutos.adicionarProduto(5L, "Leite", 5d, 18);

        System.out.println(cadastroProdutos.exibirProdutoPorNome());
    }
}
