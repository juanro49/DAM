
package ejercicio27fechas;

import java.util.Calendar;

public class Ejercicio27Fechas
{
    public static void main(String[] args)
    {
        Calendar horasistema = Calendar.getInstance();
        
        System.out.print(horasistema.get(Calendar.HOUR_OF_DAY) + ":" + horasistema.get(Calendar.MINUTE) + ":" + horasistema.get(Calendar.SECOND) + " - ");
        System.out.println(horasistema.get(Calendar.DAY_OF_MONTH) + "/" + (horasistema.get(Calendar.MONTH) + 1) + "/" + horasistema.get(Calendar.YEAR));
    }
}
