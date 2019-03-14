
package ejercicio26tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio26Tema5 {

    public static void main(String[] args) throws IOException
    {
         int n, factorial = 1;
        String cad;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        System.out.println("Escribe un número");
        cad = bf.readLine();
        n = Integer.valueOf(cad);
        
        for (int i = n; i >= 1; i--)
        {
            factorial = factorial * i;
        }
        
        System.out.println ("Factorial es " + factorial);
    }
}
