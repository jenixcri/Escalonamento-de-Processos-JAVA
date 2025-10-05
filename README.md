# Escalonamento-de-Processos-JAVA

Este repositório contém a implementação das atividades propostas para estudo de **Filas (Queue), Priority Queue e Round Robin** em Java.

---

## Questões abordadas

### 1. Queue (Fila FIFO)
- Implementação utilizando `LinkedList` em Java.
- Funciona no modelo **FIFO (First In, First Out)**.
- Operações principais:
  - `add()` → adiciona elemento no fim da fila.
  - `remove()` → remove o primeiro elemento da fila.
  - `peek()` → visualiza o primeiro elemento sem remover.

### 2. PriorityQueue
- Implementação utilizando `PriorityQueue` padrão do Java.
- Elementos são removidos **conforme prioridade**, não ordem de inserção.
- Exemplo: fila de inteiros, menor número tem maior prioridade.

### 3. PriorityQueue personalizada
- Criada a classe `Tarefa` com atributos:
  - `nome` → nome da tarefa
  - `prioridade` → número indicando prioridade (1=alta, 2=média, 3=baixa)
- Uso de `Comparator` explícito para definir a prioridade de execução (compatível com Java 24).
- Exemplo: 5 itens de cada prioridade, execução respeitando a ordem de prioridade.

### 4. Simulação Round Robin
- Cada processo possui:
  - `nome` → P1, P2, P3
  - `tempoRestante` → tempo total necessário (burst time)
- Fila manipulada com **enqueue (add)** e **dequeue (remove)**
- Quantum = 2 unidades de tempo
- Processo executa no máximo por quantum; se restar tempo, volta ao fim da fila.
- Saída imprime a sequência de execução até todos os processos terminarem.

---

## Prints da execução

### Questão 1 - Queue
<img width="730" height="119" alt="image" src="https://github.com/user-attachments/assets/36141231-2107-4170-a7be-790d600e6909" />

### Questão 2 - PriorityQueue
<img width="1382" height="201" alt="image" src="https://github.com/user-attachments/assets/fe961160-03a3-45f1-8001-e83b7cc07ad5" />

### Questão 3 - PriorityQueue personalizada
<img width="741" height="375" alt="image" src="https://github.com/user-attachments/assets/2c970fef-ac26-45fb-9089-eef4b0c0193e" />

### Questão 4 - Simulação Round Robin
<img width="539" height="248" alt="image" src="https://github.com/user-attachments/assets/55bea69b-bd63-4b7f-9748-5d3a5ff73a66" />
