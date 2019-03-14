
package ejercicio42tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio42Tema5
{

    public static void main(String[] args) throws IOException
    {
        int num, cont = 0;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        System.out.println("Escribe un número");
        num = Integer.valueOf(bf.readLine());
        
        for (int i = 2; i <= num - 1; i++)
        {
            if (num % i == 0)
            {
                cont++;
            }
        }
        
        if (cont != 0)
        {
            System.out.println("No es primo");
        }
        else
        {
            System.out.println("Si es primo");
        }
    }
}
