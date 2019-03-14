
package ejercicio37tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio37Tema5
{

    public static void main(String[] args) throws IOException
    {
        int num;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        for (int i = 1; i <= 5; i++)
        {
            System.out.println("Escribe un número");
            num = Integer.valueOf(bf.readLine());
            
            if (num % 3 == 0)
            {
                System.out.println(num + " es múltiplo de 3");
            }
            else
            {
                System.out.println(num + " no es múltiplo de 3");
            }
        }
    }
}
