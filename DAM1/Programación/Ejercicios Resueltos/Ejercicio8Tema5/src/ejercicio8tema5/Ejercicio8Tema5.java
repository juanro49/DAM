
package ejercicio8tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio8Tema5
{

    public static void main(String[] args) throws IOException
    {
        int a, count;
        String cad;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        System.out.println ("Escribe el número a mostrar alrevés");
        cad = bf.readLine();
        a = Integer.valueOf(cad);
        
        while (a != 0)
        {
            count = a%10;
            System.out.print (count);
            a = a / 10;
        }
    }
}
