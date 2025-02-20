public class Main
{
    public static void main(String[] args)
    {
        SomaNumeros nums = new SomaNumeros();
        nums.adicionarNumero(1);
        nums.adicionarNumero(2);
        nums.adicionarNumero(1);
        nums.adicionarNumero(4);
        System.out.println(nums.calcularSoma());
    }
}