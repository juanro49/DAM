
package ejercicio28fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio28Fechas
{

    public static void main(String[] args) throws ParseException
    {
        Scanner sc = new Scanner (System.in);
        
        SimpleDateFormat formatofecha = new SimpleDateFormat ("MM/yyyy");
        
        Date fecha;
        Calendar cal = Calendar.getInstance();
        
        System.out.println("Escribe una fecha en el formato (MM/yyyy)");
        fecha = formatofecha.parse(sc.nextLine());
        
        cal.setTime(fecha);
        
        System.out.println("El mes " + (cal.get(Calendar.MONTH) + 1) + " del año " + cal.get(Calendar.YEAR));
        System.out.println("Primer día del mes es " + cal.getActualMinimum(Calendar.DAY_OF_MONTH) + " y el último es " + cal.getActualMaximum(Calendar.DAY_OF_MONTH));
    }
}
