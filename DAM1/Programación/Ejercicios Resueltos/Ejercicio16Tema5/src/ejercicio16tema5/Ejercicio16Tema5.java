
package ejercicio16tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio16Tema5 {

    public static void main(String[] args) throws IOException
    {
        int num;
        String cad;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        do
        {
            System.out.println ("Escribe un número");
            cad = bf.readLine();
            num = Integer.valueOf(cad);
            
            if (num < 0)
            {
                System.out.println ("El número es negativo");
            }
            if (num > 0)
            {
                System.out.println ("El número es positivo");
            }
        } while (num != 0);
    }
}
