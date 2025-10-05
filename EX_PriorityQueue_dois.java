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

public class EX_PriorityQueue_dois {
    public static void main(String[] args) {

        Comparator<Tarefa> comparador = new Comparator<Tarefa>() {
            @Override
            public int compare(Tarefa t1, Tarefa t2) {
                return Integer.compare(t1.prioridade, t2.prioridade); 
            }
        };

        PriorityQueue<Tarefa> fila = new PriorityQueue<>(comparador);

        fila.add(new Tarefa("Atender cliente urgente", 1));
        fila.add(new Tarefa("Resolver falha no sistema", 1));
        fila.add(new Tarefa("Apagar incêndio no servidor", 1));
        fila.add(new Tarefa("Corrigir erro crítico", 1));
        fila.add(new Tarefa("Reunião com diretoria", 1));

        fila.add(new Tarefa("Responder e-mails", 2));
        fila.add(new Tarefa("Revisar relatórios", 2));
        fila.add(new Tarefa("Organizar documentos", 2));
        fila.add(new Tarefa("Atualizar planilhas", 2));
        fila.add(new Tarefa("Enviar notas fiscais", 2));

        fila.add(new Tarefa("Limpar a mesa", 3));
        fila.add(new Tarefa("Repor papel na impressora", 3));
        fila.add(new Tarefa("Planejar confraternização", 3));
        fila.add(new Tarefa("Fazer backup", 3));
        fila.add(new Tarefa("Verificar correio físico", 3));

        System.out.println("Iniciando execução por prioridade:\n");

        while (!fila.isEmpty()) {
            System.out.println("Executando: " + fila.poll());
        }
    }
}
