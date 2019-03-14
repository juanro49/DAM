
package ejercicio1tema6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1Tema6
{

    public static void main(String[] args) throws IOException
    {
        String a, reverse = "";
        int longitud;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        System.out.println("Escribe una cadena");
        a = String.valueOf(bf.readLine());
        
        longitud = a.length();
        
        for (int i = longitud - 1; i >= 0; i--)
        {
            reverse += a.charAt(i);
        }
        
        System.out.println(reverse);
    }
}
