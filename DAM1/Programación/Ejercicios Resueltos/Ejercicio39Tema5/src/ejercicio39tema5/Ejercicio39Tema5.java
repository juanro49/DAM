
package ejercicio39tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio39Tema5
{

    public static void main(String[] args) throws IOException
    {
        int n;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        System.out.println ("Escribe la longitud");
        n = Integer.valueOf(bf.readLine());
        
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}