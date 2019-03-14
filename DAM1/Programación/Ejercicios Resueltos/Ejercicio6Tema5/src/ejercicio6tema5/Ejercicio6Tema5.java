
package ejercicio6tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio6Tema5
{

    public static void main(String[] args) throws IOException
    {
        int a, b, c, d, aux;
        String cad;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        System.out.println ("Escribe el primer número");
        cad = bf.readLine();
        a = (int) Float.parseFloat(cad);
        
        System.out.println ("Escribe el segundo número");
        cad = bf.readLine();
        b = (int) Float.parseFloat(cad);
        
        System.out.println ("Escribe el tercer número");
        cad = bf.readLine();
        c = (int) Float.parseFloat(cad);
        
        System.out.println ("Escribe el cuarto número");
        cad = bf.readLine();
        d = (int) Float.parseFloat (cad);
        
        if (a<b)
        {
            aux = b;
            b = a;
            a = aux;
        }
        if (a<c)
        {
            aux = c;
            c = a;
            a = aux;
        }
        if (a<d)
        {
            aux = d;
            d = a;
            a = aux;
        }
        if (b<c)
        {
            aux = c;
            c = b;
            b = aux;
        }
        if (b<d)
        {
            aux = d;
            d = b;
            b = aux;
        }
        if (c<d)
        {
            aux = d;
            d = c;
            c = aux;
        }
        System.out.println ("Orden: \n" 
                + a + "\n" 
                + b + "\n" 
                + c + "\n" 
                + d);
    }
}
