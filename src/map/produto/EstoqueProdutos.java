package map.produto;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> produtos;

    public EstoqueProdutos() {
        this.produtos = new HashMap<>();
    }

    void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        var produto = new Produto(nome, quantidade, preco);
        this.produtos.put(cod, produto);
    }

    void exibirProdutos() {
        System.out.println(this.produtos);
    }

    double calcularValorTotalEstoque() {
        double valorEstoque = 0d;

        if (produtos.isEmpty()) return valorEstoque;

        for (Produto produto : produtos.values()) {
            valorEstoque += produto.getQuantidade() * produto.getPreco();
        }

        return valorEstoque;
    }

    Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorValor = Double.MIN_VALUE;

        if (produtos.isEmpty()) return null;

        for (Produto produto : produtos.values()) {
            if (produto.getPreco() > maiorValor) {
                produtoMaisCaro = produto;
            }
        }
        return produtoMaisCaro;
    }

    Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorValor = Double.MAX_VALUE;

        if (produtos.isEmpty()) return null;

        for (Produto produto : produtos.values()) {
            if (produto.getPreco() < menorValor) {
                menorValor = produto.getPreco();
                produtoMaisBarato = produto;
            }
        }
        return produtoMaisBarato;
    }
}
