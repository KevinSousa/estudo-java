package set.convidado;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {

    private Set<Convidado> listaConvidados;

    public ConjuntoConvidado() {
        this.listaConvidados = new HashSet<>();
    }

    void adicionaConvidado(String nome, int codigoConvite) {
        this.listaConvidados.add(new Convidado(nome, codigoConvite));
    }

    void removerConvidado(int codigoConvite) {
        Convidado convidadoASerRemovido = null;
        for (Convidado convidado : listaConvidados) {
            if (convidado.getCodigoDoConvite() == codigoConvite) {
                convidadoASerRemovido = convidado;
                break;
            }
        }
        this.listaConvidados.remove(convidadoASerRemovido);
    }

    int contarConvidados() {
        return this.listaConvidados.size();
    }

    void exibirConvidados() {
        System.out.println(this.listaConvidados);
    }
}
