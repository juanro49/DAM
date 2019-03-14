
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
public class Camion extends Vehiculo implements ICoste
{
    protected double precioDia;
    protected int diaAlquiler = 0, diaDevolucion = 0;
    
    public Camion(String mat, double prDia)
    {
        super(mat, false);
        this.precioDia = prDia;
    }

    @Override
    public void alquilar(int diaAlq)
    {
        this.diaAlquiler = diaAlq;
        this.alquilado = true;
        JOptionPane.showMessageDialog(null, "El camión " + this.matricula + " se ha alquilado el día " + this.diaAlquiler);
    }
    
    @Override
    public boolean devolver(int diaDev)
    {
        if(this.alquilado)
        {
            this.alquilado = false;
            this.diaDevolucion = diaDev;
            JOptionPane.showMessageDialog(null, "Se devuelve el camión con matrícula " + this.matricula + " el día " + this.diaDevolucion + ".\n" + 
                    "Precio a abonar: " + this.calcularCoste() + "€");
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El camión " + this.matricula + " no está alquilado");
            return false;
        }
    }
    
    @Override
    public double calcularCoste()
    {
        return Math.round(((this.diaDevolucion - this.diaAlquiler) * this.precioDia) * 1000d) / 1000d;
    }
    
    @Override
    public String showInfo()
    {
        return "\nDatos de un Camión:\n" + 
                "Matrícula: " + this.matricula + 
                "\nAlquilado: " + ((this.alquilado == true)? "Si":"No") + 
                "\nPrecio por día: " + this.precioDia + "€" + 
                "\n--------------------\n";
    }
}
