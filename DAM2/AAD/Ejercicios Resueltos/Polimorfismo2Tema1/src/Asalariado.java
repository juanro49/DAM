/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juanro49
 */
public class Asalariado
{
    private String nombre;
    private String nif;
    private int diasVacaciones;
    private double salarioBase;
    
    public Asalariado(String nombre, String nif, int diasVacaciones,double salarioBase)
    {
        setNombre(nombre);
        setNif(nif);
        setDiasVacaciones(diasVacaciones);
        setSalarioBase(salarioBase);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getDiasVacaciones() {
        return diasVacaciones;
    }

    public void setDiasVacaciones(int diasVacaciones) {
        this.diasVacaciones = diasVacaciones;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "\nAsalariado" + "\n\tNombre: " + nombre + "\n\tNIF: " + nif + "\n\tVacaciones: " + diasVacaciones + "\n\tSalario: " + salarioBase + "\n---------------";
    }
}
