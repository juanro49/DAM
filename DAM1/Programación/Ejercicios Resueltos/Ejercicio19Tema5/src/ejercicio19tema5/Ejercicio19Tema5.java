
package ejercicio19tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio19Tema5
{

    public static void main(String[] args) throws IOException
    {
        int num1, num2;
        String cad;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        System.out.println("Escribe un número");
        cad = bf.readLine();
        num1 = Integer.valueOf(cad);
        
        do
        {
            System.out.println("Acierta el número");
            cad = bf.readLine();
            num2 = Integer.valueOf(cad);
            
            if (num2 > num1)
            {
                System.out.println("Mayor que el número");
            }
            else if (num2 < num1)
            {
                System.out.println("Menor que el número");
            }
            else
            {
                System.out.println("¡Acertaste!");
            }
        } while (num2 != num1);
    }
}
