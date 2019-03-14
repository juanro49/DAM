/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import java.util.Iterator;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Juanro49
 */
public class Usofunciones
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
        
        //Mostrar el salario medio de empleados.
        String hql = "select avg(em.salario) from Empleados as em";
        Query q = session.createQuery(hql);
        
        System.out.println("Salario medio: " + q.uniqueResult());
        
        
        //Mostrar el salario medio y el número de empleados.
        hql = "select avg(em.salario), count(*) from Empleados as em ";
        q = session.createQuery(hql);
        Object[] resultado = (Object[]) q.uniqueResult();
        
        System.out.println("\nSalario medio: " + resultado[0]);
        System.out.println("Nº empleados: " + resultado[1]);
        
        
        //Mostrar el salario medio y el número de empleados  por departamentos. Los resultados se iteran.
        hql = "select e.departamentos.deptNo, avg(e.salario),  count(e.empNo) from Empleados e  group by e.departamentos.deptNo ";
        q = session.createQuery(hql);
        
        Iterator itr = q.iterate();
        
        while (itr.hasNext())
        {
            resultado = (Object[]) itr.next();
            
            System.out.println("\nDepartamento: " + resultado[0]);
            System.out.println("\tSalario medio: " + resultado[1]);
            System.out.println("\tNº empleados: " + resultado[2]);
        }
    }
    
}
