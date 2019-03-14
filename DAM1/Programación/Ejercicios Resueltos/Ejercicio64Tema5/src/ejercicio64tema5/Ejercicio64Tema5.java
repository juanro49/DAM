
package ejercicio64tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio64Tema5
{

    public static void main(String[] args) throws IOException
    {
        int n;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        do
        {
            System.out.println("Escribe un número");
            n = Integer.parseInt(bf.readLine());
        } while (n < 0);
        
        while (n > 9)
        {
            int aux = 0;
            while (n != 0)
            {
                aux += n % 10;
                n  /= 10;
            }
            
            n = aux;
        }
        
        System.out.println("La raiz digital es " + n);
    }
}
