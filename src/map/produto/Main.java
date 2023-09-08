package map.produto;

public class Main {
    public static void main(String[] args) {

        var estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1L, "Feijão", 3, 10d);
        estoqueProdutos.adicionarProduto(2L, "Arroz", 4, 9d);
        estoqueProdutos.adicionarProduto(3L, "Sal", 5, 11d);
        estoqueProdutos.adicionarProduto(4L, "Açúcar", 6, 13d);

        estoqueProdutos.exibirProdutos();

        System.out.println(estoqueProdutos.obterProdutoMaisBarato());

        System.out.println(estoqueProdutos.obterProdutoMaisCaro());

        System.out.println(estoqueProdutos.calcularValorTotalEstoque());
    }
}
