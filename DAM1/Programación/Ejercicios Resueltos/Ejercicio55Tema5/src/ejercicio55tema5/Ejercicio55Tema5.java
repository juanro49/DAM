
package ejercicio55tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio55Tema5
{

    public static void main(String[] args) throws IOException
    {
        int n, ult = 1, pen = 0;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        do
        {
            System.out.println("Escribe un número");
            n = Integer.parseInt(bf.readLine());
        } while (n < 1);
        
        System.out.println(ult);
        for (int i = 2; i <= n; i++)
        {
            ult += pen;
            pen = ult - pen;
            System.out.println(ult);
        }

        /*Otra forma mejor
        int n, fn, f1= 1, f2= 1;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        do
        {
            System.out.println("Escribe un número");
            n = Integer.parseInt(bf.readLine());
        } while (n < 1);
        
        for (int i = 1; i <= n; i++)
        {
            if(i<=2)
            {
                fn=1;
            }
            else
            {
                fn= f1 + f2;
                f1= f2;
                f2= fn;
            }
            
            System.out.println(fn);
        }
                */
    }
}
