
package ejercicio50tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio50Tema5
{

    public static void main(String[] args) throws IOException
    {
        int a1, m1, d1, a2, m2, d2, edad;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        do
        {
            System.out.println("Escribe el día actual");
            d1 = Integer.parseInt(bf.readLine());
        }while (d1 < 0 || d1 > 31);
        
        do
        {
            System.out.println("Escribe el mes actual");
            m1 = Integer.parseInt(bf.readLine());
        }while (m1 < 0 || m1 > 12);
        
        do
        {
            System.out.println("Escribe el año actual");
            a1 = Integer.parseInt(bf.readLine());
        }while (a1 < 0);
        
        do
        {
            System.out.println("Escribe el día de nacimiento");
            d2 = Integer.parseInt(bf.readLine());
        }while (d2 < 0 || d2 > 31);
        
        do
        {
            System.out.println("Escribe el mes de nacimiento");
            m2 = Integer.parseInt(bf.readLine());
        }while (m2 < 0 || m2 > 12);
        
        do
        {
            System.out.println("Escribe el año de nacimiento");
            a2 = Integer.parseInt(bf.readLine());
        }while (a2 < 0);
        
        edad = a1 - a2;
        
        if (m1 < m2)
        {
            edad--;
        }
        else if (m1 == m2)
            {
                if (d1 < d2)
                {
                    edad--;
                }
            }
        
        System.out.println("La edad es " + edad);
    }
}
