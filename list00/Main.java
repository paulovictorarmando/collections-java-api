import java.util.ArrayList;
public class Main{
    public static void main(String[] args)
    {
        ListaTarefa tarefa = new ListaTarefa();
        tarefa.adicionarTarefa("comer");
        tarefa.adicionarTarefa("tomar cafe");
        tarefa.adicionarTarefa("codar");
        tarefa.adicionarTarefa("desenhar");

        tarefa.obeterDescricoes();

        tarefa.removerTarefa("desenhar");

        System.out.println("\n\n +++++ DEPOIS DE REMOVER desenhar ++++++");
        tarefa.obeterDescricoes();

        Tarefa wc = new Tarefa("ir ao wc");
        tarefa.adicionarTarefa(wc);
        System.out.println("\n\n +++++ DEPOIS DE ADD WC ++++++");
        tarefa.obeterDescricoes();


    }
}