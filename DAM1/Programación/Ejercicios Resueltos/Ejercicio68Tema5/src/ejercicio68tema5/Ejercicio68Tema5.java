
package ejercicio68tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio68Tema5
{

    public static void main(String[] args) throws IOException
    {
        int x, n;
        double f = 1;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        do
        {
            System.out.println("Escribe el valor de x");
            x = Integer.parseInt(bf.readLine());
        } while (x < 0);
        
        do
        {
            System.out.println("Escribe el número de aproximaciones");
            n = Integer.parseInt(bf.readLine());
        } while (n < 0);
        
        for (int i = 1; i <= n; i++)
        {
            long  factorial = 1;
            for (int j = i; j >= 1; j--)
            {
                factorial = factorial * j;
            }
            
            f += Math.pow(x, i) / factorial;
        }
        
        System.out.println("La funcion de f(" + x + ") = e elevado a " + x + " es " + f);
    }
}
