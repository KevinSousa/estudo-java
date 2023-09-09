package list.pessoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoa {

    private List<Pessoa> pessoas;

    public OrdenacaoPessoa() {
        this.pessoas = new ArrayList<>();
    }

    void adicionarPessoa(Pessoa pessoa) {
        this.pessoas.add(pessoa);
    }

    List<Pessoa> ordernarPorIdade() {
        List<Pessoa> listaOrdernada = new ArrayList<>(pessoas);
        Collections.sort(listaOrdernada);
        return listaOrdernada;
    }

    List<Pessoa> ordernarPorIdadeStream() {
        if (pessoas.isEmpty()) throw new RuntimeException("A Lista de pessoas está vazia");
        pessoas.sort(Comparator.comparingInt(Pessoa::getIdade));
        return pessoas;
    }

    List<Pessoa> ordenarPorAltura() {
        List<Pessoa> listaOrdernadaPorAltura = new ArrayList<>(pessoas);
        Collections.sort(listaOrdernadaPorAltura, new ComparatorPorAltura());
        return listaOrdernadaPorAltura;
    }

    List<Pessoa> ordenarPorAlturaStream() {
        if (pessoas.isEmpty()) throw new RuntimeException("A Lista de pessoas está vazia");
        pessoas.sort((p1, p2) -> Double.compare(p1.getAltura(), p2.getAltura()));
        return pessoas;
    }

}
