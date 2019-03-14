
package ejercicio63tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio63Tema5
{

    public static void main(String[] args) throws IOException
    {
        int num, tri = 3;
        boolean cuadrado = false, triangular = false;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        do
        {
            System.out.println("Escribe un número");
            num = Integer.parseInt(bf.readLine());
        } while (num < 3);
        
        if ((int) Math.pow((int) Math.sqrt(num), 2) == num)
        {
            cuadrado = true;
        }
        
        int i = 3;
        while (tri < num)
        {
            tri += i;
            i++;
        }
        
        if (tri == num)
        {
            triangular = true;
        }
        
        if (triangular && cuadrado)
        {
            System.out.println("Sí es apilable de ambas formas");
        }
        else
        {
            System.out.println("No es apilable de ambas formas");
        }
    }
}
