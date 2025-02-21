import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados
{
    private Set<Convidado> convidados;

    public ConjuntoConvidados()
    {
        convidados = new HashSet<>();
    }
    public void adicionarConvidado(String nome, int codigoConvite)
    {
        convidados.add(new Convidado(nome, codigoConvite));
    }
    public void removerConvidadoPorCodigoConvite(int codigoConvite)
    {
        for(Convidado c: convidados)
        {
            if (c.getCodigoConvite() == codigoConvite)
                convidados.remove(c);
        }
    }
    public int contarConvidados()
    {
        return convidados.size();
    }
    public void exibirConvidados(){ System.out.println(convidados);}
}