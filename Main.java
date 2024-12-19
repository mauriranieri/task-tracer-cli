public class Main {
    public static void main(String[] args) {
        TaskManager listaTarefas = new TaskManager();
        listaTarefas.exibirTarefas();

        listaTarefas.adicionarTarefa("Tarefa 01");
        listaTarefas.adicionarTarefa("Tarefa 02");
        listaTarefas.adicionarTarefa("Tarefa 03");
        listaTarefas.adicionarTarefa("Tarefa 04");
        listaTarefas.adicionarTarefa("Tarefa 05");


        listaTarefas.atualizarTarefa(2, "Cozinhar carne");

        listaTarefas.exibirTarefas();
    }
}
