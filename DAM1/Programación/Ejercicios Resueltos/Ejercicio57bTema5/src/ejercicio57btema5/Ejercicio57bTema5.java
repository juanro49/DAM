
package ejercicio57btema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio57bTema5
{

    public static void main(String[] args) throws IOException
    {
        int n1, n2, suma1 = 0, suma2 = 0;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        do
        {
            System.out.println("Escribe un número");
            n1 = Integer.parseInt(bf.readLine());
        } while (n1 < 0);
        
        do
        {
            System.out.println("Escribe un número");
            n2 = Integer.parseInt(bf.readLine());
        } while (n2 < 0);
        
        for (int i = 1; i <= (n1 / 2); i++)
        {
            if (n1 % i == 0)
            {
                suma1 += i;
            }
        }
        
        for (int j = 1; j <= (n2 / 2); j++)
        {
            if (n2 % j == 0)
            {
                suma2 += j;
            }
        }
        
        if (n2 == suma1 && n1 == suma2)
        {
            System.out.println("Son amigos");
        }
        else
        {
            System.out.println("No son amigos");
        }
    }
}
