/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import javax.swing.JOptionPane;
import modelo.Departamentos;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;

/**
 *
 * @author Juanro49
 */
public class Main
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
        
        //Se inserta la nueva fila en la tabla Departamentos
        Departamentos dep = new Departamentos();

        dep.setDeptNo((byte) 60);
        dep.setDnombre("MARKETING");
        dep.setLoc("GUADALAJARA");

        session.save(dep);

        //Confirmamos la inserción
        try
        {
            tx.commit();
            JOptionPane.showMessageDialog(null,"Insertado correctamente.");
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
