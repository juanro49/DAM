
package ejercicio71tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio71Tema5 {

    public static void main(String[] args) throws IOException
    {
        int A, B, C, D, E, F, x, y;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        do
        {
            System.out.println("Escribe coordenada x punto 1");
            A = Integer.parseInt(bf.readLine());
        } while (A < 0);
        
        do
        {
            System.out.println("Escribe coordenada y punto 1");
            B = Integer.parseInt(bf.readLine());
        } while (B < 0);
        
        do
        {
            System.out.println("Escribe coordenada x punto 2");
            C = Integer.parseInt(bf.readLine());
        } while (C < 0);
        
        do
        {
            System.out.println("Escribe coordenada y punto 2");
            D = Integer.parseInt(bf.readLine());
        } while (D < 0);
        
        do
        {
            System.out.println("Escribe coordenada x punto 3");
            E = Integer.parseInt(bf.readLine());
        } while (E < 0);
        
        do
        {
            System.out.println("Escribe coordenada y punto 3");
            F = Integer.parseInt(bf.readLine());
        } while (F < 0);
        
        x = (E - A) / (C -A);
        y = (F - B) / (D - B);
        
        if (x == y)
        {
            System.out.println("El punto (" + E + "," + F + ") pertenece a la recta");
        }
        else
        {
            System.out.println("El punto (" + E + "," + F + ") no pertenece a la recta");
        }
    }
}
