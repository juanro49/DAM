
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    public boolean existeAlumno(String nomfich,int expediente)
    {
        File f = new File(nomfich);
        
        if(!f.exists())
        {
            return false;
        }
        else
        {
            FileInputStream fs = null;
            ObjectInputStream os = null;
            
            try
            {
                fs = new FileInputStream(nomfich);
                os =new ObjectInputStream(fs);

                Alumno alumno = (Alumno)os.readObject();

                while(alumno != null)
                {
                    if(expediente == alumno.getNum_expediente())
                    {
                        return true;
                    }
                    else
                    {
                        alumno = (Alumno)os.readObject();
                    }
                }
            }
            catch (ClassNotFoundException ex)
            {
                JOptionPane.showMessageDialog(null, "Clase no encontrada.");
            }
            catch (IOException ex)
            {
                //JOptionPane.showMessageDialog(null, "Problema con los ficheros.");
            }
            finally
            {
                try
                {
                    fs.close();
                    os.close();
                }
                catch (IOException ex)
                {
                    Logger.getLogger(ControlArchivo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        return false;
    }
    
    public Alumno buscarAlumno(String nomfich,int expediente) throws IOException
    {
        FileInputStream fs = null;
        ObjectInputStream os = null;
        
        try
        {
            fs = new FileInputStream(nomfich);
            os =new ObjectInputStream(fs);

            Alumno alumno = (Alumno)os.readObject();

            while(alumno != null)
            {
                if(expediente == alumno.getNum_expediente())
                {
                    return alumno;
                }
                else
                {
                    alumno = (Alumno)os.readObject();
                }
            }
            
        }
        catch (ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, "Clase no encontrada.");
        }
        catch (IOException ex)
        {
            JOptionPane.showMessageDialog(null, "Problema con los ficheros.");
        }
        finally
        {
            fs.close();
            os.close();
        }
        
        return null;
    }
    
    public void añadir(String nomfich, int exp, String nom, int notas[]) throws IOException
    {
        File f = new File(nomfich);

        if(f.exists())
        {
            FileOutputStream fos = new FileOutputStream(f, true);
            MiObjectOutputStream mos = new MiObjectOutputStream(fos);

            mos.writeUnshared(new Alumno(exp, nom, notas));
            fos.close();
            mos.close();
            JOptionPane.showMessageDialog(null, "Nuevo registro Guardado.");
        }
        else
        {
            FileOutputStream fos = new FileOutputStream(f, false);
            ObjectOutputStream os = new ObjectOutputStream(fos);

            os.writeObject(new Alumno(exp, nom, notas));
            fos.close();
            os.close();
            JOptionPane.showMessageDialog(null, "Registro Guardado.");
        }
    }
    
    public  ArrayList mostrar(String nomfich)
    {
        ArrayList<Alumno> lista = new ArrayList();
        FileInputStream fs = null;
        ObjectInputStream ois = null;
        
        try
        {
            fs = new FileInputStream(nomfich);
            ois =new ObjectInputStream(fs);

            Alumno alumno = (Alumno)ois.readObject();

            while(alumno != null)
            {
                lista.add(alumno);
                alumno = (Alumno)ois.readObject();
            }
        }
        catch (ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, "Clase no encontrada.");
        }
        catch (IOException ex)
        {
            //JOptionPane.showMessageDialog(null, "Problemas al leer el fichero.");
        }
        finally
        {
            try {
                fs.close();
                ois.close();
            } catch (IOException ex) {
                Logger.getLogger(ControlArchivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return lista;
    }
    
    public void borrarAlumno(String nomfich,int expediente) throws IOException
    {
        File f1 = new File(camino(nomfich) + "temporal.dat");
        
        FileInputStream fs = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        FileOutputStream fos = null;
        
        try
        {
            fs = new FileInputStream(nomfich);
            fos = new FileOutputStream(f1, true);
            oos = new ObjectOutputStream(fos);
            ois =new ObjectInputStream(fs);

            Alumno alumno = (Alumno)ois.readObject();

            while(alumno != null)
            {
                if(alumno.getNum_expediente() != expediente)
                {
                    oos.writeObject(alumno);
                }
                
                alumno = (Alumno)ois.readObject();
            }
        }
        catch (ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, "Clase no encontrada.");
        }
        catch(EOFException eot)
        { 
            
        }
        finally
        {
            fos.close();
            fs.close();
            oos.close();
            ois.close();
        }
        
        File f4 = new File(nomfich);
        
        if(!f4.delete())
        {
            JOptionPane.showMessageDialog(null, "No se pudo borrar el archivo antiguo, el nuevo se ha almacenado en " + f1.getAbsolutePath());
        }

        f1.renameTo(f4);
        JOptionPane.showMessageDialog(null, "Alumno borrado");
    }
    
    public static String camino(String nomfich)
    {
        int i = nomfich.length() - 1;
        boolean b = true;
        
        while(i >= 0 && b )
        {
            if (nomfich.charAt(i) == '\\')
            {
                b = false;
            }
            else 
            {
                i--;
            }
        }
        
        String camino = nomfich.substring(0, i + 1);
        return camino;
    }

}
