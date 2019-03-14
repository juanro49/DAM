
package ejercicio29fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio29Fechas
{

    public static void main(String[] args) throws ParseException
    {
        int diashabiles = 0;
        
        Scanner sc = new Scanner (System.in);
        
        SimpleDateFormat formatofecha = new SimpleDateFormat ("dd/MM/yyyy");
        
        Date fecha1, fecha2;
        Calendar cal1 = Calendar.getInstance(), cal2 = Calendar.getInstance(), aux;
        
        System.out.println("Introduce fecha1 con formato dd/MM/yyyy");
        fecha1 = formatofecha.parse(sc.nextLine());
        cal1.setTime(fecha1);
        
        System.out.println("Introduce fecha2 con formato dd/MM/yyyy");
        fecha2 = formatofecha.parse(sc.nextLine());
        cal2.setTime(fecha2);
        
        if (cal1.after(cal2))
        {
            aux = cal1;
            cal1 = cal2;
            cal2 = aux;
        }
        
        while (cal1.before(cal2) || cal1.equals(cal2))
        {
            if (cal1.get(Calendar.DAY_OF_WEEK) != 7 && cal1.get(Calendar.DAY_OF_WEEK) != 1)
            {
                diashabiles++;
            }
            cal1.add(Calendar.DATE, 1);
        }
        
        System.out.println("Habiles " + diashabiles);
    }
}
