/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import java.util.Iterator;
import modelo.Departamentos;
import modelo.Empleados;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Juanro49
 */
public class ClasesNoasociadas
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
        
        String hql = "from Empleados e, Departamentos d where e.departamentos.deptNo = d.deptNo order by apellido";
        Query cons = session.createQuery(hql);
        Iterator q = cons.iterate();
        
        while (q.hasNext())
        {
            Object[] par = (Object[]) q.next();
            Empleados em = (Empleados) par[0];
            Departamentos de = (Departamentos) par[1];
            System.out.printf("%s, %.2f, %s, %s %n", em.getApellido(), em.getSalario(), de.getDnombre(),de.getLoc());
        }
    }
}
