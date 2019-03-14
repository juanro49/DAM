/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import java.util.Iterator;
import modelo.Departamentos;
import modelo.Empleados;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Juanro49
 */
public class CargaDeObjetos
{

    /**
     * @param args the command line arguments
     */
    public static void main() throws InterruptedException
    {
        //Se crea la conexión a la base de datos con Hibernate
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        Departamentos dep = new Departamentos();
        
        //Mostrar datos departamento 20
        dep = (Departamentos) session.load(Departamentos.class, (byte) 20);
        
        dep.getDnombre();
        System.out.println("\n******************************");
        System.out.println("Nº: " + dep.getDeptNo());
        System.out.println("Nombre: " + dep.getDnombre());
        System.out.println("Localidad: " + dep.getLoc());
        System.out.println("******************************\n");
        
        //Comprobar que existe el departamento 11
        dep = (Departamentos) session.load(Departamentos.class, (byte) 11);
        

        //con .load()
        try
        {
            System.out.println(dep.getDnombre());
        }
        catch(ObjectNotFoundException e)
        {
            System.out.println("No existe el departamento 11");
        }
        
        /*//con .get()
        
        if(dep != null)
        {
            System.out.println(dep.getDnombre());
        }
        else
        {
            System.out.println("No existe el departamento 11");
        }
        */
        
        
        //Mostrar datos departamento 10
        dep = (Departamentos) session.load(Departamentos.class, (byte) 10);
        
        System.out.println("\n******************************");
        System.out.println("Nombre: " + dep.getDnombre());
        System.out.println("Localidad: " + dep.getLoc());
        System.out.println("Empleados: " + dep.getEmpleadoses().size());
        
        Iterator<Empleados> itr1 = dep.getEmpleadoses().iterator();
        
        while(itr1.hasNext())
        {
            Empleados emp = itr1.next();
            System.out.println("\tApellido: " + emp.getApellido() + "    Salario: " + emp.getSalario());
        }
        
        System.out.println("******************************\n");
        
        
        //Mostrar empleados del departamento 10
        dep = (Departamentos) session.load(Departamentos.class, (byte) 10);
        
        Iterator<Empleados> itr2 = dep.getEmpleadoses().iterator();
        
        System.out.println("Empleados departamento 10");
        
        while(itr2.hasNext())
        {
            Empleados emp = itr2.next();
            System.out.println("\tNº: " + emp.getEmpNo());
            System.out.println("\tApellido: " + emp.getApellido());
            System.out.println("\tOficio: " + emp.getOficio());
            System.out.println("\tDirector: " + emp.getDir());
            System.out.println("\tF.Alta: " + emp.getFechaAlt());
            System.out.println("\tSalario: " + emp.getSalario());
            System.out.println("\tComisión: " + emp.getComision());
            System.out.println("");
        }
    }
}
