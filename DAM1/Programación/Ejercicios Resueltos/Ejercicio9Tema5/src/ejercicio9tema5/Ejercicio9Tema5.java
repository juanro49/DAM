
package ejercicio9tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio9Tema5
{

    public static void main(String[] args) throws IOException
    {
        int a, resto, b, reverse = 0;
        String cad;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        System.out.println ("Escribe el número");
        cad = bf.readLine();
        a = Integer.valueOf(cad);
        b = a;
        
        while (a != 0)
        {
            resto = a%10;
            a = a / 10;
            reverse = reverse  * 10 + resto;
        }
        if (reverse == b)
        {
            System.out.println ("El número es capicúa");
        }
        else
        {
            System.out.println ("El número no es capicúa");
        }
    }
}