/* Hacer un programa que liste el contenido del directorio D:\home y de los 
directorios que cuelgan de él, mostrando nombre y tipo de cada fichero o directorio.
 */

package ejercicio10ficheros1tema3;

import java.io.File;

/**
 *
 * @author usuario
 */
public class Ejercicio10Ficheros1Tema3 {

    static int cont = 0;
    
    public static void Mostrar(File dir, String path) {
        String tab = "";
        File listFile[] = dir.listFiles();
        
        cont++;
        
        for(int j = 0; j < cont; j++)
        {
            tab += "\t";
        }
        
        for (int i = 0; i < listFile.length; i++)
        {

            if(path.equalsIgnoreCase(dir.getAbsolutePath()))
            {

                if (listFile[i].isDirectory())
                {
                    System.out.println(listFile[i].getName() + "....................Directorio");

                    Mostrar(listFile[i], dir.getAbsolutePath());
                    cont--;
                }
                else
                {
                    System.out.println(listFile[i].getName() + "....................Archivo");
                }
            }
            else
            {
                if (listFile[i].isDirectory())
                {
                    System.out.println(tab + listFile[i].getName() + "....................Directorio");

                    Mostrar(listFile[i], dir.getAbsolutePath());
                    cont--;
                }
                else
                {
                    System.out.println(tab + listFile[i].getName() + "....................Archivo");
                }
            }

        }
    }
    
    public static void main(String[] args)
    {
        File f = new File("C:\\home");
        
        Mostrar(f, f.getAbsolutePath());
    }
    
}
