
package ejercicio26fechas;

import java.util.Calendar;





public class Ejercicio26Fechas
{

    public static void main(String[] args)
    {
        Calendar horasistema = Calendar.getInstance();
        
        System.out.println(horasistema.get(Calendar.HOUR_OF_DAY) + ":" + horasistema.get(Calendar.MINUTE) + ":" + horasistema.get(Calendar.SECOND));
    }
}
