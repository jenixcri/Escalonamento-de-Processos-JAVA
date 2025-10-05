import java.util.LinkedList;
import java.util.Queue;

class Processo {
    String nome;
    int tempoRestante;

    public Processo(String nome, int tempoRestante) {
        this.nome = nome;
        this.tempoRestante = tempoRestante;
    }
}

public class EX_RoundRobin {
    public static void main(String[] args) {
        int quantum = 2;

        Queue<Processo> fila = new LinkedList<>();

        fila.add(new Processo("P1", 5));
        fila.add(new Processo("P2", 7));
        fila.add(new Processo("P3", 3));

        while (!fila.isEmpty()) {
            Processo p = fila.remove(); 
            int tempoExecutado = Math.min(quantum, p.tempoRestante);
            p.tempoRestante -= tempoExecutado;

            System.out.println(p.nome + " executou " + tempoExecutado +
                               " unidades (restam " + p.tempoRestante + ")");

            if (p.tempoRestante > 0) {
                fila.add(p);
            }
        }

        System.out.println("\nTodos os processos foram concluídos!");
    }
}
