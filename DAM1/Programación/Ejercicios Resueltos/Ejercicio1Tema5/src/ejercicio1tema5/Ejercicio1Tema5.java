
package ejercicio1tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1Tema5
{

    public static void main(String[] args) throws IOException
    {
        int a, b;
        String cad1;
        String cad2;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        System.out.println ("Escribe un número");
        cad1 = bf.readLine();
        a = (int) Float.parseFloat(cad1);
        
        System.out.println ("Escribe otro número");
        cad2 = bf.readLine();
        b = (int) Float.parseFloat(cad2);
        
        if (a >= b)
        {
            if (a % b == 0)
            {
                System.out.println(a + " es múltiplo de " + b);
            }
            else
            {
                System.out.println (a + " no es múltiplo de " + b);
            }
        }
        else
        {
            if (b % a == 0)
            {
                System.out.println(b + " es múltiplo de " + a);
            }
            else
            {
                System.out.println(b + " no es múltiplo de " + a);
            }
        }
    }
}
