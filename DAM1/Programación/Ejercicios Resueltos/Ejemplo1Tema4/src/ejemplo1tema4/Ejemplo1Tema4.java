
package ejemplo1tema4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejemplo1Tema4
{
    public static void main(String[] args) throws IOException
    {
        String cad;
        InputStreamReader ir;
        BufferedReader bf;
        
        ir = new InputStreamReader (System.in);
        bf = new BufferedReader (ir);
        System.out.println ("Introduzca su nombre");
        
        cad = bf.readLine ();
        System.out.println ("Te llamas: " + cad);
    }
}
