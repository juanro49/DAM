
package ejercicio14tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio14Tema5
{

    public static void main(String[] args) throws IOException
    {
         int numero, decenas, unidades;
        String cad;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        do
        {
            System.out.println ("Escribe el número");
            cad = bf.readLine();
            numero = Integer.valueOf(cad);
        } while (numero < 0 || numero > 99);
        
        decenas = numero / 10;
        unidades = numero % 10;
        
        if (numero < 16 && numero > 10)
        {
            switch (numero)
            {
                case 11: System.out.println ("once");
                    break;
                case 12: System.out.println ("doce");
                    break;
                case 13: System.out.println ("trece");
                    break;
                case 14: System.out.println ("catorce");
                    break;
                case 15: System.out.println ("quince");
                    break;
            }
        }
        else
        {
            switch (decenas)
            {
                case 0: System.out.print ("");
                    break;
                case 1: System.out.print ("diez");
                    break;
                case 2: System.out.print ("veinte");
                    break;
                case 3: System.out.print ("treinta");
                    break;
                case 4: System.out.print ("cuarenta");
                    break;
                case 5: System.out.print ("cincuenta");
                    break;
                case 6: System.out.print ("sesenta");
                    break;
                case 7: System.out.print ("setenta");
                    break;
                case 8: System.out.print ("ochenta");
                    break;
                case 9: System.out.print ("noventa");
                    break;
            }
        
            if (decenas != 0 && unidades != 0)
            {
                System.out.print (" y ");
            }
        
            switch (unidades)
            {
                case 0:
                    if (decenas == 0)
                    {
                        System.out.println ("cero");
                    }
                    else
                    {
                        System.out.println ("");
                    }
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
            }
        }
    }    
}
