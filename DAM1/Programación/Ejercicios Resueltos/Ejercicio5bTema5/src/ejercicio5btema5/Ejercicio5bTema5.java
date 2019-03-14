package ejercicio5btema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio5bTema5
{

    public static void main(String[] args) throws IOException
    {
        int a, b, c, aux;
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
        
       if (a<b) //Intercambio
       {
           aux = b;
           b = a;
           a = aux;
       }
       if (a<c) //Intercambio
       {
           aux = c;
           c = a;
           a = aux;
       }
       if (b<c) //Intercambio
       {
           aux = b;
           b = c;
           c = aux;
       }
       System.out.println ("Orden: \n" + a + "\n" + b + "\n" + c);
    }
}
