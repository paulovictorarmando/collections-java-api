import java.util.ArrayList;
import java.util.List;

public class SomaNumeros
{
    private List<Integer> numeros;

    public SomaNumeros()
    {
        this.numeros = new ArrayList<>(); 
    }
    public void adicionarNumero(int numero)
    {
        numeros.add(numero);
    }
    public Integer calcularSoma()
    {
        if(numeros.isEmpty())
            return null;
        int res = 0;
        for(Integer i: numeros)
        {
            res += i;
        }
        return res;
    }
    public Integer encontrarMaiorNumero()
    {
        if(numeros.isEmpty())
            return null;
        int maior = numeros.get(0);

        for(Integer i: numeros)
        {
            if (i > maior)
                maior = i;
        }
        return maior;

    }
    public Integer encontrarMenorNumero()
    {
        if(numeros.isEmpty())
            return null;
        int menor = numeros.get(0);

        for(Integer i: numeros)
        {
            if (i < menor)
                menor = i;
        }
        return menor;
    }
    public void exibirNumeros()
    {
        for(Integer i: numeros)
        {
            System.out.println(i);
        }
    }
}