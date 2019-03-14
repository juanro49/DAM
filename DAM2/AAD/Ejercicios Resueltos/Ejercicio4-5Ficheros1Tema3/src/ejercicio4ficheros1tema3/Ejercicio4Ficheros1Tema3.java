/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio4ficheros1tema3;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author usuario
 */
public class Ejercicio4Ficheros1Tema3
{

    public static void main(String[] args) throws IOException
    {
        File f = new File("C:\\Home");
        f.mkdir();
        
        File f1 = new File(f, "\\d1");
        f1.mkdir();
        
        File a1 = new File(f1, "f11.txt");
        a1.createNewFile();
        
        File f2 = new File(f, "\\d2");
        f2.mkdir();
        
        File a2 = new File(f2, "f21.txt");
        a2.createNewFile();
        
        
        //Ejercicio 5
        File nuevo;
        
        nuevo = new File(f1, "f12.txt");
        a1.renameTo(nuevo);
        
        nuevo = new File(f1, "f21.txt");
        a2.renameTo(nuevo);
        
        f2.delete();
    }
    
}
