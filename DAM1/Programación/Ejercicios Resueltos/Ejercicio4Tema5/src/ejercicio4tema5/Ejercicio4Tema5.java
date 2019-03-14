
package ejercicio4tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio4Tema5
{

    public static void main(String[] args) throws IOException
    {
        int a, b;
        String cad1, cad2;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        System.out.println ("Escribe un número");
        cad1 = bf.readLine();
        a = (int) Float.parseFloat (cad1);
        
        System.out.println ("Escribe otro número");
        cad2 = bf.readLine();
        b = (int) Float.parseFloat (cad2);
        
        if (a > b)
        {
            System.out.println ("Orden: \n" + a + "\n" + b);
        }
        else
        {
            System.out.println ("Orden: \n" + b + "\n" + a);
        }
    }
}
