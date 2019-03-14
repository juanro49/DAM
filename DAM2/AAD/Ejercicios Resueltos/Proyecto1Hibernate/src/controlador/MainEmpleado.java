/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import java.util.Calendar;
import javax.swing.JOptionPane;
import modelo.Departamentos;
import modelo.Empleados;
import org.hibernate.PropertyValueException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;

/**
 *
 * @author Juanro49
 */
public class MainEmpleado
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
        
        //Se inserta la nueva fila en la tabla Empleados
        Empleados emp = new Empleados();
        Departamentos dep = new Departamentos();
        
        dep.setDeptNo((byte) 10);
        
        emp.setEmpNo((short) 4455);
        emp.setApellido("PÉREZ");
        emp.setOficio("VENDEDOR");
        emp.setDir((short) 7499);
        emp.setFechaAlt(Calendar.getInstance().getTime());
        emp.setSalario(Float.parseFloat("1500"));
        emp.setComision(Float.parseFloat("10"));
        emp.setDepartamentos(dep);

        try
        {
            session.save(emp);
            
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
        catch(PropertyValueException he)
        {
            //Deshacemos los cambios en caso de error
            tx.rollback();
            JOptionPane.showMessageDialog(null,"El departamento no existe\n" + he.getLocalizedMessage());
        }
    }
    
}
