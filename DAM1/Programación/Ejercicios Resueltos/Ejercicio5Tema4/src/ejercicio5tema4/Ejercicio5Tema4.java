
package ejercicio5tema4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio5Tema4 {

    public static void main(String[] args) throws IOException
    {
        int a, b, c, x1, x2, x3, discriminante;
        String cada, cadb, cadc;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
         System.out.println ("Escribe el valor de a");
         //Obtener el número en formato cadena
        cada = bf.readLine ();
        //Convertir la cadena a número
        a = (int) Float.parseFloat (cada);
        
        if (a==0)
        {
            System.out.println ("No hay ecuación de segundo grado");
        }
        
        else
        {
            System.out.println ("Escribe el valor de b");
            //Obtener el número en formato cadena
            cadb = bf.readLine ();
            //Convertir la cadena a número
            b = (int) Float.parseFloat (cadb);
            
            System.out.println ("Escribe el valor de c");
            //Obtener el número en formato cadena
            cadc = bf.readLine ();
            //Convertir la cadena a número
            c = (int) Float.parseFloat (cadc);
            
            discriminante = (int) (Math.pow(b, 2) - 4 * a * c);
            
            if (discriminante < 0)
            {
                System.out.println ("No hay solución");
            }
            
            if (discriminante > 0)
            {
                x1 = (int) (-b + Math.sqrt(discriminante) / (2 * a));
                x2 = (int) (-b - Math.sqrt(discriminante) / (2 * a));
                System.out.println ("El resultado es " + x1 + " y " + x2);
            }
            
            if (discriminante == 0)
            {
                x3 = -b / (2 * a);
                System.out.println ("El resultado es" + x3);
            }
        }
    }
    
}
