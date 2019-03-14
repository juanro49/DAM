
package fecha1;

import java.util.Calendar;
import java.util.Scanner;

public class Fecha1
{

    public static void main(String[] args)
    {
        int mes, año;
        Calendar cal = Calendar.getInstance();
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduce mes:");
        mes = sc.nextInt();
        
        System.out.println("Introduce año");
        año = sc.nextInt();
        
        cal.set(Calendar.YEAR, año);
        cal.set(Calendar.MONTH, mes -1);
        
        System.out.println("mes: " + (cal.get(Calendar.MONTH) + 1));
        System.out.println("año: " + cal.get(Calendar.YEAR));
        System.out.println("Primer día del mes: " + cal.getActualMinimum(Calendar.DAY_OF_MONTH));
        System.out.println("Último día del mes: " + cal.getActualMaximum(Calendar.DAY_OF_MONTH));
    }
}
