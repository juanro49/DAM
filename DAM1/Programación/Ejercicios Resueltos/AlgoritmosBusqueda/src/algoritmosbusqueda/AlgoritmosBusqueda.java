
package algoritmosbusqueda;

import java.util.Scanner;

public class AlgoritmosBusqueda
{
    public static void llenarVector (int [] v)
    {
        for (int i = 0; i < v.length; i++)
        {
            v [i] = (int) (Math.random() * 101);
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
    
    public static void ordenarVector(int v[])
    {
        int aux;
        boolean b = false;//desordenado
        
        for(int i = 0; i < v.length - 1 && b == false; i++)
        {
            b = true;
            
            for(int j = v.length - 1; j > i; j--)
            {
                if(v[j - 1] > v[j])
                {
                    aux = v[j - 1];
                    v[j - 1] = v[j];
                    v[j] = aux;
                    b = false;
                }
            }
        }
        mostrarVector(v);
    }

    public static void busquedaBinaria(int v [], int x)
    {
        int izq = 0;
        int der = v.length - 1;
        int cen;

        do
        {
            cen = (izq + der) / 2;

            if (x != v[cen])
            {
                if(x > v[cen])
                {
                    izq = cen + 1;
                }
                else
                {
                    der = cen - 1;
                }
            }
        } while (x != v[cen] && izq <= der);
            
        if(izq > der)
        {
            System.out.println(x + " no está");
        }
        else
        {
            System.out.println(x + " está en la posición " + cen);
        }
    }
    
    public static void main(String[] args)
    {
        int vector [] = new int [10];
        //int vector [] = {1,2,3,4,5};
        int num;
        
        llenarVector(vector);
        ordenarVector(vector);
        
        System.out.println("Introduce un número a buscar");
        Scanner sc = new Scanner (System.in);
        num = sc.nextInt();
        
        busquedaBinaria(vector, num);
    }
}
