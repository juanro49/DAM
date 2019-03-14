
package garciasanchez_juanroberto_ejercicio1_2eva;

import java.util.Scanner;

public class GarciaSanchez_JuanRoberto_Ejercicio1_2EVA
{
    public static boolean validar (String dni)
    {
        String letra;
        int numero, posicion;
        String letras [] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        boolean correcto = false;
        
        letra = dni.substring(8,9);
        if(dni.startsWith("X"))
        {
            dni = dni.replaceFirst("X", "0");
        }
        
        if(dni.startsWith("Y"))
        {
            dni = dni.replaceFirst("Y", "1");
        }
        
        if(dni.startsWith("Z"))
        {
            dni = dni.replaceFirst("Z", "2");
        }
        
        boolean b = true;
        
        for(int i = 0; i < 8; i++)
        {
            if(dni.charAt(i) < '0' || dni.charAt(i) > '9')
            {
                b = false;
            }
        }
        
        if(b)
        {
            numero = Integer.parseInt(dni.substring(0,8));
            posicion = numero % 23;
        
            if(letra.equals(letras[posicion]))
            {
                correcto = true;
            }
        }
        else
        {
            System.out.println("Cadena no válida");
        }
        
        
        /*String num [] = new String [] {"0","1","2","3","4","5","6","7","8","9"};
            
        for (int i = 0; i < num.length; i++)
        {
            if(dni.substring(0,1).equals(num[i]))
            {
                numero = Integer.parseInt(dni.substring(0,8));
                posicion = numero % 23;
        
                if(letra.equals(letras[posicion]))
                {
                    correcto = true;
                }
            }
        }*/
        
        return correcto;
    }
    public static void main(String[] args)
    {
        String dni;
        boolean correcto;
            
        Scanner sc = new Scanner (System.in);
        
        do
        {
            System.out.println("Introduce identificador NIF/NIE");
            dni = sc.nextLine();
            
            if(dni.length() < 9 || dni.length() > 9)
            {
                System.out.println("El identificador NIF/NIE no tiene la longitud correcta, inténtalo de nuevo\n");
            }
        }while(dni.length() < 9 || dni.length() > 9);
        
        dni = dni.toUpperCase();
        
        correcto = validar(dni);
        
        if(correcto)
        {
            System.out.println("Identificador NIF/NIE SI es correcto");
        }
        else
        {
            System.out.println("Identificador NIF/NIE NO es correcto");
        }
    }
}
