
package ejercicio47tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio47Tema5
{

    public static void main(String[] args) throws IOException
    {
        int n1, n2, mayor, menor, suma = 0;
        
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
        
        if (n1 < n2)
        {
            mayor = n2;
            menor = n1;
        }
        else
        {
            mayor = n1;
            menor = n2;
        }
        
        for (int i = menor; i <= mayor; i++)
        {
            if (i % 2 != 0)
            {
                suma += i;
            }
        }
        
        System.out.println("La suma de los impares entre " + menor + " y " + mayor + " es " + suma);
    }
}
