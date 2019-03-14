
package garcia.sanchez_juan.roberto_ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GarciaSanchez_JuanRoberto_Ejercicio1
{

    public static void main(String[] args) throws IOException
    {
        int n, aux, aux1, aux2, count = 0, suma = 0;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader  (System.in));
        
        do
        {
            System.out.println("Escribe un numero");
            n = Integer.parseInt(bf.readLine());
        }while (n < 0);
        
        aux = n;
        aux1 = n;
        
        while (aux != 0)
        {
            aux /= 10;
            count++;
        }
        
        while (aux1 != 0)
        {
            aux2 = aux1 % 10;
            suma = suma + (int) Math.pow(aux2, count);
            aux1 /= 10;
        }
        
        if (n != suma)
        {
            System.out.println(n + " no es narcisista");
        }
        else
        {
            System.out.println(n + " es narcisista");
        }
    }
}
