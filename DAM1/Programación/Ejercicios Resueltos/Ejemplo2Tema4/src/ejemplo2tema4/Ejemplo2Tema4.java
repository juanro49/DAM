
package ejemplo2tema4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejemplo2Tema4
{
    public static void main(String[] args) throws IOException
    {
        String cad;
        long result = 1;
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        System.out.println ("Introduzca el número");
        
        //Obtener el número en formato cadena
        cad = bf.readLine ();
        
        //Convertir la cadena a número
        long num = Long.parseLong (cad);
        
        for (int i = 1; i <= num; i++)
        {
            result *=i;
        }
        
        System.out.println ("El factorial de " + num + " es " + result);
    }
}