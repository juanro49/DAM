
package ejercicio57atema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio57aTema5 {

    public static void main(String[] args) throws IOException
    {
        int num1, num2, aux1, aux2, cont1 = 0, cont2 = 0;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        do
        {
            System.out.println("Escribe un número");
            num1 = Integer.parseInt(bf.readLine());
        } while (num1 < 0);
        
        do
        {
            System.out.println("Escribe un número");
            num2 = Integer.parseInt(bf.readLine());
        } while (num2 < 0);
        
        aux1 = num1;
        aux2 = num2;
        
        for (int i = 2; i <= num1 - 1; i++)
        {
            if (num1 % i == 0)
            {
                cont1++;
            }
        }
        
        for (int j = 2; j <= num2 - 1; j++)
        {
            if (num1 % j == 0)
            {
                cont2++;
            }
        }
        
        if (cont1 != 0 && cont2 != 0)
        {
            System.out.println("No son primos");
        }
        else
        {
            if (aux1 + 2 == aux2 || aux2 + 2 == aux1)
            {
                System.out.println("Son gemelos");
            }
            else
            {
                System.out.println("Son primos pero no gemelos");
            }
        }
    }
}
