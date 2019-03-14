
package ejercicio30tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio30Tema5
{

    public static void main(String[] args) throws IOException
    {
        int num, producto;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        do
        {
            System.out.println ("Introduce un número");
            num = Integer.valueOf(bf.readLine());
        } while (num <= 0 || num >10);
        
        for (int multi = 0; multi <= 10; multi++)
        {
            producto = num * multi;
            System.out.println (num + "x" + multi + "=" + producto);
        }
    }
}
