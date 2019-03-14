
package ejercicio45tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio45Tema5
{

    public static void main(String[] args) throws IOException
    {
        int n;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        do
        {
            System.out.println("Escribe un número");
            n = Integer.parseInt(bf.readLine());
        }while (n < 0);
        
        System.out.println(n + "primeras potencias de 2");
        
        for (int i = 1; i < n; i++)
        {
            System.out.println("2 elevado a " + i + " = " + (int) Math.pow(2, i));
        }
    }
}
