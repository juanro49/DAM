
package ejercicio54tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio54Tema5
{

    public static void main(String[] args) throws IOException
    {
        int n1, n2, aux1,aux2, r, cociente, mcm;
        
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
        
        aux1 = n1;
        aux2 = n2;
        
        do
        {
            cociente = n1 / n2;
            r = n1 % n2;
            
            if (r != 0)
            {
                n1 = n2;
                n2 = r;
            }
        } while (r != 0);
        
        System.out.println("El MCD es " + n2);
        
        mcm = (aux1 * aux2) / n2;
        
        System.out.println("El mcm es " + mcm);
    }
}
