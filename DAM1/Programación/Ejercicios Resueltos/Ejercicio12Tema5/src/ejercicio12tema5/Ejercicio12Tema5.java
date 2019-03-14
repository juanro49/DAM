
package ejercicio12tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio12Tema5
{

    public static void main(String[] args) throws IOException
    {
        int hora, minuto, segundo;
       String cad;
       
       BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
       
       do
       {
           System.out.println ("Escribe la hora");
           cad = bf.readLine();
           hora = Integer.valueOf(cad);
       } while (hora > 23 || hora < 0);
       
       do
       {
           System.out.println ("Escribe el minuto");
           cad = bf.readLine();
           minuto = Integer.valueOf(cad);
       } while (minuto > 59 || minuto < 0);
       
       do
       {
           System.out.println ("Escribe el segundo");
           cad = bf.readLine();
           segundo = Integer.valueOf(cad);
       } while (segundo > 59 || segundo < 0);
       
       segundo++;
       
       if (segundo > 59)
       {
           segundo = 0;
           minuto++;
           
           if (minuto > 59)
           {
               minuto = 0;
               hora++;
               
               if (hora > 23)
               {
                   hora = 0;
               }
           }
       }
       System.out.println (hora + ":" + minuto + ":" + segundo);
    }
}
