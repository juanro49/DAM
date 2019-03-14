/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import modelo.Departamentos;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Juanro49
 */
public class UnicoResultado
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
        
        //Ver datos departamento 10
        String hql = "from Departamentos as dep where dep.deptNo = 10";
        Query q = session.createQuery(hql);
        
        Departamentos dep = (Departamentos) q.uniqueResult();
        
        System.out.println("\n******************************");
        System.out.println("Nº: " + dep.getDeptNo());
        System.out.println("Nombre: " + dep.getDnombre());
        System.out.println("Localidad: " + dep.getLoc());
        System.out.println("Empleados: " + dep.getEmpleadoses().size());
        System.out.println("******************************\n");
        
        
        //Ver datos departamento ventas
        hql = "from Departamentos as dep where dep.dnombre = 'VENTAS' ";
        q = session.createQuery(hql);
        
        dep = (Departamentos) q.uniqueResult();
        
        System.out.println("\n******************************");
        System.out.println("Nº: " + dep.getDeptNo());
        System.out.println("Nombre: " + dep.getDnombre());
        System.out.println("Localidad: " + dep.getLoc());
        System.out.println("Empleados: " + dep.getEmpleadoses().size());
        System.out.println("******************************\n");
    }
    
}
