/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class ProductoPeso extends Producto implements IPrecio
{
    private double peso;
    private double precioPorPeso;

    public ProductoPeso(double peso, double precioPorPeso, String nombre, String categoria)
    {
        super(nombre, categoria);
        this.setPeso(peso);
        this.setPrecioPorPeso(precioPorPeso);
    }
    
    public double getPeso()
    {
        return peso;
    }
    
    public void setPeso(double peso)
    {
        this.peso = peso;
    }
    
    public double getPrecioPorPeso()
    {
        return precioPorPeso;
    }
    
    public void setPrecioPorPeso(double precioPorPeso)
    {
        this.precioPorPeso = precioPorPeso;
    }
    
    public double getImporteTotal()
    {
        return Math.round((peso * precioPorPeso) * 100d) / 100d;
    }
    
    public String imprimir()
    {
        return getNombre() + " " + getPeso() + " a " + getPrecioPorPeso() + " = " + getImporteTotal() + "\n";
    }
}
