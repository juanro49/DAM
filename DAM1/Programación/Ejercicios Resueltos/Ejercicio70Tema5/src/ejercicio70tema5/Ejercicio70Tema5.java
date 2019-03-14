
package ejercicio70tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio70Tema5
{

    public static void main(String[] args) throws IOException
    {
        int n, aux = 0;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        do
        {
            System.out.println("Escribe un número");
            n = Integer.parseInt(bf.readLine());
        } while (n < 0);
        
        for (int i = 1; i <= (n / 2); i++)
        {
            if (n % i == 0)
            {
                aux +=i;
            }
        }
        
        if (aux > n)
        {
            System.out.println(n + " es abundante");
        }
        else if (aux < n)
        {
            System.out.println(n + " es deficiente");
        }
        else
        {
            System.out.println(n + " es perfecto");
        }
    }
}
