
package ejercicio3tema6;


import java.io.IOException;
import java.util.Scanner;

public class Ejercicio3Tema6
{

    public static void main(String[] args) throws IOException
    {
        String a;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Escribe una cadena");
        a = sc.nextLine();
        
        for (int i = a.length() - 2; i >= 0; i--)
        {
            a += a.charAt(i);
        }
        
        System.out.println(a);
    }
}
