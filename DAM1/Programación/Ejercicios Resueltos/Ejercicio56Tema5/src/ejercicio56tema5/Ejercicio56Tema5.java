
package ejercicio56tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio56Tema5
{

    public static void main(String[] args) throws IOException
    {
        int n, aux, count = 0;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        do
        {
            System.out.println("Escribe un número");
            n = Integer.parseInt(bf.readLine());
        } while (n < 0);
        
        aux = n;
        
        while (n != 0)
        {
            n = n / 10;
            count++;
        }
        
        System.out.println("Se necesitan " + count + " dígitos para escribir " + aux);
    }   
}
