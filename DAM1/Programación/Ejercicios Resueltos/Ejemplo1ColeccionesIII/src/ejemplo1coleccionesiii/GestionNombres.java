
package ejemplo1coleccionesiii;

import java.io.*;
import java.util.*;

public class GestionNombres 
{
    public static void main(String[] args) throws IOException
    { 
        Hashtable nombres=new Hashtable();
        String opcion;
        BufferedReader bf=new BufferedReader(new InputStreamReader (System.in));

        do
        {
            System.out.println("Elegir opción :\n");
            System.out.println("1- Añadir nombre");
            System.out.println("2- Eliminar nombre");
            System.out.println("3- Mostrar todos los nombres");
            System.out.println("4- Salir");
        
            opcion = bf.readLine();

            switch (Integer.parseInt(opcion))
            {
                case 1:
                {
                    String nom, dni;
                    System.out.println(" Introduce Nombre: ");
                    nom=bf.readLine();
                    System.out.println("DNI : ");
                    dni=bf.readLine();
                    almacenaNombre(nom, dni, nombres);
                    break;
                }
            
                case 2:
                {
                    String d;
                    System.out.println("Introduzca el dni: ");
                    d=bf.readLine();
                    eliminaNombre(d,nombres);
                    break;
                }

                case 3:
                {
                    mostrarTodos (nombres);
                    break;
                }
            }
        } while(!opcion.equals("4"));
    } //del main

    static void almacenaNombre (String n, String k, Hashtable lista)
    { 
        if (!lista.containsKey(k)) 
        { 
            lista.put(k,n);
        }
    }

    static void eliminaNombre (String k, Hashtable lista)
    {
        if(lista.containsKey(k))
        {
            lista.remove(k);
        }
    }

    static void mostrarTodos (Hashtable lista)
    {
        System.out.println("Los nombres son: ");
        Enumeration claves = lista.keys();
        
        while (claves.hasMoreElements())
        {
            String k=(String) claves.nextElement();
            System.out.println(k+" - "+lista.get(k));
        }
    }
} //de la clase
