
package ejercicio4tema4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio4Tema4
{

    public static void main(String[] args) throws IOException
    {
        float recorrido_inicial = 5.5f;
        final float velocidad = 3.2f;
        float segundos;
        float recorrido;
        String cad;
        
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        System.out.println ("Escribe los segundos que se mueve");
         //Obtener el número en formato cadena
        cad = bf.readLine ();
        //Convertir la cadena a número
        segundos = Float.parseFloat (cad);
        
        recorrido = (velocidad * segundos) + recorrido_inicial;
        System.out.println ("ha recorrido " + recorrido + " metros");
    }
    
}
