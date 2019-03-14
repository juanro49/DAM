
package ejercicio27tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ejercicio27Tema5 {

    public static void main(String[] args) throws IOException
    {
        int num, mediapos, medianeg, cont0 = 0, contpos = 0, contneg = 0, sumapos = 0, sumaneg = 0;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        for (int i = 10; i > 0; i--)
        {
            System.out.println ("Introduce un numero");
            num = Integer.valueOf(bf.readLine());
            
            if (num == 0)
            {
                cont0++;
            }
            else if (num > 0)
            {
                sumapos += num;
                contpos++;
            }
            else
            {
                sumaneg += num;
                contneg++;
            }
        }
        
         if (contpos != 0)
            {
                mediapos = sumapos / contpos;
                System.out.println("Media positivos = " + mediapos);
            }
            else
            {
                System.out.println ("No se han introducido positivos");
            }
            
            if (contneg != 0)
            {
                medianeg = sumaneg / contneg;
                System.out.println("Media negativos = " + medianeg);
            }
            else
            {
                System.out.println ("No se han introducido negativos");
            }
            
            System.out.println("Cantidad de ceros = " + cont0);
    }
}
