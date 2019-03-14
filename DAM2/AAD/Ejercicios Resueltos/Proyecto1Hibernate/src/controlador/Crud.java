/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import javax.swing.JOptionPane;
import modelo.Departamentos;
import modelo.Empleados;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;

/**
 *
 * @author Juanro49
 */
public class Crud
{

    /**
     * @param args the command line arguments
     */
    public static void main()
    {
        //Se crea la conexión a la base de datos con Hibernate
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        
        //Crear departamento
        Departamentos dep = new Departamentos();
        
        dep.setDeptNo((byte)70);
        dep.setDnombre("INFORMATICA");
        dep.setLoc("TOLEDO");
        
        session.save(dep);

        
        //Eliminar empleado
        Empleados emp = new Empleados();
        
        emp = (Empleados) session.load(Empleados.class, (short) 7369);
        
        session.delete(emp);
        
        
        //Modificar empleado
        emp = (Empleados) session.load(Empleados.class, (short) 7499);
        
        emp.setComision((float) 380);
        emp.setSalario((float) 1400);
        
        session.update(emp);
        
        
        //Confirmamos la inserción
        try
        {
            tx.commit();
            JOptionPane.showMessageDialog(null,"Cambios realizados correctamente.");
        }
        catch(ConstraintViolationException he)
        {
            //Deshacemos los cambios en caso de error
            tx.rollback();
            JOptionPane.showMessageDialog(null,"Clave duplicada\n" + he.getLocalizedMessage());
        }
        finally
        {
            //Cerramos la conexión de Hibernate con la base de datos
            session.close();
        }
    }
    
}
