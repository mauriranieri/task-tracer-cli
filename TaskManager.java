import java.time.LocalDateTime;
import java.util.LinkedList;

public class TaskManager {
    private LinkedList<Task> listaTarefas = new LinkedList<>();

    public void adicionarTarefa(String texto) {
        listaTarefas.add(new Task(texto));
    }

    public void removerTarefa(int index) {
        if(listaTarefas.isEmpty()) return;
        listaTarefas.remove(index);
    }

    public void exibirTarefas() {
        if(listaTarefas.isEmpty()) System.out.println("Nenhuma tarefa adicionada.\n");

        for(Task tarefa : listaTarefas) {
            tarefa.exibir();
        }
    }

    public void atualizarTarefa(int index, String texto) {
        if(index >= 0 && index < listaTarefas.size()) {
            LocalDateTime dataAtual = LocalDateTime.now();
            listaTarefas.get(index).setDescription(texto);
            listaTarefas.get(index).setUltimaAtualizacao(dataAtual);
        }

    }
}   
