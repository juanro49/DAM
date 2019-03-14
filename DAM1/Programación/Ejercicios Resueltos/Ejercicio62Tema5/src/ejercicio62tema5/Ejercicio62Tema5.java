
package ejercicio62tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio62Tema5
{

    public static void main(String[] args) throws IOException
    {
        int num;
        boolean cuadrado = false;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        do
        {
            System.out.println("Escribe un número");
            num = Integer.parseInt(bf.readLine());
        } while (num < 0);
        
        if ((int) Math.pow((int) Math.sqrt(num), 2) == num)
        {
            cuadrado = true;
        }
        
         if (cuadrado)
        {
            System.out.println("Sí es apilable");
        }
        else
        {
            System.out.println("No es apilable");
        }
    }
}
