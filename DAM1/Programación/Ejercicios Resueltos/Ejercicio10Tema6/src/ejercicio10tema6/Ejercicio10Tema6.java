
package ejercicio10tema6;

public class Ejercicio10Tema6
{

    public static void main(String[] args)
    {
         int x, count1 = 0, count2 = 0;
        
         for (int i = 1; i <=100; i++)
         {
             x = (int) (Math.random() * 2);
             
             if (x == 0)
             {
                 System.out.println("cara");
                 count1++;
             }
             else
             {
                 System.out.println("cruz");
                 count2++;
             }
         }
        
         System.out.println("\nHa salido cara " + count1 + " veces");
         System.out.println("Ha salido cruz " + count2 + " veces");
    }
}
