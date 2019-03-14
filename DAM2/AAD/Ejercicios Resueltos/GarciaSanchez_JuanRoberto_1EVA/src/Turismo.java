
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juanro
 */
public class Turismo extends Vehiculo implements ICoste
{
    protected double precioKm;
    protected int kmAlquiler = 0, kmDevolucion = 0;
    
    public Turismo(String mat, double prKm)
    {
        super(mat, false);
        this.precioKm = prKm;
    }

    @Override
    public void alquilar(int kmAlq)
    {
        this.kmAlquiler = kmAlq;
        this.alquilado = true;
        JOptionPane.showMessageDialog(null, "El turismo " + this.matricula + " se ha alquilado con " + this.kmAlquiler + " Km");
    }
    
    @Override
    public boolean devolver(int kmDev)
    {
        if(this.alquilado)
        {
            this.alquilado = false;
            this.kmDevolucion = kmDev;
            JOptionPane.showMessageDialog(null, "Se devuelve el turismo con matrícula " + this.matricula + " y con " + this.kmDevolucion + " Km.\n" + 
                    "Precio a abonar: " + this.calcularCoste() + "€");
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El turismo " + this.matricula + " no está alquilado");
            return false;
        }
    }
    
    @Override
    public double calcularCoste()
    {
        return Math.round(((this.kmDevolucion - this.kmAlquiler) * this.precioKm) * 1000d) / 1000d;
    }
    
    @Override
    public String showInfo()
    {
        return "\nDatos de un Turismo:\n" + 
                "Matrícula: " + this.matricula + 
                "\nAlquilado: " + ((this.alquilado == true)? "Si":"No") + 
                "\nPrecio por km: " + this.precioKm + "€" + 
                "\n--------------------\n";
    }
}
