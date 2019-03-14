
package ejercicio17tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio17Tema5
{

    public static void main(String[] args) throws IOException
    {
        int num;
        String cad;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        do
        {
            System.out.println("Escribe un número");
            cad = bf.readLine();
            num = Integer.valueOf(cad);
            
            if (num != 0)
            {
                if (num % 2 == 0)
                {
                    System.out.println ("El número es par");
                }
                else
                {
                    System.out.println("El número es impar");
                }
            }
        } while (num != 0);
    }    
}
