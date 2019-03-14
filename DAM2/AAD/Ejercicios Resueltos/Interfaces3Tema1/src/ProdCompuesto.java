
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class ProdCompuesto extends Producto implements IPrecio
{
    private ArrayList <Producto> productos = new ArrayList();
    
    public ProdCompuesto(ArrayList<Producto> productos, String nombre, String categoria)
    {
        super(nombre, categoria);
        this.productos = productos;
    }
    
    public void addProducto(Producto producto)
    {
        productos.add(producto);
    }
    
    public void removeProducto(Producto producto)
    {
        productos.remove(producto);
    }
    
    public double getImporteTotal()
    {
        double importeTotal = 0;
        
        for (Producto producto : productos)
        {
            importeTotal += ((IPrecio)producto).getImporteTotal();
        }
        
        return importeTotal;
    }
    
    public String imprimir()
    {
        String mensaje = getNombre();
        
        for (Producto producto : productos)
        {
            
            mensaje += "\n\t" + ((IPrecio)producto).imprimir();
                
        }
        
        mensaje += "\n\t: " + getImporteTotal() + "\n";
        
        return mensaje;
    }
}
