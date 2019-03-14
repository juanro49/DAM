/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class Piscina
{
    private int nivel;
    public final int MAX_NIVEL;
    
    public Piscina(int max)
    {
        if(max < 0)
        {
            max = 0;
        }
        
        MAX_NIVEL = max;
    }
    
    public int getNivel()
    {
        return nivel;
    }
    
    public void vaciar(int cantidad) throws PiscinaNivelException
    {
        if(nivel < cantidad)
        {
            throw new PiscinaNivelException("Sin agua suficiente");
        }
        else
        {
            nivel -= cantidad;
        }
    }
    
    public void llenar(int cantidad) throws PiscinaNivelException
    {
        if (MAX_NIVEL < nivel + cantidad)
        {
            throw new PiscinaNivelException("Se desborda");
        }
        else
        {
            nivel += cantidad;
        }
    }
}