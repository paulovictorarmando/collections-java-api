import java.util.ArrayList;
import java.util.List;

public class ListaTarefa
{
    private List<Tarefa> tarefas;

    public ListaTarefa()
    {
        this.tarefas = new ArrayList<>();
    }
    public void adicionarTarefa(String descricao)
    {
        tarefas.add(new Tarefa(descricao));
    }
    public void adicionarTarefa(Tarefa t)
    {
        tarefas.add(t);
    }
    public void removerTarefa(String descricao)
    {
        List<Tarefa> tarefasRemov = new ArrayList<>();
        for (Tarefa t: tarefas)
        {
            if (t.getDescricao().equalsIgnoreCase(descricao))
                tarefasRemov.add(t);
        }
        tarefas.removeAll(tarefasRemov);
    }

    public int totalTarefas()
    {
        return tarefas.size();
    }
    public void obeterDescricoes()
    {
        for (Tarefa t: tarefas)
        {
            System.out.println("Descricao: " + t.getDescricao());
        }
    }
}