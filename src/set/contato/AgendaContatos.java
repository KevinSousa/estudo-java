package set.contato;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatos;

    public AgendaContatos() {
        this.contatos = new HashSet<>();
    }

    void adicionarContato(String nome, int numero){
        this.contatos.add(new Contato(nome, numero));
    }

    void exibirContatos(){
        System.out.println(this.contatos);
    }

    Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosEncontrados = new HashSet<>();
        for (Contato contato : contatos) {
            if (contato.getNome().startsWith(nome)) {
                contatosEncontrados.add(contato);
            }
        }
        return contatosEncontrados;
    }

    Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato contato : contatos){
            if (contato.getNome().equalsIgnoreCase(nome)){
                contato.setNumeroTelefone(novoNumero);
                contatoAtualizado = contato;
                break;
            }
        }
        return contatoAtualizado;
    }
}
