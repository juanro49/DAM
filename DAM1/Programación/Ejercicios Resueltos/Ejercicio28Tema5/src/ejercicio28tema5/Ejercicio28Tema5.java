
package ejercicio28tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio28Tema5
{

    public static void main(String[] args) throws IOException
    {
        int sueldo, suma = 0, mayor = 0;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        for (int i = 0; i < 10; i++)
        {
            System.out.println ("Introduce un sueldo");
            sueldo = Integer.valueOf(bf.readLine());
            
            if (sueldo > 1000)
            {
                mayor++;
            }
            
            suma += sueldo;
        }
        
        System.out.println("Mayores de 1000 " + mayor);
        System.out.println("La suma es " + suma);
    }
}
