
package ejercicio38tema5;

public class Ejercicio38Tema5
{

    public static void main(String[] args)
    {
        for (int i = 1; i <= 10; i++)
        {
            System.out.println("Tabla del " + i);
            
            for (int j = 0; j <= 10; j++)
            {
                System.out.println(i + "x" + j + "=" + i * j);
            }
            System.out.println("");
        }
    }
}
