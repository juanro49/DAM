
package ejercicio10tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio10Tema5
{

    public static void main(String[] args) throws IOException
    {
        int a;
        String cad;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        do
        {
             System.out.println ("Escribe una nota del 0 al 10");
             cad = bf.readLine();
             a = Integer.valueOf(cad);
        } while (a < 0 || a > 10);
        
        if (a < 5)
        {
            System.out.println ("Insuficiente");
        }
        else
        {
            switch (a)
            {
                case 5: System.out.println ("Suficiente");
                    break;
                case 6: System.out.println ("Bien");
                    break;
                case 7:
                case 8: System.out.println ("Notable");
                    break;
                case 9:
                case 10: System.out.println ("Sobresaliente");
                    break;
            }
        }
    }
}
