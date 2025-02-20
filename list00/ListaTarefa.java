import java.util.List;

public ListaTarefa
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
    public void removerTarefa(String descricao)
    {
        for(Tarefa t: tarefas)
        {
            if (t == descricao)
                tarefas.remove(t);
        }
    }
}