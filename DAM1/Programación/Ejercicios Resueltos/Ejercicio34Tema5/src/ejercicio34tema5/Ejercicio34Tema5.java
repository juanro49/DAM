
package ejercicio34tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio34Tema5
{

    public static void main(String[] args) throws IOException
    {
        int n, sueldo, max, min;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        System.out.println ("Escribe un número");
        n = Integer.valueOf(bf.readLine());
        
        if (n < 1)
        {
            System.out.println("No hay sueldos");
        }
        else
        {
            System.out.println("Escribe un sueldo");
            sueldo = Integer.valueOf(bf.readLine());
        
            max = sueldo;
            min = sueldo;
        
            for (int sueldos = 1; sueldos <= n - 1; sueldos++)
            {
                System.out.println("Escribe otro sueldo");
                sueldo = Integer.valueOf(bf.readLine());
            
                if (sueldo > max)
                {
                    max = sueldo;
                }
                else if (sueldo < min)
                {
                    min = sueldo;
                }
            }
        
            System.out.println("Sueldo máximo: " + max);
            System.out.println("Sueldo mínimo: " + min);
        }
    }
}
