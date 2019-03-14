
package ejercicio33tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio33Tema5
{

    public static void main(String[] args) throws IOException
    {
        int nota, aprobados = 0, condicionales = 0, suspensos = 0;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        for (int alumno = 1; alumno <= 6; alumno++)
        {
            do
            {
                System.out.println ("Introduce una nota");
                nota = Integer.valueOf(bf.readLine());
            } while (nota <= 0 || nota > 10);
                
            if (nota == 4)
            {
                condicionales++;
            }
            else if (nota < 5)
            {
                suspensos++;
            }
            else
            {
                aprobados++;
            }
        }
        
        System.out.println ("Cantidad aprobados: " + aprobados);
        System.out.println("Cantidad de condicionales: " + condicionales);
        System.out.println("Cantidad de suspensos: " + suspensos);
    }
}
