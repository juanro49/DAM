
package ejercicio69tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio69Tema5
{

    public static void main(String[] args) throws IOException
    {
        int a, b, c, p;
        float A;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        do
        {
            do
            {
                System.out.println("Escribe la longitud del lado a");
                a = Integer.parseInt(bf.readLine());
            } while (a < 0);
        
            do
            {
                System.out.println("Escribe la longitud del lado b");
                b = Integer.parseInt(bf.readLine());
            } while (b < 0);
        
            do
            {
                System.out.println("Escribe la longitud del lado c");
                c = Integer.parseInt(bf.readLine());
            } while (c < 0);
            
            if (a + b < c || a + c < b || b + c < a)
            {
                System.out.println("No es triángulo, vuelve a intentarlo");
            }
        } while (a + b < c || a + c < b || b + c < a);
        
        p = a + b + c / 2;
        
        A = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
        
        System.out.println("El área es " + A);
    }
}
