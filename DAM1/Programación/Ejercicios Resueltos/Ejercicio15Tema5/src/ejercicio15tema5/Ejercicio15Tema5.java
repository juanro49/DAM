
package ejercicio15tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio15Tema5
{

    public static void main(String[] args) throws IOException
    {
        int num, cuadrado;
        String cad;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        do
        {
            System.out.println ("Introduce un número");
            cad = bf.readLine ();
            num = Integer.valueOf(cad);
            
            if (num >= 0)
            {
                cuadrado = (int) Math.pow(num, 2);
                System.out.println ("El cuadrado es: " + cuadrado);
            }
        } while (num >= 0);
    }
}
