import java.util.PriorityQueue;
import java.util.Comparator;

class Tarefa {
    String nome;
    int prioridade; 

    public Tarefa(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        return nome + " (prioridade " + prioridade + ")";
    }
}

public class EX_PriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Tarefa> fila = new PriorityQueue<>(Comparator.comparingInt(t -> t.prioridade));

        fila.add(new Tarefa("Enviar relatório", 2)); 
        fila.add(new Tarefa("Atender cliente urgente", 1));
        fila.add(new Tarefa("Organizar pastas", 3));
        fila.add(new Tarefa("Reunião com chefe", 1));
        fila.add(new Tarefa("Responder e-mails", 2));

        System.out.println("Tarefas na fila (ordem interna pode variar): " + fila);
        System.out.println("\nOrdem de execução:");

        while (!fila.isEmpty()) {
            System.out.println("Executando: " + fila.poll());
        }
    }
}
