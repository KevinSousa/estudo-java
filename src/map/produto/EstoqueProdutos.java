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

        if (produtos.isEmpty()) throw new RuntimeException("A lista de produtos está vazia");

        for (Produto produto : produtos.values()) {
            valorEstoque += produto.getQuantidade() * produto.getPreco();
        }

        return valorEstoque;
    }

    double calcularValorTotalEstoqueStream() {
        if (produtos.isEmpty()) throw new RuntimeException("A lista de produtos está vazia");
        return produtos
                .values()
                .stream()
                .mapToDouble(item -> item.getPreco() * item.getQuantidade()).sum();
    }

    Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorValor = Double.MIN_VALUE;

        if (produtos.isEmpty()) throw new RuntimeException("A Lista de produtos está vazia");

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

        if (produtos.isEmpty()) throw new RuntimeException("A Lista de produtos está vazia");

        for (Produto produto : produtos.values()) {
            if (produto.getPreco() < menorValor) {
                menorValor = produto.getPreco();
                produtoMaisBarato = produto;
            }
        }
        return produtoMaisBarato;
    }
}
