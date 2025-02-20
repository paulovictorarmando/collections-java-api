import java.util.ArrayList;
import java.util.List;
public class SomaNumeros
{

    /**
     * adicionarNumero(int numero): Adiciona um número à lista de números.
     * calcularSoma(): Calcula a soma de todos os números na lista e retorna o resultado.
     * encontrarMaiorNumero(): Encontra o maior número na lista e retorna o valor.
     * encontrarMenorNumero(): Encontra o menor número na lista e retorna o valor.
     * exibirNumeros(): Retorna uma lista contendo todos os números presentes na lista.
     */
    private List<Integer> numeros;

    public SomaNumeros()
    {
        this.numeros = new ArrayList<>(); 
    }
    public void adicionarNumero(int numero)
    {
        numeros.add(numero);
    }
    public int calcularSoma()
    {
        int res = 0;
        for(Integer i: numeros)
        {
            res += i;
        }
        return res;
    }
    public int encontrarMaiorNumero()
    {
        if(numeros.isEmpty())
            return null;
        int maior = numero[0];
            
    }

}