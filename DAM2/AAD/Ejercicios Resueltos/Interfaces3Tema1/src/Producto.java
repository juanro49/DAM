/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
abstract class Producto
{
    private String nombre;
    private String categoria;

    public Producto(String nombre, String categoria)
    {
        this.setNombre(nombre);
        this.setCategoria(categoria);
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public String getCategoria()
    {
        return categoria;
    }
    
    public void setCategoria(String categoria)
    {
        this.categoria = categoria;
    }

}
