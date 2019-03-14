
package ejercicio51tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio51Tema5
{

    public static void main(String[] args) throws IOException
    {
        int n1, n2, suma = 0;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        do
        {
            System.out.println("Escribe un número");
            n1 = Integer.parseInt(bf.readLine());
        }while (n1 < 0);
        
        do
        {
            System.out.println("Escribe otro número");
            n2 = Integer.parseInt(bf.readLine());
        }while (n2 < 0);
        
        for (int i = 1; i <= n1; i++)
        {
            suma += n2;
        }
        
        System.out.println("El producto es " + suma);
    }
}
