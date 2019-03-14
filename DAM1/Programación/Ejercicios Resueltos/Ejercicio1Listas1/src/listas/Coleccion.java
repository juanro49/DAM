package listas;

import java.util.*;

public class Coleccion
{
    private ArrayList<Producto> lista = new ArrayList<Producto>();

    public int tamaño()
    {
        return lista.size();
    }
    
    public void adicionar(Producto e)
    {
        lista.add(e);
    }
    
    public void eliminar(int pos)
    {
        System.out.println("Indica la posición del elemento a eliminar");
        
        if(pos < tamaño())
        {
            lista.remove(pos);
        }
    }
    
    public Producto obtener(int pos)
    {
        if(pos <= tamaño())
        {
            return lista.get(pos);
        }
        else
        {
            return null;
        }
    }
    
    public Producto buscar(int cod)
    {
        //Recorre la lista y busca el código del producto
        // si coincide con cod devuelve el producto 
        //y si no está el la lista devuelve null
        
        for (int i = 0; i < lista.size(); i++)
        {
            Producto aux;
            aux = lista.get(i);
            
            if(aux.ver_codigo() == cod)
            {
                return aux;
            }
        }
        
        return null;
    }

//Más tarde se añadirán los métodos 
            		
public void mostrar_todo()
    {
        System.out.println("Contenido de la lista:");
        for (int i = 0; i < lista.size(); i++)
        {
            Producto aux;
            aux = lista.get(i);
            
            aux.mostrarProducto();
            System.out.println();
        }
    }

public void aumentoPrecio()
{
    for (int i = 0; i < lista.size(); i++)
        {
            Producto aux;
            double nuevoprecio;
            
            aux = lista.get(i);
            
            nuevoprecio = aux.ver_precio() * 1.1;
            aux.modificar_precio(nuevoprecio);
        }
}

 
}//de la clase
