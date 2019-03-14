
package ejercicio2tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2Tema5
{

    public static void main(String[] args) throws IOException
    {
        int a, b;
        String cad1, cad2;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        System.out.println ("Escriba un número");
        cad1 = bf.readLine();
        a = (int) Float.parseFloat (cad1);
        
        System.out.println ("Escriba otro número");
        cad2 = bf.readLine();
        b = (int) Float.parseFloat (cad2);
        
        if (a < b)
        {
            System.out.println (b + " es mayor que " + a);
        }
        else
        {
            if (a > b)
            {
                System.out.println (a + " es mayor que " + b);
            }
            else
            {
                System.out.println (a + " es igual a " + b);
            }
        }
    }
    
}
