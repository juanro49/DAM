/*Pedir notas del 1 al 10 hasta introducir un -1, y despues enseñar cuantos ha habido de cada nota. Usar un vector de contadores.
 Devolver la media aritmetica(suma de valores por su frecuencia entre la suma de frecuencias).
 Devolver la moda(valor maxima frecuencia).
 Devolver la mediana(valor que tiene igual numero de valores superiores que inferiores)*/


package Ejercicio5dicTema8;

import java.util.Scanner;


public class Ejercicio5dicTema8
{

    public static void mostrarNotas (int v[]) 
    {
     
       for (int i=0;i<v.length;i++)
       {
            System.out.println("Cantidad de " +(i+1)+ ": " + v[i]);
       }
    }
    
    public static void Moda(int v [])
    {
        int mayor = 0, aux = v[0];
        
        for (int i=0; i < v.length; i++)
        {
            if (v[i] >= aux)
            {
                aux = v[i];
                mayor = i + 1;
            }
        }
        
        System.out.println("La moda es " + mayor);
    }
    
    public static void Media(int v[])
    {
        int sumanota = 0;
        int numnotas = 0;
        float media;
        
        for(int i = 0; i < v.length; i++)
        {
           sumanota += v[i] * (i + 1);
           numnotas += v[i];
        }
        
        media = (float) sumanota / numnotas;
        
        System.out.println("La media es " + media);
    }
    
    public static void Mediana(int v[])
    {
        int mediana = 0, numnotas = 0, cont = 0, j = 0;
        boolean b = false;
        
        for(int i = 0; i < v.length; i++)
        {
            numnotas += v[i];
        }
        
        while(b)
        {
            cont += v[j];
            j++;
            
            if(cont >= numnotas / 2)
            {
                mediana = j + 1;
                b = true;
            }
        }
        
        System.out.println("La mediana es " + mediana);
    }
    
    public static void main(String[] args)
    {
    
        int contador[]= new int [10];
        int nota;
        
        do
        {
            Scanner sc = new Scanner (System.in);
            System.out.println("Introduce una nota");
            nota= sc.nextInt();
          
            switch(nota)
            {
                case 0:
                break;
                case 1:
                  contador[nota-1]++;
                  break;
              case 2:
                  contador[nota-1]++;
                  break;
              case 3:
                  contador[nota-1]++;
                  break;
              case 4:
                  contador[nota-1]++;
                  break;
              case 5:
                  contador[nota-1]++;
                  break;
              case 6:
                  contador[nota-1]++;
                  break;
              case 7:
                  contador[nota-1]++;
                  break;
              case 8:
                  contador[nota-1]++;
                  break;
              case 9:
                  contador[nota-1]++;
                  break;
              case 10:
                  contador[nota-1]++;
                  break;
                }
        } while (nota > -1);
      
        mostrarNotas(contador);
        System.out.println();
        Moda(contador);
        Media(contador);
        Mediana(contador);
              
    }
}
