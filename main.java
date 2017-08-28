import java.util.*;
public class main
{
    public static void main (String[] arg)
    {
        Scanner temp = new Scanner(System.in);
        int numero;
        int fibo1;
        int fibo2;
        do
        {
            System.out.print("Introduce numero mayor que 1: ");
            numero = temp.nextInt();
        }

        while(numero<=1);
        System.out.println("Los " + numero + " primeros términos de la serie de Fibonacci son:"); 
        fibo1=1;
        fibo2=1; 
        System.out.print(fibo1 + " ");
        for(int i=2;i<=numero;i++)
        {
            System.out.print(fibo2 + " ");
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
        }
        System.out.println();
    }
}
