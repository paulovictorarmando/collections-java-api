import java.util.List;
import java.util.ArrayList;

public class CarrinhoDeCompras
{
    private List<Item> carrinho;

    public CarrinhoDeCompras()
    {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade)
    {
        carrinho.add(new Item(nome, preco, quantidade));
    }
    public void adicionarItem(Item i)
    {
        carrinho.add(i);
    }
    public void removerItem(String nome)
    {
        List<Item> itemToRemove = new ArrayList<>();
        for(Item i: carrinho)
        {
            if(i.getNome().equalsIgnoreCase(nome))
                itemToRemove.add(i);
        }
        carrinho.removeAll(itemToRemove);
    }
    public double calcularValorTotal()
    {
        double res = 0.0;
        for(Item i: carrinho)
        {
            res += i.getPreco() * i.getQuantidade();
        }
        return res;
    }
    public void exibirItens()
    {
        for(Item i: carrinho)
        {
            System.out.println("Item: " + i.getNome() + " Quantidade: " + i.getQuantidade() + "  Preco Cada: " + i.getPreco() + "  Preco Total: " + (i.getPreco()*i.getQuantidade()));
        }
    }
}