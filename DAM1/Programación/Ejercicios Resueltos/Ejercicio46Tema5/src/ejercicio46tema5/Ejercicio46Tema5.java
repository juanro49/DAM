
package ejercicio46tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio46Tema5
{

    public static void main(String[] args) throws IOException
    {
        int n;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        do
        {
            System.out.println("Escribe un número");
            n = Integer.parseInt(bf.readLine());
        }while (n < 0);
        
        System.out.println("Primeras potencias de 2 menores a " + n);
        
        for (int i = 1; Math.pow(2, i) <= n; i++)
        {
            System.out.println("2 elevado a " + i + " = " + (int) Math.pow(2, i));
        }
        
        /* Otra forma mas correcta
                i = 0;
                while(Math.pow(2,i) <= n)
                {
                    System.out.println("2 elevado a " + i + "=" + Math.pow(2,i));
                    i++;
                }
        */
    }
}
