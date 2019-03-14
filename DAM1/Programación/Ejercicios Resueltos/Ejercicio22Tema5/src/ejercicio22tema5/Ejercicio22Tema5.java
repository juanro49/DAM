
package ejercicio22tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio22Tema5
{

    public static void main(String[] args) throws IOException
    {
        int n;
        String cad;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        System.out.println("Escribe un número");
        cad = bf.readLine();
        n = Integer.valueOf(cad);
        
        for (int i = 1; i <= n ; i++)
        {
            System.out.println("El número es " + i);
        }
    }
}
