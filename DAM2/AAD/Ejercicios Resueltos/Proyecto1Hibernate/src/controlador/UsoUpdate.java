/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Juanro49
 */
public class UsoUpdate
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
        
        
        //Modificar el salario de Gil.
        String hqlModif = "update Empleados set salario = :nuevoSal where apellido = :ape";
        Query q = session.createQuery(hqlModif);
        q.setParameter("nuevoSal", Float.parseFloat("1999"));
        q.setParameter("ape", "Gil");
        q.executeUpdate();
        
        
        //Eliminar los empleados del departamento 20.
        String hqlDel = "delete Empleados e where e.departamentos.deptNo = :dep";
        q = session.createSQLQuery(hqlDel);
        q.setParameter("dep", (byte) 20);
        q.executeUpdate();
        
        
        //Insertamos nuevos departamentos en la tabla DEPARTAMENTOS,  los datos proceden de la tabla NUEVOS, la tabla tiene que estar mapeada en nuestro proyecto.
        String hqlInsert = "insert into Departamentos (deptNo, dnombre, loc)  select n.deptNo, n.dnombre, n.loc from Nuevos n";
        q = session.createQuery(hqlInsert);
        q.executeUpdate();
    }
    
}
