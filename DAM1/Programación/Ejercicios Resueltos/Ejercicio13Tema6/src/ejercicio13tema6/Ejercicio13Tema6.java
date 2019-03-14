
package ejercicio13tema6;

import java.util.Scanner;

public class Ejercicio13Tema6
{
    public static void main(String[] args)
    {
        String mina, diamante = "<>";
        int cantidad = 0;
        
         
         Scanner sc = new Scanner (System.in);
         
         System.out.println("Escribe una cadena de caracteres formada solo por < y >");
         mina = sc.nextLine();
         
         while (mina.contains(diamante))
         {
             mina = mina.replaceFirst(diamante, "");
             cantidad++;
             System.out.println(mina);
         }
         
         System.out.println(cantidad);
    }
}
