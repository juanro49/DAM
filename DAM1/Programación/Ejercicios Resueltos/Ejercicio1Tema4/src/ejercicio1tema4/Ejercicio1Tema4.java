
package ejercicio1tema4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1Tema4
{

    public static void main(String[] args) throws IOException
    {
        final float PI = 3.1416f;
        String cad;
        float radio;
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        System.out.println ("Indica el radio del circulo");
        
         //Obtener el número en formato cadena
        cad = bf.readLine ();
        //Convertir la cadena a número
        radio = Float.parseFloat (cad);
        
        float area = PI * (float) Math.pow(radio, 2);
        System.out.println ("El area del circulo es " + area);
    }
}
