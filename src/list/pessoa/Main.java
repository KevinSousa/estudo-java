package list.pessoa;

public class Main {
    public static void main(String[] args) {
        var pessoas = new OrdenacaoPessoa();

        pessoas.adicionarPessoa(new Pessoa("Kevin", 25, 1.75));
        pessoas.adicionarPessoa(new Pessoa("Maria", 23, 1.85));
        pessoas.adicionarPessoa(new Pessoa("Joao", 24, 1.95));
        pessoas.adicionarPessoa(new Pessoa("Severino", 31, 1.65));

        System.out.println(pessoas.ordenarPorAltura());
        System.out.println(pessoas.ordernarPorIdade());
    }
}
