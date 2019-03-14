/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import java.util.Iterator;
import modelo.Departamentos;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Juanro49
 */
public class ConsutaDepartamentoIterate
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
        
        Query q = session.createQuery("from Departamentos");
        
        Iterator  iter = q.iterate();
        
        while(iter.hasNext())
        {
            Departamentos dep = (Departamentos) iter.next();
            
            System.out.println("\n******************************");
            System.out.println("Nº: " + dep.getDeptNo());
            System.out.println("Nombre: " + dep.getDnombre());
            System.out.println("Localidad: " + dep.getLoc());
            System.out.println("Empleados: " + dep.getEmpleadoses().size());
            System.out.println("******************************\n");
        }
    }
    
}
