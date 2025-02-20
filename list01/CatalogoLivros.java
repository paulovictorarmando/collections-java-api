import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros
{
    private List<Livro> livros;

    public CatalogoLivros()
    {
        this.livros = new ArrayList<>();
    }
    public void adicionarLivro(String titulo, String autor, int anoPublicacao)
    {
        livros.add(new Livro(titulo, autor, anoPublicacao));
    }
    public void adicionarLivro(Livro l)
    {
        livros.add(l);
    }
    public List<Livro> pesquisarPorAutor(String autor)
    {
        List<Livro> res = new ArrayList<>();
        for(Livro l: livros)
        {
            if(l.getAutor().equalsIgnoreCase(autor))
                res.add(l);
        }
        return res;
    }
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal)
    {
        List<Livro> res = new ArrayList<>();
        for(Livro l: livros)
        {
            if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal)
                res.add(l);
        }
        return res;
    }
    public Livro pesquisarPorTitulo(String titulo)
    {
      for(Livro l: livros)
      {
            if(l.getTitulo().equalsIgnoreCase(titulo))
                return l;
      } 
      return null;
    }

}
