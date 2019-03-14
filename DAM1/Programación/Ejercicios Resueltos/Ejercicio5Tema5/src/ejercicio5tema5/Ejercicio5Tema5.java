package ejercicio5tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio5Tema5
{

    public static void main(String[] args) throws IOException
    {
        int a, b, c;
        String cad;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        System.out.println ("Escribe un número");
        cad = bf.readLine();
        a = (int) Float.parseFloat (cad);
        
        System.out.println ("Escribe otro número");
        cad = bf.readLine();
        b = (int) Float.parseFloat (cad);
        
        System.out.println ("Escribe otro número mas");
        cad = bf.readLine();
        c = (int) Float.parseFloat (cad);
        
        if (a>b)
        {
            if (a>c)
            {
                if (b>c)
                {
                    System.out.println ("Orden: \n" + a + "\n" + b + "\n" + c);
                }
                else
                {
                    System.out.println ("Orden: \n" + a + "\n" + c + "\n" + b);
                }
            }
            else
            {
                System.out.println ("Orden: \n" + c + "\n" + a + "\n" + b);
            }
        }
        else
        {
            if (b>c)
            {
                if (a>c)
                {
                    System.out.println ("Orden: \n" + b + "\n" + a + "\n" + c);
                }
                else
                {
                    System.out.println ("Orden: \n" + b + "\n" + c + "\n" + a);
                }
            }
            else
            {
                System.out.println ("Orden: \n" + c + "\n" + b + "\n" + a);
            }
        }
    }
}
