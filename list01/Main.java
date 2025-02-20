import java.util.ArrayList;
import java.util.List;
public class Main
{
    public static void main(String[] args)
    {
        CatalogoLivros livros = new CatalogoLivros();
        livros.adicionarLivro("eu e tu", "Paulo Armando", 2021);
        livros.adicionarLivro("nos ", "Paulo Armando", 2006);
        livros.adicionarLivro("a flor e o mar", "Paulo Armando", 2010);
        livros.adicionarLivro("rios e mares", "Paulo Armando", 2001);
        livros.adicionarLivro("a lua brilhante", "Timotio P", 1890);
        livros.adicionarLivro("Sol negro", "Timoteo P", 1870);
        livros.adicionarLivro("vida morta", "Paulo Armando", 2001);
        livros.adicionarLivro("fogo gelado", "Elias V", 2009);

        System.out.println("\n\nTest 1");
        List<Livro> l1 =  livros.pesquisarPorAutor("Timotio P");
        for (Livro l: l1)
        {
            System.out.println("Titulo: " + l.getTitulo());
        }
        
        System.out.println("\n\nTest 2");
        
        List<Livro> l2 =  livros.pesquisarPorIntervaloAnos(2000, 2024);
        for (Livro l: l2)
        {
            System.out.println("Titulo: " + l.getTitulo());
        }
        System.out.println("\n\nTest 3");
        Livro lp = livros.pesquisarPorTitulo("fogo gelado");
        System.out.println("Autor: "+lp.getAutor() +"; Titulo: "+lp.getTitulo());
    }
}