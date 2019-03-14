/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import javax.swing.JOptionPane;
import modelo.Departamentos;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;

/**
 *
 * @author Juanro49
 */
public class Operaciones
{
    public Departamentos mostrarDepartamentos(byte deptNo)
    {
        //Se crea la conexión a la base de datos con Hibernate
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        
        Query q = session.createQuery("from Departamentos where deptNo = " + deptNo);
        
        Departamentos dep = (Departamentos) q.uniqueResult();
        
        return dep;
    }
    
    public void altaDepartamento(byte deptNo, String nombre, String localidad)
    {
        //Se crea la conexión a la base de datos con Hibernate
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        
        Departamentos dep = new Departamentos();
        
        dep.setDeptNo(deptNo);
        dep.setDnombre(nombre);
        dep.setLoc(localidad);
        
        //Confirmamos la inserción
        try
        {
            session.save(dep);
            tx.commit();
            JOptionPane.showMessageDialog(null,"Departamento dado de alta correctamente.");
        }
        catch(ConstraintViolationException he)
        {
            //Deshacemos los cambios en caso de error
            tx.rollback();
            JOptionPane.showMessageDialog(null,"Departamento duplicado\n" + he.getLocalizedMessage());
        }
        finally
        {
            //Cerramos la conexión de Hibernate con la base de datos
            session.close();
        }
    }
    
    public void bajaDepartamento(byte deptNo)
    {
        //Se crea la conexión a la base de datos con Hibernate
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        
        Departamentos dep = new Departamentos();
        
        dep = (Departamentos) session.load(Departamentos.class, deptNo);
        
        //Confirmamos la inserción
        try
        {
            session.delete(dep);
            tx.commit();
            JOptionPane.showMessageDialog(null,"Departamento eliminado correctamente.");
        }
        catch(ConstraintViolationException he)
        {
            //Deshacemos los cambios en caso de error
            tx.rollback();
            JOptionPane.showMessageDialog(null,"El departamento no se puede eliminar porque contiene empleados\n" + he.getLocalizedMessage());
        }
        catch(ObjectNotFoundException he)
        {
            //Deshacemos los cambios en caso de error
            tx.rollback();
            JOptionPane.showMessageDialog(null,"El departamento no existe\n" + he.getLocalizedMessage());
        }
        finally
        {
            //Cerramos la conexión de Hibernate con la base de datos
            session.close();
        }
    }
    
    public void modificarDepartamento(byte deptNo, String nombre, String localidad)
    {
        //Se crea la conexión a la base de datos con Hibernate
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        
        Departamentos dep = (Departamentos) session.load(Departamentos.class, deptNo);
        
        //Confirmamos la inserción
        try
        {
            dep.setDnombre(nombre);
            dep.setLoc(localidad);
            
            session.update(dep);
            tx.commit();
            JOptionPane.showMessageDialog(null,"Departamento modificado correctamente.");
        }
        catch(ConstraintViolationException he)
        {
            //Deshacemos los cambios en caso de error
            tx.rollback();
            JOptionPane.showMessageDialog(null,"Error al modificar departamento\n" + he.getLocalizedMessage());
        }
        catch(ObjectNotFoundException he)
        {
            //Deshacemos los cambios en caso de error
            tx.rollback();
            JOptionPane.showMessageDialog(null,"El departamento no existe\n" + he.getLocalizedMessage());
        }
        finally
        {
            //Cerramos la conexión de Hibernate con la base de datos
            session.close();
        }
    }
}
