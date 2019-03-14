
package ejercicio10dictema8;

import java.util.Scanner;

public class Ejercicio10dicTema8
{
    public static void marcoMatriz (char M [][])
    {
         for (int i = 0;i < M.length;i++)
        {
            for (int j = 0;j < M[i].length; j++)
            {
                if(i == 0 || j == 0 || i == M.length - 1 || j == M.length - 1)
                {
                    M [i][j] = '*';
                }
                else
                {
                    M[i][j] = '-';
                }
            }
        }
         
         mostrarMatriz(M);
    }
    
    public static void mostrarMatriz(char M [][])
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
    
    public static void main(String[] args)
    {
        int fil, col;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Escribe la dimensión de la matriz");
        fil = sc.nextInt();
        col = fil;
        
        char marco[][] = new char [fil][col];
        
        marcoMatriz(marco);
    }
}
