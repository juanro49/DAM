
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

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
                
                ds.writeUTF(texto);

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
    
    public void mostrar(String fichero, JTextArea txtArea) 
    {
        File f = new File(fichero);
        
        if(f.exists())
        {
            try
            {
                DataInputStream ds = new DataInputStream(new FileInputStream(f));
                //bucle infinito

                for (;;)
                { 
                  txtArea.append(ds.readUTF());
                }
                
                
            }
            catch(EOFException e)
            {
                JOptionPane.showMessageDialog(null, "Fin del fichero");
            }
            catch(FileNotFoundException e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            catch(IOException e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No existe el fichero");
        }
    }
}
