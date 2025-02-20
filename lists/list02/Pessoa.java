public class Pessoa implements Comparable<Pessoa>
{
    private String nome;
    private int idade;
    private float altura;
    public Pessoa(String nome, int idade, double altura)
    {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    @Override
    public int compareTo(Pessoa p) {
		return Integer.compareTo(idade, p.getIdade());
	}
    public String getNome()
    {
        return this.nome;
    }
    public int getIdade()
    {
        return this.idade;
    }
    public double getAltura()
    {
        return this.altura;
    }
}

public class CompararPorAltura implements Comparator<Pessoa>
{
    @Override
    public int compare(Pessoa p1, Pessoa p2)
    {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }

}