/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import java.util.List;
import modelo.Departamentos;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Juanro49
 */
public class ConsutaDepartamentoList
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
        
        List <Departamentos> lista = q.list();
        
        for(int i = 0; i < lista.size(); i++)
        {
            System.out.println("\n******************************");
            System.out.println("Nº: " + lista.get(i).getDeptNo());
            System.out.println("Nombre: " + lista.get(i).getDnombre());
            System.out.println("Localidad: " + lista.get(i).getLoc());
            System.out.println("Empleados: " + lista.get(i).getEmpleadoses().size());
            System.out.println("******************************\n");
        }
    }
    
}
