import java.util.List;
import java.util.ArrayList;

public class OrdenacaoPessoas
{
    private List<Pessoa> pessoas;
    public OrdenacaoPessoas()
    {
        this.pessoas = new ArrayList<>();
    }
    public void adicionarPessoa(String nome, int idade, double altura)
    {
        this.pessoas.add(new Pessoa(nome, idade, altura))
    }
    public List<Pessoa> ordenarPorIdade()
    {
        List<Pessoa> res = new ArrayList<>(pessoas);
        Collections.sort(res);
        return (res);
       
    }
    public void ordenarPorAltura()
    {
        List<Pessoa> res = new ArrayList<>(pessoas);
        Collections.sort(res, new CompararPorAltura());
        return (res);
    }

}

