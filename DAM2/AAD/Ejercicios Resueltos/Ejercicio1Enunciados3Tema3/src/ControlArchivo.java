
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
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
    public void añadir(String nomfich, String DNI, String nombre, String direccion, float saldo) throws IOException
    {
        try
        {
            File f = new File(nomfich);
            String estadoCuenta;
            
            if(f.exists())
            {
                MiObjectOutputStream os = new MiObjectOutputStream(new FileOutputStream(f, true));
            

                if(saldo < 0)
                {
                    estadoCuenta = "Deudor";
                }
                else if(saldo > 0)
                {
                    estadoCuenta = "Positivo";
                }
                else
                {
                    estadoCuenta = "Al día";
                }

                os.writeUnshared(new Cliente(DNI, nombre, direccion, saldo, estadoCuenta));
                JOptionPane.showMessageDialog(null, "Registro Guardado.");
                os.close();
            }
            else
            {
                ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(f, true));
            
                if(saldo < 0)
                {
                    estadoCuenta = "Deudor";
                }
                else if(saldo > 0)
                {
                    estadoCuenta = "Positivo";
                }
                else
                {
                    estadoCuenta = "Al día";
                }

                os.writeObject(new Cliente(DNI, nombre, direccion, saldo, estadoCuenta));
                JOptionPane.showMessageDialog(null, "Registro Guardado.");
                os.close();
            }
            
        }
        catch(IOException ex)
        {
            JOptionPane.showMessageDialog(null, "Problemas al escribir en el fichero.");
        }
        
    }
    
    public  ArrayList mostrar(String nomfich)
    {
        ArrayList<Cliente> lista = new ArrayList();
        
        try
        {
            FileInputStream fs = new FileInputStream(nomfich);
            ObjectInputStream os =new ObjectInputStream(fs);

            Cliente cliente = (Cliente)os.readObject();

            while(cliente != null)
            {
                lista.add(cliente);
                cliente = (Cliente)os.readObject();
            }

            os.close();
        }
        catch(EOFException eot)
        { 
            //JOptionPane.showMessageDialog(null, "Fin de fichero.");
        }
        catch (ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, "Clase no encontrada.");
        }
        catch (IOException ex)
        {
            JOptionPane.showMessageDialog(null, "Problema con los ficheros.");
        }
        
        return lista;
    }
    
    public  ArrayList mostrarDeudor(String nomfich)
    {
        ArrayList<Cliente> lista = new ArrayList();
        
        try
        {
            FileInputStream fs = new FileInputStream(nomfich);
            ObjectInputStream os =new ObjectInputStream(fs);

            Cliente cliente = (Cliente)os.readObject();

            while(cliente != null)
            {
                if(cliente.getEstado_cuenta().equalsIgnoreCase("Deudor"))
                {
                    lista.add(cliente);
                }
                
                cliente = (Cliente)os.readObject();
            }

            os.close();
        }
        catch(EOFException eot)
        { 
            //JOptionPane.showMessageDialog(null, "Fin de fichero.");
        }
        catch (ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, "Clase no encontrada.");
        }
        catch (IOException ex)
        {
            JOptionPane.showMessageDialog(null, "Problema con los ficheros.");
        }
        
        return lista;
    }
}
