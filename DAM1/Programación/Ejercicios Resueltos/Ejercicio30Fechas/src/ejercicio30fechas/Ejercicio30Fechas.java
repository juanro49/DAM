
package ejercicio30fechas;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio30Fechas
{
    public static void main(String[] args)
    {
        int x;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("******************************");
        System.out.println("Selecciona una opción del menú");
        System.out.println("1. ¿Que hora es?");
        System.out.println("2. ¿Que día de la semana es?");
        System.out.println("3. ¿Que día del mes es?");
        x = sc.nextInt();
        
        Calendar horasistema = Calendar.getInstance();
        Locale local = Locale.getDefault();
        
        switch (x)
        {
            case 1:
                System.out.println(horasistema.get(Calendar.HOUR_OF_DAY) + ":" + horasistema.get(Calendar.MINUTE) + ":" + horasistema.get(Calendar.SECOND));
                break;
                
            case 2:
                String dia = horasistema.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, local);
                System.out.println("Hoy es " + dia);
                break;
                
            case 3:
                String mes = horasistema.getDisplayName(Calendar.MONTH, Calendar.LONG, local);
                System.out.println("Hoy es " + horasistema.get(Calendar.DAY_OF_MONTH) + " de " + mes);
        }
    }
}
