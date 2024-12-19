import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task {
    private String description;
    private LocalDateTime dataCriacao;
    private LocalDateTime ultimaAtualizacao;
    private static final DateTimeFormatter FORMATO = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); 

    public Task(String description) {
        this.description = description;
        this.dataCriacao = LocalDateTime.now();
        this.ultimaAtualizacao = dataCriacao;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDateTime getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }

    public void setUltimaAtualizacao(LocalDateTime ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
    }

    public void exibir() {
        String dataCriacaoFormatada = dataCriacao.format(Task.FORMATO);
        String ultimaAtualizacaoFormatada = ultimaAtualizacao.format(Task.FORMATO);

        System.out.println("Descricao: " + description +
                        "\nData de criacao: " + dataCriacaoFormatada +
                        "\nData de atualizacao: " + ultimaAtualizacaoFormatada + 
                        "\n");
    }
    

    @Override
    public String toString() {
        return "Tarefa{Descricao: " + description +
            ", Data de criacao: " + dataCriacao +
            ", Ultima atualizacao: " + ultimaAtualizacao +
            "}";
    }
}