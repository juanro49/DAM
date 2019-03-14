
package ejercicio58tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio58Tema5
{

    public static void main(String[] args) throws IOException
    {
        int n, m, count = 0;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        do
        {
            System.out.println("Escribe un número");
            n = Integer.parseInt(bf.readLine());
        } while (n < 0);
        
        do
        {
            System.out.println("Escribe otro número");
            m = Integer.parseInt(bf.readLine());
        } while (m < 0);
        
        while (m != 0)
        {
            if (m % 2 != 0)
            {
                count += n;
            }
            
            m /= 2;
            n *= 2;
        }
        
        System.out.println("El producto es " + count);
    }
    
}
