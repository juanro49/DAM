
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juanro49
 */
public class Prestados implements Serializable
{
    int codigo;
    Date Fecha_prestamo, Fecha_devolucion;
    
    public Prestados(int codigo)
    {
        setCodigo(codigo);
        Calendar cal = Calendar.getInstance();
        Fecha_prestamo = cal.getTime();
        
        cal.add(Calendar.DAY_OF_YEAR, 15);
        Fecha_devolucion = cal.getTime();
    }

    public int getCodigo()
    {
        return codigo;
    }

    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }
}
