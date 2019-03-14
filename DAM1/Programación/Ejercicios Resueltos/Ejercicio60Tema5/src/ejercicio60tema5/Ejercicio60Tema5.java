
package ejercicio60tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio60Tema5
{

    public static void main(String[] args) throws IOException
    {
        int num;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        do
        {
            System.out.println("Escribe un número");
            num = Integer.parseInt(bf.readLine());
        } while (num < 0);
        
        for (int i = 1; i <= num; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        for (int k = 1; k <= num; k++)
        {
            for (int l = 1; l <= k; l++)
            {
                System.out.print(k + " ");
            }
            System.out.println("");
        }
        
        for (int m = num - 1; m >= 1; m--)
        {
            for (int n = 1; n <= m; n++)
            {
                System.out.print(m + " ");
            }
            System.out.println("");
        }
    }
}
