
package ejercicio18tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio18Tema5
{

    public static void main(String[] args) throws IOException
    {
        int num, count = 0;
        String cad;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        do
        {
            System.out.println ("Escribe un número");
            cad = bf.readLine();
            num = Integer.valueOf(cad);
            
            if (num >= 0)
            {
                count++;
            }
        } while (num >= 0);
        
        System.out.println ("Se han introducido " + count + " números");
    }
}
