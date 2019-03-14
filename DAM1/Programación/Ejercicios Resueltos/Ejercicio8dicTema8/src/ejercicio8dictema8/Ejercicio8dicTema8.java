
package ejercicio8dictema8;

import java.util.Scanner;

public class Ejercicio8dicTema8
{
    public static void llenarMatriz (int M [][])
    {
         for (int i = 0;i < M.length;i++)
        {
            for (int j = 0;j < M[i].length; j++)
            {
                M [i][j] = (int) (Math.random() * 10);
            }
        }
    }
    
    public static void mostrarMatriz(int M [][])
    {
        for (int i = 0;i < M.length;i++)
        {
            for (int j = 0;j < M[i].length; j++)
            {
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    private static void sumarMatriz(int[][] m, int[][] n, int[][] o)
    {
        for (int i = 0;i < m.length;i++)
        {
            for (int j = 0;j < m.length; j++)
            {
                o[i][j] = m[i][j] + n[i][j];
            }
        }
        System.out.println();
        System.out.println("Matriz 1:");
        mostrarMatriz(m);
        
        System.out.println("Matriz 2:");
        mostrarMatriz(n);
        
        System.out.println("Matriz resultante:");
        mostrarMatriz(o);
    }
    
    public static void main(String[] args)
    {
        int fil1, col1, fil2, col2;
        
        Scanner sc = new Scanner (System.in);
        
        do
        {
            System.out.println("Escribe la dimensión de la primera matriz");
            fil1 = sc.nextInt();
        
            System.out.println("Escribe la dimensión de la segunda matriz");
            fil2 = sc.nextInt();
            
            if(fil1 != fil2)
            {
                System.out.println("Las matrices tienen que tener la misma dimensión para sumarlas");
            }
        }while(fil1 != fil2);
        
        col1 = fil1;
        col2 = fil2;
        
        int m [][] = new int [fil1][col1];
        int n[][] = new int [fil2][col2];
        int o[][] = new int[fil1][col2];
        
        llenarMatriz(m);
        llenarMatriz(n);
        sumarMatriz(m, n, o);
    }
}
