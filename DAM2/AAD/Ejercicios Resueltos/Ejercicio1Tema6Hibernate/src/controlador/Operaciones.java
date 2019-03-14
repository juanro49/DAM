/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

/**
 *
 * @author Juanro49
 */
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultListModel;
import modelo.*;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;

public class Operaciones
{
    public static void altaUsuarios(Usuarios user)
    {
         Session session=null;
         Transaction tx=null;
         
        try
        {
            SessionFactory sesion = HibernateUtil.getSessionFactory();
            session = sesion.openSession();
            tx = session.beginTransaction();
            session.save(user);
            tx.commit();
            JOptionPane.showMessageDialog(null,"Insertado correctamente.");
        }catch(HibernateException he )
        {
            tx.rollback();
            JOptionPane.showMessageDialog(null,"Clave duplicada\n"+he.getLocalizedMessage());
        }
        finally {
            session.close();
        }
    }
    
    public void altaNoticias(Noticias noti)
    {
         Session session = null;
         Transaction tx = null;
         
        try
        {
            SessionFactory sesion = HibernateUtil.getSessionFactory();
            session = sesion.openSession();
            tx = session.beginTransaction();
            session.save(noti);
            tx.commit();
            JOptionPane.showMessageDialog(null,"Insertado correctamente.");
        }catch(HibernateException he )
        {
            tx.rollback();
            JOptionPane.showMessageDialog(null,"Clave duplicada\n"+he.getLocalizedMessage());
        }
        finally {
            session.close();
        }
    }

    public DefaultListModel mostrarUsuarios()
    {
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        List<Usuarios> lista=null;
        
        try
        {
            Query q;
            q = session.createQuery("from Usuarios");
            lista = (List<Usuarios>)q.list();
            tx.commit();
        }
        catch (Exception e)
        {
          System.out.println(e.getMessage()+"query incorrecta");
        }
        finally
        {
            sesion.close();
        }
       
        Iterator<Usuarios> iter=lista.iterator();    
        DefaultListModel dlm = new DefaultListModel();
        
        while(iter.hasNext())
        {
            Usuarios usu = (Usuarios) iter.next();
            dlm.addElement(usu);
        }
        
        return dlm;
    }
    
    public DefaultListModel mostrarNoticias()
    {
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        List<Noticias> lista = null;
        
        try
        {
            Query q;
            q = session.createQuery("from Noticias");
            lista = (List<Noticias>) q.list();
            tx.commit();
        }
        catch (Exception e)
        {
          System.out.println(e.getMessage()+"query incorrecta");
        }
        finally
        {
            sesion.close();
        }
       
        Iterator<Noticias> iter=lista.iterator();    
        DefaultListModel dlm = new DefaultListModel();
        
        while(iter.hasNext())
        {
            Noticias noti = (Noticias) iter.next();
            dlm.addElement(noti);
        }
        
        return dlm;
    }

    public void bajaUsuarios(String clave)
    {
        Transaction tx=null;
        Session session=null;
        try {
            SessionFactory sesion = HibernateUtil.getSessionFactory();
            session = sesion.openSession();
            tx = session.beginTransaction();
            Usuarios us=(Usuarios)session.load(Usuarios.class, clave);
            session.delete(us);
            tx .commit();
            JOptionPane.showMessageDialog(null,"Eliminado correctamente.");
        } catch (HibernateException he) {
            tx.rollback();
            JOptionPane.showMessageDialog(null,he.getMessage()+"No ha sido posible eliminar usuario");
            System.out.println("Mensaje de la baja "+he.getMessage());
        } finally {
           session.close();
        }    
    }  

    public void actualizarUsuarios(Usuarios usuario)
    {
        Transaction tx=null;
        Session session=null;
        try {
            SessionFactory sesion = HibernateUtil.getSessionFactory();
            session = sesion.openSession();
            tx = session.beginTransaction();
            String key=usuario.getUsuario();
            //recuperamos el objeto a modificar
            Usuarios us=(Usuarios)session.load(Usuarios.class, key);
            //Actualizar datos
            //us.setUsuario(usuario.getUsuario());
            us.setNombre(usuario.getNombre());
            us.setApellidos(usuario.getApellidos());
            us.setCalle(usuario.getCalle()); 
            us.setNumero(usuario.getNumero()); 
            us.setCp(usuario.getCp());
            us.setTelefono(usuario.getTelefono());
            us.setEmail(usuario.getEmail());
            us.setProvincia(usuario.getProvincia());
            us.setClave(usuario.getClave());
            //us.setNoticiases(usuario.getNoticiases());
            //actualizamos objeto
            session.update(us);
            tx .commit();
            JOptionPane.showMessageDialog(null,"Actualizado correctamente.");
        } catch (HibernateException he) {
            tx.rollback();
            JOptionPane.showMessageDialog(null,he.getMessage()+"No ha sido posible actualizar usuario");
            //System.out.println("Mensaje de la baja "+he.getMessage());
        } finally {
           session.close();
        }    
    } 

}
