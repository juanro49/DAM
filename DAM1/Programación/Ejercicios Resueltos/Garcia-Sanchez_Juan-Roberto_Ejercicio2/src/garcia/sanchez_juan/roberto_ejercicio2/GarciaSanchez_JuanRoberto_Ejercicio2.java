
package garcia.sanchez_juan.roberto_ejercicio2;

public class GarciaSanchez_JuanRoberto_Ejercicio2
{

    public static void main(String[] args)
    {
        int A, B, C, D, E, N;
        
        for (int año = 2000; año <= 2018; año++)
        {
            A = año % 19;
            B = año % 4;
            C = año % 7;
            D = (19 * A + 24) % 30;
            E = (2 * B + 4 * C + 6 * D + 5) % 7;
            N = (22 + D + E);
            
            if (N <= 31)
            {
                System.out.println("La Fecha del Domingo de Pascua de " + año + " es: " + N + " de Marzo");
            }
            else
            {
                N -= 31;
                System.out.println("La Fecha del Domingo de Pascua de " + año + " es: " + N + " de Abril");
            }
        }
    }
}
