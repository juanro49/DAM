
package fecha2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Fecha2
{

    public static void main(String[] args) throws ParseException
    {
        Scanner sc = new Scanner (System.in);
        
        SimpleDateFormat formatofecha = new SimpleDateFormat ("MM/yyyy");
        Date fecha;
        Calendar cal = Calendar.getInstance();
        
        System.out.println("Introduce fecha en el formato (MM/yyyy)");
        fecha = formatofecha.parse(sc.nextLine());
        
        cal.setTime(fecha);
        System.out.println(fecha);
        
        System.out.println("día: " + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("mes: " + (cal.get(Calendar.MONTH) + 1));
        System.out.println("año: " + cal.get(Calendar.YEAR));
        System.out.println("Primer día del mes: " + cal.getActualMinimum(Calendar.DAY_OF_MONTH));
        System.out.println("Último día del mes: " + cal.getActualMaximum(Calendar.DAY_OF_MONTH));
    }
}
