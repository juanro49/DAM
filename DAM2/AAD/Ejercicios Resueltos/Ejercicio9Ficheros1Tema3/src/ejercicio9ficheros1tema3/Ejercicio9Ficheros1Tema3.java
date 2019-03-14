/* Escribir un programa que liste el contenido de un directorio pasado como 
argumento, de cada elemento debe mostrar: tipo (fichero o directorio)., nombre 
y si es fichero el tamaño.
 */

package ejercicio9ficheros1tema3;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio9Ficheros1Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        File f;
        File lista[];
        
        //El directorio a listar ya ha sido pasado en las propiedades del proyecto (sección ejecutar y argumentos)
        f = new File(args[0]);
        
        if(f.exists())
        {
            lista = f.listFiles();
            
            if(lista.length == 0)
            {
                System.out.println("El directorio está vacío");
            }
            else
            {
                for(int i = 0; i < lista.length; i++)
                {
                    if(lista[i].isDirectory())
                    {
                        System.out.println("Directorio " + lista[i].getName());
                    }

                    if(lista[i].isFile())
                    {
                        System.out.println("Archivo " + lista[i].getName() + "\t\t" + lista[i].length() + " Bytes");
                    }
                }
            }
        }
        else
        {
            System.out.println("El directorio no existe");
        }
    }
    
}
