/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import modelo.Empleados;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Juanro49
 */
public class ConsultaConParametro
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //Se crea la conexión a la base de datos con Hibernate
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        
        //Visualiza el empleado cuyo número de empleado es 7788. Utiliza parámetros nombrados.
        String hq1 = "from Empleados where emp_no = :numemple";
        Query q1 = session.createQuery(hq1);
        q1.setParameter("numemple", (short) 7788);

        Empleados emp = (Empleados) q1.uniqueResult();
        
        System.out.println("\n******************************");
        System.out.println("Nº: " + emp.getEmpNo());
        System.out.println("Apellido: " + emp.getApellido());
        System.out.println("Salario: " + emp.getSalario());
        System.out.println("Comision: " + emp.getComision());
        System.out.println("Oficio: " + emp.getOficio());
        System.out.println("Departamento: " + emp.getDepartamentos().getDnombre());
        System.out.println("Director: " + emp.getDir());
        System.out.println("F_Alt: " + emp.getFechaAlt());
        System.out.println("******************************\n");
        
        
        //Visualiza los empleados cuyo número de departamento sea 10 y oficio DIRECTOR. Utiliza parámetros nombrados.
        String hq2 = "from Empleados emp where emp.departamentos.deptNo = :ndep and emp.oficio = :ofi";
        Query q2 = session.createQuery(hq2);
        q2.setParameter("ndep", (byte) 10);
        q2.setParameter("ofi", "DIRECTOR");

        Iterator iter = q2.iterate();
        
        while(iter.hasNext())
        {
            emp = (Empleados) iter.next();
            
            System.out.println("\n******************************");
            System.out.println("Nº: " + emp.getEmpNo());
            System.out.println("Apellido: " + emp.getApellido());
            System.out.println("Salario: " + emp.getSalario());
            System.out.println("Comision: " + emp.getComision());
            System.out.println("Oficio: " + emp.getOficio());
            System.out.println("Departamento: " + emp.getDepartamentos().getDnombre());
            System.out.println("Director: " + emp.getDir());
            System.out.println("F_Alt: " + emp.getFechaAlt());
            System.out.println("******************************\n");
        }
        
        
        //Visualiza los empleados cuyo número de departamento sea 10 y oficio DIRECTOR. Utiliza parámetros por posición.
        String hq3 = "from Empleados emp where emp.departamentos.deptNo = ? and emp.oficio = ?";
	Query q3 = session.createQuery(hq3);
	q3.setParameter(0, (byte) 10);
	q3.setParameter(1, "DIRECTOR");

        iter = q3.iterate();
        
        while(iter.hasNext())
        {
            emp = (Empleados) iter.next();
            
            System.out.println("\n******************************");
            System.out.println("Nº: " + emp.getEmpNo());
            System.out.println("Apellido: " + emp.getApellido());
            System.out.println("Salario: " + emp.getSalario());
            System.out.println("Comision: " + emp.getComision());
            System.out.println("Oficio: " + emp.getOficio());
            System.out.println("Departamento: " + emp.getDepartamentos().getDnombre());
            System.out.println("Director: " + emp.getDir());
            System.out.println("F_Alt: " + emp.getFechaAlt());
            System.out.println("******************************\n");
        }
        
        
        //Visualiza los empleados cuyo número de departamento sea 10 o 20. Utiliza parámetros nombrados.
        List<Byte> numeros = new ArrayList<Byte>();
	numeros.add((byte) 10);
	numeros.add((byte) 20);
	String hq4 = "from Empleados emp where emp.departamentos.deptNo in (:listadep) "
				+ "order by emp.departamentos.deptNo ";
	Query q4 = session.createQuery(hq4);
	q4.setParameterList("listadep", numeros);

        
        //Visualiza los empleados cuya fecha de alta es 1991-12-03. Utiliza parámetros nombrados.
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
	String strFecha = "1991-12-03";
	Date fecha = null;
	
        try
        {
            fecha = formatoDelTexto.parse(strFecha);
	}
        catch (ParseException ex)
        {
            ex.printStackTrace();
	}
        
	String hq5 = "from Empleados where fecha_alt = :fechalta ";
	Query q5 = session.createQuery(hq5);
	q5.setDate("fechalta", fecha);

        iter = q5.iterate();
        
        while(iter.hasNext())
        {
            emp = (Empleados) iter.next();
            
            System.out.println("\n******************************");
            System.out.println("Nº: " + emp.getEmpNo());
            System.out.println("Apellido: " + emp.getApellido());
            System.out.println("Salario: " + emp.getSalario());
            System.out.println("Comision: " + emp.getComision());
            System.out.println("Oficio: " + emp.getOficio());
            System.out.println("Departamento: " + emp.getDepartamentos().getDnombre());
            System.out.println("Director: " + emp.getDir());
            System.out.println("F_Alt: " + emp.getFechaAlt());
            System.out.println("******************************\n");
        }
    }
    
}
