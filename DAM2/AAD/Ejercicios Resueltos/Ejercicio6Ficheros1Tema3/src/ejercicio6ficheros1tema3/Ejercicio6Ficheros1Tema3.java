/* Escribe un programa que muestre los atributos de un fichero o directorio cuyo 
nombre se pase como primer argumento. 

Nombre del archivo
Camino absoluto
Tamaño             
Si es Fichero              
Si es Directorio            
Última modificación
Si tiene permiso de escritura       
Si tiene permiso de lectura:         
Si tiene permiso de ejecución: 
*/

package ejercicio6ficheros1tema3;

import java.io.File;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio6Ficheros1Tema3
{
    public static void main(String[] args)
    {
        File f;
        String cad;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Excribe la ruta completa del archivo o directorio:");
        cad = sc.nextLine();
        
        f = new File(cad);
        
        if(f.exists())
        {
            Calendar calen = Calendar.getInstance();
            calen.setTimeInMillis(f.lastModified());
            
            String fecha = String.valueOf(calen.get(Calendar.DAY_OF_MONTH)) + "/" + String.valueOf(calen.get(Calendar.MONTH) + 1) + "/" + String.valueOf(calen.get(Calendar.YEAR));
            String hora = String.valueOf(calen.get(Calendar.HOUR_OF_DAY)) + ":" + String.valueOf(calen.get(Calendar.MINUTE));            
            
            System.out.println("\nNombre del archivo: " + f.getName());
            System.out.println("Camino absoluto: " + f.getAbsolutePath());
            System.out.println("Tamaño: " + f.length() + " Bytes");
            System.out.println("Es fichero: " + f.isFile());
            System.out.println("Es directorio: " + f.isDirectory());
            System.out.println("Última modificación: " + fecha + " " + hora);
            System.out.println("Tiene permiso de escritura: " + f.canWrite());
            System.out.println("Tiene permiso de lectura: " + f.canRead());
            System.out.println("Tiene permiso de ejecución: " + f.canExecute());
        }
        else
        {
            System.out.println("\nNo existe el archivo o directorio");
        }
        
    }
    
}
