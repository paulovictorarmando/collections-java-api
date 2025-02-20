public class Main
{
    public static void main(String[] args)
    {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Pc", 100.00, 1);
        carrinho.adicionarItem("Notpad", 45.90, 1);
        carrinho.adicionarItem("livro - Clean Code", 15.90, 1);
        carrinho.adicionarItem("Av", 15.90, 1);
        carrinho.exibirItens();
        carrinho.removerItem("Av");
        carrinho.exibirItens();
        System.out.println("Valor total: " + carrinho.calcularValorTotal());
        System.out.println("I");
    }
}