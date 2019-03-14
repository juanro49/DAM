
package ejercicio21tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio21Tema5
{

    public static void main(String[] args) throws IOException
    {
        int num, aux = 0, media, count = 0;
        String cad;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        do
        {
            System.out.println("Escribe un número");
            cad = bf.readLine();
            num = Integer.valueOf(cad);
            
            if (num >= 0)
            {
                aux = aux + num;
                count++;
            }
        } while (num >= 0);
        
        if (count != 0)
        {
        media = aux / count;
        System.out.println("La media de todos los números es " + media);
        }
        else
        {
            System.out.println ("El número es negativo");
        }
    }
}
