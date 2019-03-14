
package ejercicio35tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio35Tema5
{

    public static void main(String[] args) throws IOException
    {
        int num, count = 0;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        for (int i = 1; i <= 10; i++)
        {
            System.out.println("Escribe un número");
            num = Integer.valueOf(bf.readLine());
            
            if (num < 0)
            {
                count++;
            }
        }
        
        if (count != 0)
        {
            System.out.println("Se han escrito " + count + " números negativos");
        }
        else
        {
            System.out.println("No se han escrito números negativos");
        }
    }
}
