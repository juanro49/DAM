
package ejercicio52tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio52Tema5
{

    public static void main(String[] args) throws IOException
    {
        int n1, n2, mayor, menor, count = 0;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        do
        {
            System.out.println("Escribe el dividendo");
            n1 = Integer.parseInt(bf.readLine());
        }while (n1 < 0);
        
        do
        {
            System.out.println("Escribe el divisor");
            n2 = Integer.parseInt(bf.readLine());
        }while (n2 < 1);
        
        while (n1 >= n2)
        {
            n1 -= n2;
            count++;
        }
        
        System.out.println("El cociente es " + count + " y el resto es " + n1);
    }
}