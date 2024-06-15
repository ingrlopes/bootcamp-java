package Collections.List;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    public static void main(String[] args) {

        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("-------------");
        System.out.println("BEM VINDO!");
        System.out.println(" ");
        System.out.println("O número total de elementos na lista é: " +
                listaTarefa.numbTotalTarefas());
        System.out.println("-------------");

        listaTarefa.addTarefa("Tarefa 1");
        listaTarefa.addTarefa("Tarefa 2");
        listaTarefa.addTarefa("Tarefa 3");
        System.out.println("O número total de elementos na lista é: " +
                listaTarefa.numbTotalTarefas());
        System.out.println("-------------");

        listaTarefa.rmvTarefa("Tarefa 3");
        System.out.println("O número atual de elementos na lista é: " +
                listaTarefa.numbTotalTarefas());
        System.out.println("-------------");

        System.out.println("DESCRIÇÃO TAREFAS: ");
        listaTarefa.descricoesTarefas();
        System.out.println("-------------");
    }

    // Atributo
    private List<Tarefa> tarefaList;

    // Construtor
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    // Método de adicionar
    public void addTarefa(String descricao) {
        System.out.println("!! ADICIONANDO TAREFA !!");
        tarefaList.add(new Tarefa(descricao));
    }

    // Método de remover
    public void rmvTarefa(String descricao) {
        List<Tarefa> tarefaRemove = new ArrayList<>();

        // Tarefa entra dentro da tarefaList
        for(Tarefa t : tarefaList) {
            // SE a descrição dessa tarefa for igual a descrição do método remover, faça...
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaRemove.add(t);
            }
        }
        System.out.println("!! REMOVENDO TAREFA !!");
        tarefaList.removeAll(tarefaRemove);
    }

    // Método de obter número total
    public int numbTotalTarefas() {
        return tarefaList.size();
    }

    // Método de obter descrições
    public void descricoesTarefas() {
        System.out.println(tarefaList);
    }
}