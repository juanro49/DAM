
package ejercicio61tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio61Tema5
{

    public static void main(String[] args) throws IOException
    {
        int num, tri = 3;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        do
        {
            System.out.println("Escribe un número");
            num = Integer.parseInt(bf.readLine());
        } while (num < 3);
        
        int i = 3;
        while (tri < num)
        {
            tri += i;
            i++;
        }
        
        if (tri != num)
        {
            System.out.println("No es apilable");
        }
        else
        {
            System.out.println("Sí es apilable");
        }
    }
}
