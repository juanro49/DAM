
package ejercicio8tema4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio8Tema4
{

    public static void main(String[] args) throws IOException
    {
        int i, j;
        double x, y;
        String cad;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        System.out.println ("Escribe el valor de i");
        cad = bf.readLine();
        i = (int) Float.parseFloat(cad);
        
    }
    
}
