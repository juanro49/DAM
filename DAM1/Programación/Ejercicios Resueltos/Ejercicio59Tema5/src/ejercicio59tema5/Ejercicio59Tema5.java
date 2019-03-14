
package ejercicio59tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio59Tema5
{

    public static void main(String[] args) throws IOException
    {
        int x, n;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        do
        {
            System.out.println("Escribe un número");
            x = Integer.parseInt(bf.readLine());
        } while (x < 0 || x > 9);
        
        do
        {
            System.out.println("Escribe otro número");
            n = Integer.parseInt(bf.readLine());
        } while (n < 0);
        
        for (int i = n; i != 0; i--)
        {
            System.out.print(x);
        }
    }
}
