
package ejercicio49tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio49Tema5
{

    public static void main(String[] args) throws IOException
    {
        int segundos, s1, h1, m1, s2, h2, m2;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        do
        {
            System.out.println("Escribe las horas de la primera hora");
            h1 = Integer.parseInt(bf.readLine());
        }while (h1 < 0 || h1 > 24);
        
        do
        {
            System.out.println("Escribe los minutos  de la primera hora");
            m1 = Integer.parseInt(bf.readLine());
        }while (m1 < 0 || m1 > 60);
        
        do
        {
            System.out.println("Escribe los segundos  de la primera hora");
            s1 = Integer.parseInt(bf.readLine());
        }while (s1 < 0 || s1 > 60);
        
        do
        {
            System.out.println("Escribe las horas  de la segunda hora");
            h2 = Integer.parseInt(bf.readLine());
        }while (h2 < 0 || h2 > 24);
        
        do
        {
            System.out.println("Escribe los minutos  de la segunda hora");
            m2 = Integer.parseInt(bf.readLine());
        }while (m2 < 0 || m2 > 60);
        
        do
        {
            System.out.println("Escribe los segundos  de la segunda hora");
            s2 = Integer.parseInt(bf.readLine());
        }while (s2 < 0 || s2 > 60);
        
        s1 = s1 + (m1 * 60) + (h1 * 3600);
        
        s2 = s2 + (m2 * 60) + (h2 * 3600);
        
        if (s1 < s2)
        {
            segundos = s2 - s1;
            System.out.println("La diferencia en segundos es de " + segundos);
        }
        else
        {
            segundos = s1 - s2;
            System.out.println("La diferencia en segundos es de " + segundos);
        }
    }
}
