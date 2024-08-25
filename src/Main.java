import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main
{
    public static void main(String[] args)
    {
        int magicalNumber = ThreadLocalRandom.current().nextInt(1, 100 + 1);

        int numeroUsuario;
        Scanner sc = new Scanner(System.in);


        do
        {
            System.out.println("Adivina el numero magico (ingresa un numero): ");
            numeroUsuario = sc.nextInt();

            if (magicalNumber > numeroUsuario)
            {
                System.out.println("el numero es más grande");

            }
            else if (magicalNumber < numeroUsuario)
            {
                System.out.println("El numero es más pequeño");
            }
            else
                System.out.println("Adivinaste, el numero era: "+magicalNumber);


        }
        while(numeroUsuario != magicalNumber);
    }
}