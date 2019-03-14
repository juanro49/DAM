/*Calcular letra DNI. Se obtiene dividiendo el número entre 23 y el resto de la división se le asigna la
    letra según la equivalencia del siguiente vector:
    T R W A G M Y F P D X B N J Z S Q V H L C K E*/

package ejercicio4dictema8;

import java.util.Scanner;

public class Ejercicio4dicTema8
{
    public static boolean verificarDNI (String dni)
    {
        String letra;
        int numero, posicion;
        String letras [] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        boolean correcto = false;
        
        letra = dni.substring(8,9);
        numero = Integer.parseInt(dni.substring(0,8));
        
        posicion = numero % 23;
        
        if(letra.toUpperCase().equals(letras[posicion]))
        {
            correcto = true;
        }
        
        return correcto;
    }
    public static void main(String[] args)
    {
        String dni;
        boolean correcto;
            
        Scanner sc = new Scanner (System.in);
        
        do
        {
            System.out.println("Introduce el DNI");
            dni = sc.nextLine();
        }while(dni.length() < 9 || dni.length() > 9);
        
        
        correcto = verificarDNI(dni);
        
        if(correcto)
        {
            System.out.println("DNI correcto");
        }
        else
        {
            System.out.println("DNI incorrecto");
        }
    }
}
