import java.util.ArrayList;
public class Main{
    public static void main(String[] args)
    {
        ListaTarefa tarefa = new ListaTarefa();
        System.out.println("Total 1: "+tarefa.totalTarefas());
        tarefa.adicionarTarefa("comer");
        tarefa.adicionarTarefa("tomar cafe");
        tarefa.adicionarTarefa("codar");
        tarefa.adicionarTarefa("desenhar");
        System.out.println("Total 2 : "+tarefa.totalTarefas());
        tarefa.obeterDescricoes();

        tarefa.removerTarefa("desenhar");

        System.out.println("\n\n +++++ DEPOIS DE REMOVER desenhar ++++++");
        System.out.println("Total 3 : "+tarefa.totalTarefas());
        tarefa.obeterDescricoes();

        Tarefa wc = new Tarefa("ir ao wc");
        tarefa.adicionarTarefa(wc);
        System.out.println("\n\n +++++ DEPOIS DE ADD WC ++++++");
        tarefa.obeterDescricoes();
        System.out.println("Total 4 : "+tarefa.totalTarefas());
    }
}