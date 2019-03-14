// Programa que diga cuál es  el directorio actual.

package ejercicio2ficheros1tema3;

import java.io.File;

/**
 *
 * @author usuario
 */
public class Ejercicio2Ficheros1Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        File f = new File(".");
        
        System.out.println(f.getAbsolutePath());
    }
    
}
