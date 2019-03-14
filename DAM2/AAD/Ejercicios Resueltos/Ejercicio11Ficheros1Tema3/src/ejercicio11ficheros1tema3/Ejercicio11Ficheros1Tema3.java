/* Crear un programa en Java que borre la estructura anterior, solicitando
confirmación antes de borrar cada fichero o directorio y sin borrar ningún
directorio que no esté vacío.
 */

package ejercicio11ficheros1tema3;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio11Ficheros1Tema3
{
    
    public static void eliminar(File dir, String path)
    {
        File listFile[] = dir.listFiles();
        String cad;
        
        Scanner sc = new Scanner(System.in);
        if(listFile.length == 0)
        {
            dir.delete();
            System.out.println("Árbol borrado correctamente");
        }
        else
        {
            for (int i = 0; i < listFile.length; i++)
            {
                if (listFile[i].isDirectory())
                {
                    File lista[] = listFile[i].listFiles();
                    if(lista.length != 0)
                    {
                        System.out.println("El directorio " + listFile[i].getName() + " no está vacío, se intentará borrar lo que hay en su interior");
                        eliminar(listFile[i], dir.getAbsolutePath());
                    }
                    else
                    {
                        System.out.println("Desea borrar el directorio " + listFile[i].getName() + "si/no");
                        cad = sc.nextLine();

                        if(cad.equalsIgnoreCase("si"))
                        {
                            listFile[i].delete();
                        }
                        else
                        {
                            System.out.println("El directorio " + listFile[i].getName() + " no ha sido borrado");
                        }
                    }
                }
                else
                {
                    System.out.println("Desea borrar el archivo " + listFile[i].getName() + "si/no");
                    cad = sc.nextLine();

                    if(cad.equalsIgnoreCase("si"))
                    {
                        listFile[i].delete();
                    }
                    else
                    {
                        System.out.println("El archivo " + listFile[i].getName() + " no ha sido borrado");
                    }
                }
            }
            
            System.out.println("Ficheros borrados correctamente");
        }
    }
    
    public static void main(String[] args)
    {
        File f = new File("C:\\home");

        while(f.exists())
        {
            eliminar(f, f.getAbsolutePath());
        }
        
    }
    
}
