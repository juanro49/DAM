/* Realiza un programa en Java que cree una estructura de directorios como la 
siguiente, donde fx son ficheros y dx son directorios.

/home/
	/usr1
		f1
	/usr2
		/d1
			f2
		/d2
			f3
			f4
			/d3
*/

package ejercicio8ficheros1tema3;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author usuario
 */
public class Ejercicio8Ficheros1Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
        File f = new File("C:\\home");
        f.mkdir();
        
        File f1 = new File(f, "\\usr1");
        f1.mkdir();
        
        File a1 = new File(f1, "f1");
        a1.createNewFile();
        
        File f2 = new File(f, "\\usr2");
        f2.mkdir();
        
        File f3 = new File(f2, "\\d1");
        f3.mkdir();
        
        File a2 = new File(f3, "f2");
        a2.createNewFile();
        
        File f4 = new File(f2, "\\d2");
        f4.mkdir();
        
        File a3 = new File(f4, "f3");
        a3.createNewFile();
        
        File a4 = new File(f4, "f4");
        a4.createNewFile();
        
        File f5 = new File(f4, "\\d3");
        f5.mkdir();
        
        System.out.println("Ficheros y directorios creados correctamente");
    }
    
}
