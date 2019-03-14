// Programa que muestra todas las entradas del directorio "c:\\windows".

package ejercicio1ficheros1tema3;

import java.io.File;

/**
 *
 * @author usuario
 */
public class Ejercicio1Ficheros1Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f = new File("C:\\Windows");
        
        File[] ficheros = f.listFiles();
        
        for (int i = 0; i < ficheros.length; i++)
        {
            System.out.println(ficheros[i].getName());
        }
    }
    
}
