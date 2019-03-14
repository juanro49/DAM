
package ejercicio7btema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio7bTema5 {

    public static void main(String[] args) throws IOException
    {
        int a, count = 0;
        String cad;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        System.out.println ("Escribe un número cualquiera");
        cad = bf.readLine();
        a = Integer.valueOf(cad);
        
        do
        {
            a = a/10;
            count++;
        } while (a != 0);
        System.out.println ("El número tiene " + count + " cifras");
    }
}