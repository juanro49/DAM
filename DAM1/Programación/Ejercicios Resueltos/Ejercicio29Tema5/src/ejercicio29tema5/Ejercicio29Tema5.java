
package ejercicio29tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio29Tema5
{

    public static void main(String[] args) throws IOException
    {
        int edad, mediaE = 0, sumaE = 0, countE = 0, countA = 0;
        float altura, mediaA = 0, sumaA = 0;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        for (int i = 1; i <= 5; i++)
        {
            System.out.println("Introduce edad");
            edad = Integer.valueOf(bf.readLine());
            System.out.println("Introduce altura en cm");
            altura = Integer.valueOf(bf.readLine());
            
            sumaE += edad;
            sumaA += altura;
            
            if (edad >= 18)
            {
                countE++;
            }
            if (altura > 175)
            {
                countA++;
            }
        }
        
        mediaE = sumaE / 5;
        mediaA = sumaA / 5;
        
        System.out.println ("Media edad: " + mediaE);
        System.out.println ("Media altura: " + mediaA);
        System.out.println ("Mayores 18: " + countE);
        System.out.println("Mas de 175cm: " + countA);
    }
}
