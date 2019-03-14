
package garciasanchez_juanroberto_ejercicio3_2eva;

import java.util.Scanner;

public class GarciaSanchez_JuanRoberto_Ejercicio3_2EVA
{
    public static void llenarVector (int [] v)
    {
        for (int i = 0; i < v.length; i++)
        {
            v [i] = (int) (Math.random() * 300) + 1;
        }
    }
    
    public static void mostrarVector(int v [])
    {
        for (int i=0 ; i < v.length; i++)
        {
            System.out.print(v[i] + " ");
        }
        
        System.out.println();
    }
    
    public static void contieneNumero (int [] v, int num)
    {
        
        for (int i = 0; i < v.length; i++)
        {
            if(num == v[i] % 10)
            {
                System.out.println("El número " + v[i] + " acaba en el número deseado");
            }
        }
    }

    public static void main(String[] args)
    {
        int tamano, numero;
        
        Scanner sc = new Scanner (System.in);
                
        System.out.println("Introduce el tamaño del vector");
        tamano = sc.nextInt();
        
        int v[] = new int [tamano];
        
        llenarVector(v);
        mostrarVector(v);
        
        do
        {
            System.out.println("Introduce un número entre 0 y 9");
            numero = sc.nextInt();
        }while(numero < 0 || numero > 9);
        
        contieneNumero(v, numero);
    }
    
}
