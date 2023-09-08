package map.contato;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> contatos;

    public AgendaContatos() {
        this.contatos = new HashMap<>();
    }

    void adicionarContato(String nome, Integer telefone){
        this.contatos.put(nome, telefone);
    }

    void removerContato(String nome){
        if(this.contatos.isEmpty()){
            return;
        }
        this.contatos.remove(nome);
    }

    void exibirContatos(){
        System.out.println(contatos);
    }

    Integer pesquisarPorNome(String nome){
        if(this.contatos.isEmpty()) return null;
        return this.contatos.get(nome);
    }
}
