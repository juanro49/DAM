
package ejercicio7tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio7Tema5 {

    public static void main(String[] args) throws IOException
    {
        int a;
        String cad;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        do
        {
             System.out.println ("Escribe un número entre 0 y 9999");
             cad = bf.readLine();
             a = Integer.valueOf(cad);
        } while (a < 0 || a > 9999);
        
        if (a < 10)
        {
            System.out.println ("Tiene 1 crfra");
        }
        else if (a < 100)
        {
            System.out.println ("Tiene 2 cifras");
        }
        else if (a < 1000)
        {
            System.out.println ("Tiene 3 cifras");
        }
        else
        {
            System.out.println ("Tiene 4 cifras");
        }
    }
}
