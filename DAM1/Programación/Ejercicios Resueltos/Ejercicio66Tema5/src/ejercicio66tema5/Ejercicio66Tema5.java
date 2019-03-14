
package ejercicio66tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio66Tema5
{

    public static void main(String[] args) throws IOException
    {
        // De derecha a izquierda
        int n, count1 = 0, count2 = 0;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        do
        {
            System.out.println("Escribe un número");
            n = Integer.parseInt(bf.readLine());
        } while (n < 0);
        
        while (n != 0)
        {
            count1++;
            
            if (count1 == n % 10)
            {
                count2++;
            }
            n /= 10;
        }
        
        System.out.println("Coincicen " + count2 + " cifras");
        
        /* De izquierda a derecha
        aux = n;
        
        while (n != 0)
        {
            n /= 10;
            count1++;
        }
        
        while (aux != 0)
        {
            if (count1 == aux % 10)
            {
                count2++;
            }
            
            aux /= 10;
            count1--;
        }
        
        System.out.println("Coinciden " + count2 + " cifras");
        */
    }
}
