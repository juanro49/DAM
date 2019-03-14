
package ejercicio2tema6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2Tema6
{

    public static void main(String[] args) throws IOException
    {
        String a, reverse = "";
        int longitud;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        System.out.println("Escribe una cadena");
        a = String.valueOf(bf.readLine());
        
        a = a.replace(" ", "");
        a = a.replace(",", "");
        
        longitud = a.length();
        
        for (int i = longitud - 1; i >= 0; i--)
        {
            reverse += a.charAt(i);
        }
        
        if (a.equalsIgnoreCase(reverse))
        {
            System.out.println(a + " es palíndromo");
        }
        else
        {
            System.out.println(a + " no es palíndromo");
        }
    }
}
