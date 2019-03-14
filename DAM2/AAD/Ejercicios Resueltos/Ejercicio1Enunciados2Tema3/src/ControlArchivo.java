
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class ControlArchivo
{
    public void crear(String fichero, String texto) throws IOException
    {
        File f = new File(fichero);
        if(! f.exists())
        {
            try
            {
                FileOutputStream fw = new FileOutputStream(f,false);
                DataOutputStream ds = new DataOutputStream(fw);
                
                Scanner lect = new Scanner(texto);
                
                while(lect.hasNextLine())
                {
                    Scanner frase = new Scanner(lect.nextLine());
                    
                    while(frase.hasNext())
                    {
                        ds.writeInt(frase.nextInt());
                        ds.writeChar(' ');
                    }
                    
                    ds.writeUTF("\n");
                }

                ds.close();

                JOptionPane.showMessageDialog(null, "Texto ingresado correctamente");
            }
            catch (FileNotFoundException ex)
            {
                JOptionPane.showMessageDialog(null, ex.toString());
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El archivo " + fichero + " ya existe");
        }
    }
}
