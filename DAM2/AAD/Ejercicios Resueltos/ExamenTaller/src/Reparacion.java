/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jr49
 */
public class Reparacion extends Trabajos implements ICoste
{
    private int tipo; //0 para reparación mecánica y 1 para reparación chapa y pintura
    private double coste_material=0.0;
    private double precio=0.0;
    
    public Reparacion(int identificador, int tipo, String descripcion)
    {
        super(identificador, descripcion);
        this.tipo = tipo;
    }
    
    public int getTipo()
    {
        return tipo;
    }
    
    public double getCoste_material()
    {
        return coste_material;
    }
    
    public void setCoste_material(double coste_material)
    {
        this.coste_material += coste_material;
    }
    
    public double getPrecio()
    {
        return precio;
    }
    
    public void setPrecio(double precio)
    {
        this.precio = precio;
    }
    
    public double CalcularCoste()
    {
        if(getTipo() == 0)
        {
            setPrecio((getNum_horas() * valor_hora) + (getCoste_material() * 1.1));
            return (getNum_horas() * valor_hora) + (getCoste_material() * 1.1);
        }
        
        if(getTipo() == 1)
        {
            setPrecio((getNum_horas() * valor_hora) + (getCoste_material() * 1.3));
            return (getNum_horas() * valor_hora) + (getCoste_material() * 1.3);
        }
        
        return 0;
    }
    
    @Override
    public String toString()
    {
        if(getTipo() == 0)
        {
            return "Reparación Mecánica.\n" + 
                "Identificador: " + getIdentificador() + "\n" + 
                "Descripción: " + getDescripcion() + "\n" + 
                "Nº de horas: " + getNum_horas() + "\n" + 
                "Finalizado: " + isFinalizado() + "\n" + 
                "Coste piezas: " + getCoste_material() + "\n" + 
                "\tPrecio reparación: " + CalcularCoste() + "\n" + 
                "\n--------------------\n";
        }
        
        if(getTipo() == 1)
        {
            return "Reparación Chapa y Pintura.\n" + 
                "Identificador: " + getIdentificador() + "\n" + 
                "Descripción: " + getDescripcion() + "\n" + 
                "Nº de horas: " + getNum_horas() + "\n" + 
                "Finalizado: " + isFinalizado() + "\n" + 
                "Coste pintura: " + getCoste_material() + "\n" + 
                "\tPrecio reparación: " + CalcularCoste() + "\n" + 
                "\n--------------------\n";
        }
        
        return null;
    }
}
