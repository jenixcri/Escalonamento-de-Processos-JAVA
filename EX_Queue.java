import java.util.LinkedList;
import java.util.Queue;

public class EX_Queue {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        fila.add("Pessoa 1");
        fila.add("Pessoa 2");
        fila.add("Pessoa 3");

        System.out.println("Fila inicial: " + fila);

        String atendido = fila.remove();
        System.out.println("Atendido: " + atendido);
        System.out.println("Fila após atendimento: " + fila);

        System.out.println("Próximo da fila: " + fila.peek());
    }
}
