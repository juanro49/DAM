/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jr49
 */
public class Revision extends Trabajos implements ICoste
{
    private double precio=0.0;
    
    public Revision(int identificador, String descripcion)
    {
        super(identificador, descripcion);
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
        setPrecio((getNum_horas() * valor_hora) + 20);
        return (getNum_horas() * valor_hora) + 20;
    }
    
    @Override
    public String toString()
    {
        return "Revisiones.\n" + 
                "Identificador: " + getIdentificador() + "\n" + 
                "Descripción: " + getDescripcion() + "\n" + 
                "Nº de horas: " + getNum_horas() + "\n" + 
                "Finalizado: " + isFinalizado() + "\n" + 
                "\tPrecio revisión: " + CalcularCoste() + "\n" + 
                "\n--------------------\n";
    }
}
