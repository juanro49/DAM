
package ejercicio13tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio13Tema5
{
    public static void main(String[] args) throws IOException
    {
        int nota;
        String cad;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        do
        {
            System.out.println ("Escribe la nota");
            cad = bf.readLine();
            nota = Integer.valueOf(cad);
        } while (nota < 0 || nota > 10);
        
        switch (nota)
        {
            case 0: System.out.println ("cero");
                break;
            case 1: System.out.println ("uno");
                break;
            case 2: System.out.println ("dos");
                break;
            case 3: System.out.println ("tres");
                break;
            case 4: System.out.println ("cuatro");
                break;
            case 5: System.out.println ("cinco");
                break;
            case 6: System.out.println ("seis");
                break;
            case 7: System.out.println ("siete");
                break;
            case 8: System.out.println ("ocho");
                break;
            case 9: System.out.println ("nueve");
                break;
            case 10: System.out.println ("diez");
                break;
        }
    }
}
