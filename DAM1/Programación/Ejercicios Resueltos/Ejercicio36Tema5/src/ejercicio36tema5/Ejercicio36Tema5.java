
package ejercicio36tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio36Tema5
{

    public static void main(String[] args) throws IOException
    {
        int nota, count = 0;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        for (int i = 1; i <= 5; i++)
        {
            do
            {
                System.out.println("Escribe una nota");
                nota = Integer.valueOf(bf.readLine());
            } while (nota < 0 || nota > 10);
            
            if (nota < 5)
            {
                count++;
            }
        }
        
        if (count == 0)
        {
            System.out.println("No hay suspensos");
        }
        else
        {
            System.out.println("Hay " + count + " suspensos");
        }
    }
}
