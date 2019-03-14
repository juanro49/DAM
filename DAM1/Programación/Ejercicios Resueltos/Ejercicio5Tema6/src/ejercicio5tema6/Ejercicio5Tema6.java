
package ejercicio5tema6;

import java.util.Scanner;

public class Ejercicio5Tema6
{

    public static void main(String[] args)
    {
        String a, b;
        int count = 0;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Escribe la cadena a buscar");
        a = sc.nextLine();

        System.out.println("Escribe una cadena larga que contenga la anterior");
        b = sc.nextLine();
        
        while (b.indexOf(a) > -1)
        {
            a = a.substring(a.indexOf(b) + a.length(),b.length());
            count++;
        }
        
        System.out.println(count);
    }
}
