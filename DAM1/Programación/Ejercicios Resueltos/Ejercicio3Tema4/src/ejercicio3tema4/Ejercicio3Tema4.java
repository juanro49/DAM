
package ejercicio3tema4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio3Tema4
{

    public static void main(String[] args) throws IOException
    {
        String cad;
        float num;
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        System.out.println ("Escribe un número");
         //Obtener el número en formato cadena
        cad = bf.readLine ();
        //Convertir la cadena a número
        num = Float.parseFloat (cad);
        
        float multiplicacion = num * 20;
        System.out.println ("La multiplicacion del numero por 20 es " + multiplicacion);
        
        float division = multiplicacion / 10;
        System.out.println ("La división de la multiplicación entre 10 es " + division);
        
        float suma = num + multiplicacion;
        System.out.println ("El resultado del número + la multiplicacion es " + suma);
        
        float division2 = suma / 10;
        System.out.println ("La  division de la suma entre 10 es " + division2);
        
        float resto = suma % 10;
        if (resto != 0)
        {
            System.out.println ("El resto de la division es " + resto);
        }
    }
}