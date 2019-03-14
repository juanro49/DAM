
package ejercicio53tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio53Tema5
{

    public static void main(String[] args) throws IOException
    {
        int n, md;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        do
        {
            System.out.println("Escribe un número");
            n = Integer.parseInt(bf.readLine());
        }while (n < 0);
        
        md = n/2;
        
        while (n % md != 0)
        {
            md--;
        }
        
        System.out.println("El mayor divisor es " + md);
    }
}
