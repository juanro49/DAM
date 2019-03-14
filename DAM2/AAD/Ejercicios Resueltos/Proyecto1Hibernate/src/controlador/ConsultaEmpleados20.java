/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import java.util.Iterator;
import modelo.Empleados;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Juanro49
 */
public class ConsultaEmpleados20
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
        
        String hql = "from Empleados as e where e.departamentos.deptNo = 20";
        Query q = session.createQuery(hql);
        
        Iterator  iter = q.iterate();
        
        while(iter.hasNext())
        {
            Empleados emp = (Empleados) iter.next();
            
            System.out.println("\n******************************");
            System.out.println("Apellido: " + emp.getApellido());
            System.out.println("Salario: " + emp.getSalario());
            System.out.println("******************************\n");
        }
    }
    
}
