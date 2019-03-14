/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class ProductoUnitario extends Producto implements IPrecio
{
    private int cantidad;
    private double precio;

    public ProductoUnitario(int cantidad, double precio, String nombre, String categoria)
    {
        super(nombre, categoria);
        this.setCantidad(cantidad);
        this.setPrecio(precio);
    }
    
    public int getCantidad()
    {
        return cantidad;
    }
    
    public void setCantidad(int cantidad)
    {
        this.cantidad = cantidad;
    }
    
    public double getPrecio()
    {
        return precio;
    }
    
    public void setPrecio(double precio)
    {
        this.precio = precio;
    }
    
    public double getImporteTotal()
    {
        return Math.round((cantidad * precio) * 100d) / 100d;
    }

    public String imprimir()
    {
        return getNombre() + " " + getCantidad() + " a " + getPrecio() + " = " + getImporteTotal() + "\n";
    }
}
