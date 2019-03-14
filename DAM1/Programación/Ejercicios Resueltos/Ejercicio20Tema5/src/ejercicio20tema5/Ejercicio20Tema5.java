
package ejercicio20tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio20Tema5 {

    public static void main(String[] args) throws IOException
    {
        int num, aux = 0;
        String cad;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        do
        {
            System.out.println("Escribe un número");
            cad = bf.readLine();
            num = Integer.valueOf(cad);
            
            aux = aux + num;
        } while (num != 0);
        
        System.out.println("La suma de todos los números es " + aux);
    }
}
