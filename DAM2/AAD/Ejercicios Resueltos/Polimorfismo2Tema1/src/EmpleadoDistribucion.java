/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juanro49
 */
public class EmpleadoDistribucion extends Asalariado
{
    private String region;
    
    public EmpleadoDistribucion(String nombre, String nif,int diasVacaciones, 
                                double salarioBase,String region)
    {
        super(nombre, nif, diasVacaciones, salarioBase);
        setRegion(region);
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    
    public double getSalario()
    {
        return getSalarioBase() * 1.10;
    }
    
    @Override
    public String toString() {
        return "\nDistribución" + "\n\tNombre: " + getNombre() + "\n\tNIF: " + getNif() + "\n\tVacaciones: " + getDiasVacaciones() + "\n\tSalario: " + getSalario() + "\n\tRegion: " + region + "\n---------------";
    }
}
