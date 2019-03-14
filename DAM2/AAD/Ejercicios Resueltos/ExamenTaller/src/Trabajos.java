/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jr49
 */
public class Trabajos
{
    static int contador = 0;
    private int identificador;
    private String descripcion;
    private int num_horas = 0;
    private boolean finalizado = false;
    
    public Trabajos(int identificador, String descripcion)
    {
        this.identificador = identificador;
        this.descripcion = descripcion;
    }
    
    public int getIdentificador()
    {
        return identificador;
    }
    
    public String getDescripcion()
    {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }
    
    public int getNum_horas()
    {
        return num_horas;
    }
    
    public void setNum_horas(int num_horas)
    {
        this.num_horas += num_horas;
    }
    
    public boolean isFinalizado()
    {
        return finalizado;
    }
    
    public void setFinalizado(boolean finalizado)
    {
        this.finalizado = finalizado;
    }
}
