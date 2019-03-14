
package garcia.sanchez_juan.roberto_ejercicio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GarciaSanchez_JuanRoberto_Ejercicio3
{

    public static void main(String[] args) throws IOException
    {
        int temp;
        BufferedReader bf = new BufferedReader (new InputStreamReader  (System.in));
        
        
        for (int i = 1; i <= 12; i++)
        {
            do
            {
                System.out.println("Temperatura media positiva del mes " + i);
                temp = Integer.parseInt(bf.readLine());
            }while(temp < 0);
            
            System.out.print(i + ": ");
            
            for (int j = 1; j <= temp; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
