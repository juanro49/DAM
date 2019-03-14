
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
    public void crear(String fichOrigen, String fichDestino)
    {
        int codigo = 1, fecha_edicion;
        String titulo, autor, editorial, isbn;
        File fOri = new File(fichOrigen);
        File fDest = new File(fichDestino);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        FileReader fr = null;

        try
        {
            fr = new FileReader(fOri);
            Scanner lectura = new Scanner(fr);
            fos = new FileOutputStream(fDest, false);
            oos = new ObjectOutputStream(fos);
            
            while(lectura.hasNextLine())
            {
                String linea[] = lectura.nextLine().split(":");
                titulo = linea[0];
                autor = linea[1];
                editorial = linea[2];
                fecha_edicion = Integer.parseInt(linea[3]);
                isbn = linea[4];
                oos.writeObject(new Libros(codigo, titulo, autor, editorial, fecha_edicion, isbn));
                codigo++;
            }
            lectura.close();
            
            JOptionPane.showMessageDialog(null, "Creación terminada");
        }
        catch (IOException ex)
        {
            Logger.getLogger(ControlArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            try
            {
                fr.close();
                fos.close();
                oos.close();
            }
            catch (IOException ex)
            {
                Logger.getLogger(ControlArchivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public  ArrayList paraMostrarLibros(String nomfich)
    {
        ArrayList<Libros> lista = new ArrayList();
        FileInputStream fs = null;
        ObjectInputStream ois = null;
        
        try
        {
            fs = new FileInputStream(nomfich);
            ois =new ObjectInputStream(fs);

            Libros libro = (Libros)ois.readObject();

            while(libro != null)
            {
                lista.add(libro);
                libro = (Libros)ois.readObject();
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
    
    public void llenarTabla1(String nombrefich, DefaultTableModel m, JTable tabla)
    {
        String titulos[]={"Código","Título","Autor","Editorial","Fecha","ISBN"};
        ArrayList <Libros> lista = paraMostrarLibros(nombrefich);
        Libros libro;
        Object fila[] = new Object[6];
        
        m = new DefaultTableModel(null,titulos);
        tabla.setModel(m);

        for (int i = 0; i < lista.size(); i++)
        {
            libro = lista.get(i);

            fila[0] = libro.getCodigo();
            fila[1] = libro.getTitulo();
            fila[2] = libro.getAutor();
            fila[3] = libro.getEditorial();
            fila[4] = libro.getFecha_edicion();
            fila[5] = libro.getIsbn();

            m = (DefaultTableModel)tabla.getModel();//recoge el modelo de la tabla
            m.addRow(fila);
        }
    }
    
    public boolean estaPrestado(String nomfich, int codigo)
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

                Prestados prestado = (Prestados)os.readObject();

                while(prestado != null)
                {
                    if(codigo == prestado.getCodigo())
                    {
                        return true;
                    }
                    else
                    {
                        prestado = (Prestados)os.readObject();
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
    
    public void anadirPrestado(String nomfich, Object prestado)
    {
        File f = new File(nomfich);

        if(f.exists())
        {
            FileOutputStream fos = null;
            MiObjectOutputStream mos = null;
            
            try
            {
                fos = new FileOutputStream(f, true);
                mos = new MiObjectOutputStream(fos);
                
                mos.writeUnshared(prestado);

                JOptionPane.showMessageDialog(null, "Nuevo registro Guardado.");
            }
            catch (FileNotFoundException ex)
            {
                JOptionPane.showMessageDialog(null, "Fichero no encontrado.");
            }
            catch (IOException ex)
            {
                Logger.getLogger(ControlArchivo.class.getName()).log(Level.SEVERE, null, ex);
            }
            finally
            {
                try
                {
                    fos.close();
                    mos.close();
                }
                catch (IOException ex)
                {
                    Logger.getLogger(ControlArchivo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else
        {
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;
            
            try
            {
                fos = new FileOutputStream(f, false);
                oos = new ObjectOutputStream(fos);
                
                oos.writeObject(prestado);
                
                JOptionPane.showMessageDialog(null, "Fichero creado y registro Guardado.");
            }
            catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Fichero no encontrado.");
            }
            catch (IOException ex) {
                Logger.getLogger(ControlArchivo.class.getName()).log(Level.SEVERE, null, ex);
            }
            finally
            {
                try
                {
                    fos.close();
                    oos.close();
                }
                catch (IOException ex)
                {
                    Logger.getLogger(ControlArchivo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    public  ArrayList paraMostrarPrestado(String nomfich)
    {
        ArrayList<Prestados> lista = new ArrayList();
        FileInputStream fs = null;
        ObjectInputStream ois = null;
        
        try
        {
            fs = new FileInputStream(nomfich);
            ois =new ObjectInputStream(fs);

            Prestados prestado = (Prestados)ois.readObject();

            while(prestado != null)
            {
                lista.add(prestado);
                prestado = (Prestados)ois.readObject();
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
    
    public void llenarTabla2(String nombrefich, DefaultTableModel m, JTable tabla)
    {
        String titulos[]={"Código","Fecha Préstamo","Fecha Devolución"};
        ArrayList <Prestados> lista = paraMostrarPrestado(nombrefich);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Prestados prestado;
        Object fila[] = new Object[3];
        
        m = new DefaultTableModel(null,titulos);
        tabla.setModel(m);

        for (int i = 0; i < lista.size(); i++)
        {
            prestado = lista.get(i);

            fila[0] = prestado.getCodigo();
            fila[1] = formato.format(prestado.Fecha_prestamo);
            fila[2] = formato.format(prestado.Fecha_devolucion);

            m = (DefaultTableModel)tabla.getModel();//recoge el modelo de la tabla
            m.addRow(fila);
        }
    }
}