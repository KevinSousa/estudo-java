package list.tarefa;

public class Main {
    public static void main(String[] args) {
        var listaTarefas = new ListaTarefas();
        listaTarefas.adicionarTarefa("tarefa.Tarefa 1");
        listaTarefas.adicionarTarefa("tarefa.Tarefa 2");
        listaTarefas.adicionarTarefa("tarefa.Tarefa 3");
        listaTarefas.adicionarTarefa("tarefa.Tarefa 3");
        listaTarefas.adicionarTarefa("tarefa.Tarefa 4");
        System.out.println(listaTarefas.obterDescricoesTarefas());
        listaTarefas.removerTarefa("tarefa.Tarefa 3");
        System.out.println(listaTarefas.obterDescricoesTarefas());
        System.out.println(listaTarefas.obterNumeroTotalTarefas());
    }
}
