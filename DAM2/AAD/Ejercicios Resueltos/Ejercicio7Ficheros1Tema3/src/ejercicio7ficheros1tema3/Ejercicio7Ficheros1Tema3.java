/* Realiza un programa que compruebe si se tiene acceso de ejecución y lectura 
a un fichero (pasado como argumento) y después modifique sus atributos 
denegando estos  permisos. (No funcionan en Windows).
*/

package ejercicio7ficheros1tema3;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio7Ficheros1Tema3
{

    public static void main(String[] args)
    {
        File f;
        String cad;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Excribe la ruta completa del archivo o directorio:");
        cad = sc.nextLine();
        
        f = new File(cad);
        
        System.out.println(f.getName() + "\nPermiso de ejecicion: " + f.canExecute() + 
                "\nPermiso de lectura: " + f.canRead());
        
        System.out.println("\nDenegar permisos? (si/no) (En Windows no funciona)");
        cad = sc.nextLine();
        
        if(cad.equalsIgnoreCase("no"))
        {
            System.out.println("No se han modificado los permisos");
        }
        else if (cad.equalsIgnoreCase("si"))
        {
            if(f.canExecute())
            {
                f.setExecutable(false);
            }
            else
            {
                f.setExecutable(true);
            }
            
            if(f.canRead())
            {
                f.setReadable(false);
            }
            else
            {
                f.setReadable(true);
            }
            
            System.out.println("Se han modificado los permisos");
            System.out.println(f.getName() + "\nPermiso de ejecicion: " + f.canExecute() + 
                "\nPermiso de lectura: " + f.canRead());
        }
    }
}
