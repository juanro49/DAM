
package ejercicio4tema6;

import java.util.Scanner;

public class Ejercicio4Tema6
{
    public static void main(String[] args)
    {
        String cadena1, cadena2, aux;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Introduce la primera cadena");
        cadena1 = entrada.nextLine();
        
        System.out.println("Introduce la segunda cadena");
        cadena2 = entrada.nextLine();
        
        aux = cadena2.toUpperCase();
        cadena1 = cadena1.replace(cadena2, aux);
        
        System.out.println(cadena1);
    }
}
