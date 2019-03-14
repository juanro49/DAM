
package ejercicio11tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio11Tema5
{

    public static void main(String[] args) throws IOException
    {
       int dia, mes, año;
       String cad;
       
       BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
       
       System.out.println ("Escribe el día");
       cad = bf.readLine();
       dia = Integer.valueOf(cad);
       
       System.out.println ("Escribe el mes (número)");
       cad = bf.readLine();
       mes = Integer.valueOf(cad);
       
       System.out.println ("Escribe el año");
       cad = bf.readLine();
       año = Integer.valueOf(cad);
       
       if (año < 0)
       {
           System.out.println ("Fecha incorrecta");
       }
       else if (dia > 30)
       {
           switch (mes)
           {
               case 4:
               case 6:
               case 9:
               case 11: System.out.println ("Fecha incorrecta");
                   break;
               case 1:
               case 3:
               case 5:
               case 7:
               case 8:
               case 10:
               case 12: System.out.println ("Fecha correcta");
                   break;
           }
       }
       else if (dia > 28)
               {
                   switch (mes)
                   {
                       case 2: System.out.println ("Fecha incorrecta");
                           break;
                        case 1:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12: System.out.println ("Fecha correcta");
                            break;
                   }
               }
       else if (dia < 1)
       {
           System.out.println ("Fecha Incorrecta");
       }
       else if (mes < 1)
       {
           System.out.println ("Fecha Incorrecta");
       }
       else
       {
           System.out.println ("Fecha correcta");
       }
    }
}
