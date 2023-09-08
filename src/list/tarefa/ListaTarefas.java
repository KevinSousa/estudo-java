package list.tarefa;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefas = new ArrayList<>();

    ListaTarefas() {
        this.tarefas = new ArrayList<>();
    }

    void adicionarTarefa(String descricao) {
        this.tarefas.add(new Tarefa(descricao));
    }

    void removerTarefa(String descricao) {
        List<Tarefa> taskToDelete = new ArrayList<>();

        for (Tarefa t : tarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) taskToDelete.add(t);
        }

        this.tarefas.removeAll(taskToDelete);
    }

    int obterNumeroTotalTarefas() {
        return this.tarefas.size();
    }

    List<Tarefa> obterDescricoesTarefas() {
        return this.tarefas;
    }
}
