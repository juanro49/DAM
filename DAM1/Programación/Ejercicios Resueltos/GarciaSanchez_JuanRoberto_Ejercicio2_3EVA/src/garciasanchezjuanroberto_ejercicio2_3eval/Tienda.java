/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package garciasanchezjuanroberto_ejercicio2_3eval;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Tienda
{
    String nombreTienda;
    static Hashtable<String, Articulo> lista = new Hashtable<String, Articulo>();
    
    public Tienda(String nombre)
    {
        this.nombreTienda = nombre;
    }
    
    public void inserta(Articulo a)
    {
        String clave = a.getNombre();
                    
        if(!lista.containsKey(clave))
        {
            lista.put(clave, a);
            System.out.println("\nArtículo añadido a la lista");
        }
        else
        {
            System.out.println("\nERROR, artículo repetido, no se ha dado de alta");
        }
    }
    
    public Articulo busca(String nombre)
    {
        Articulo a;
        
        if(lista.containsKey(nombre))
        {
            a = (Articulo) lista.get(nombre);
            System.out.println("Artículo encontrado");
            return a;
        }
        else
        {
            System.out.println("Artículo no encontrado");
        }
        
        return null;
    }
    
    public double vende(String nombre, int num)
    {
        Articulo a = busca(nombre);
        double vendido = 0;
        
        if(a == null)
        {
            vendido = -1;
        }
        else if(a.vendido(num))
        {
            vendido = num * a.getPrecioUnidad();
            
            if(a.getCantidad() == 0)
            {
                lista.remove(nombre);
            }
        }
        
        return vendido;
    }
    
    public static void menu()
    {
        System.out.println("***MENÚ***");
        System.out.println("1.- Insertar un artículo");
        System.out.println("2.- Mostrar todos los artículos");
        System.out.println("3.- Mostrar un artículo");
        System.out.println("4.- Vender");
        System.out.println("5.- Salir");
        System.out.println("Introduce opción");
    }
    
    public static void salir()
    {
        System.out.println("Final de la aplicación");
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        Tienda mi_tienda = new Tienda("El Deseo.");
        int op = 0;
        
        do
        {
            menu();
            op = sc.nextInt();
            
            switch(op)
            {
                case 1://pedir datos e insertar
                {
                    String cad;
                    sc.nextLine();
                    System.out.println("Nombre:");
                    String nombre = sc.nextLine();
                    
                    System.out.println("Cantidad:");
                    cad = sc.nextLine();
                    int cantidad = Integer.parseInt(cad);
                    
                    System.out.println("Precio Unidad:");
                    cad = sc.nextLine();
                    double pvp = Double.parseDouble(cad);
                    
                    Articulo aux = new Articulo(nombre, cantidad, pvp);
                    mi_tienda.inserta(aux);
                    
                    break;
                }
                
                case 2:
                {
                    Object clave;
                    Articulo articulo;
                    Enumeration e = lista.keys();
                    
                    System.out.println("\nArtículos:");
                    
                    while(e.hasMoreElements())
                    {
                        clave = e.nextElement();
                        articulo = (Articulo) lista.get(clave);
                        
                        System.out.println(articulo.getArticulo());
                    }
                    break;
                }
                
                case 3://Mostrar un artículo
                {
                    String cad;
                    sc.nextLine();
                    System.out.println("Nombre: ");
                    cad = sc.nextLine();
                    
                    Articulo producto = mi_tienda.busca(cad);
                    if(producto != null)
                    {
                        System.out.println("Nombre: " + producto.getNombre() + ", cantidad: " + producto.getCantidad() + ". pvp unidad: " + producto.getPrecioUnidad());
                        System.out.println("");
                    }
                    
                    break;
                }
                
                case 4:
                {
                    String cad;
                    sc.nextLine();
                    System.out.println("Nombre: ");
                    cad = sc.nextLine();
                    
                    System.out.println("Cantidad:");
                    int cantidad = sc.nextInt();
                    
                    double venta = mi_tienda.vende(cad, cantidad);
                    
                    if(venta != 0 && venta != -1)
                    {
                        System.out.println("Total venta: " + venta);
                    }
                    
                    break;
                }
            }
        }while(op != 5);
        
        salir();
    }
      
} 