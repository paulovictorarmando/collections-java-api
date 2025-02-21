public class Main
{
    public static void main(String[] args)
    {
        ConjuntoConvidados convidados = new ConjuntoConvidados();

        convidados.adicionarConvidado("Paulo", 1);
        convidados.adicionarConvidado("Armando", 2);
        convidados.exibirConvidados();
    }
}