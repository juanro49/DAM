/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juanro
 */
abstract public class Vehiculo
{
    protected String matricula;
    protected boolean alquilado;
    
    public Vehiculo(String mat, boolean alq)
    {
        this.matricula = mat;
        this.alquilado = alq;
    }
    
    public abstract void alquilar(int dia);
    
    public abstract boolean devolver(int dia);
    
    public abstract String showInfo();
}
