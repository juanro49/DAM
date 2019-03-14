
package ejercicio24tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio24Tema5 {

    public static void main(String[] args) throws IOException
    {
        int n, suma = 0;
        String cad;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        for (int i = 1; i <= 15; i++)
        {
            System.out.println("Escribe un número");
            cad = bf.readLine();
            n = Integer.valueOf(cad);
            
            suma = suma + n;
        }
        
        System.out.println ("La suma es " + suma);
    }
}
