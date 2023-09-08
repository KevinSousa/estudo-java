package list.pessoa;

import java.util.ArrayList;
import java.util.Collections;
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

    List<Pessoa> ordenarPorAltura() {
        List<Pessoa> listaOrdernadaPorAltura = new ArrayList<>(pessoas);
        Collections.sort(listaOrdernadaPorAltura, new ComparatorPorAltura());
        return listaOrdernadaPorAltura;
    }

}
