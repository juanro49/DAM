/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import java.util.Iterator;
import modelo.Totales;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Juanro49
 */
public class UsoClaseTotales
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
        
        Totales resultado;
        
        String hql = "select new modelo.Totales(" +
	    		"de.deptNo,  count(em.empNo), " +
	    		"coalesce(avg(em.salario),0), "
	    		+ "de.dnombre" +
	    		")" +
	    		" from Departamentos as de, Empleados as em" +
	    		" where de.deptNo=em.departamentos.deptNo" +
	    		" group by de.deptNo,de.dnombre" ;
        Query q = session.createQuery(hql);
        
        Iterator itr = q.iterate();
        
        while (itr.hasNext())
        {
            resultado = (Totales) itr.next();
            
            System.out.println("\nNom Dept: " + resultado.getNumero());
            System.out.println("\tNº Dept: " + resultado.getNombre());
            System.out.println("\tNº Emp: " + resultado.getCuenta());
            System.out.println("\tSal Med: " + resultado.getMedia());
        }

        System.out.println("**************************************************");
        
        
        hql = ("select new modelo.Totales(" +
	    		"em.departamentos.deptNo, "
	    		+ "count(em.empNo)," +
	    		"coalesce(avg(em.salario),0), "
	    		+ "em.departamentos.dnombre" +
	    		")" +
	    		" from Empleados as em " +
	    		" group by em.departamentos.deptNo,"
	    		+ "em.departamentos.dnombre" );
        q = session.createQuery(hql);
        
        itr = q.iterate();
        
        while (itr.hasNext())
        {
            resultado = (Totales) itr.next();
            
            System.out.println("\nNom Dept: " + resultado.getNumero());
            System.out.println("\tNº Dept: " + resultado.getNombre());
            System.out.println("\tNº Emp: " + resultado.getCuenta());
            System.out.println("\tSal Med: " + resultado.getMedia());
        }
        
        System.out.println("**************************************************");

        
        hql = "select new modelo.Totales(" +
		     " d.deptNo,  count(e.empNo), coalesce(avg(e.salario),0) , "+ 
		     " d.dnombre ) "+ 
		     " from Empleados as e right join  e.departamentos as d "+
		     " group by  d.deptNo, d.dnombre ";
        q = session.createQuery(hql);

        itr = q.iterate();
        
        while (itr.hasNext())
        {
            resultado = (Totales) itr.next();
            
            System.out.println("\nNom Dept: " + resultado.getNumero());
            System.out.println("\tNº Dept: " + resultado.getNombre());
            System.out.println("\tNº Emp: " + resultado.getCuenta());
            System.out.println("\tSal Med: " + resultado.getMedia());
        }
        
        System.out.println("**************************************************");
    }
    
}
