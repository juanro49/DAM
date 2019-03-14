/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juanro49
 */
public class EmpleadoProduccion extends Asalariado
{
    private String turno;
    
    public EmpleadoProduccion(String nombre, String nif, int diasVacaciones, 
                                double salarioBase,String turno)
    {
        super(nombre, nif, diasVacaciones, salarioBase);
        setTurno(turno);
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    public double getSalario()
    {
        return getSalarioBase() * 1.15;
    }
    
    @Override
    public String toString() {
        return "\nProducción" + "\n\tNombre: " + getNombre() + "\n\tNIF: " + getNif() + "\n\tVacaciones: " + getDiasVacaciones() + "\n\tSalario: " + getSalario() + "\n\tTurno: " + turno + "\n---------------";
    }
}
