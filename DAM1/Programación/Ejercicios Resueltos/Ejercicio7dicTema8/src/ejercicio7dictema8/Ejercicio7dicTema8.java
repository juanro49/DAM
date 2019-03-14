
package ejercicio7dictema8;

import java.util.Scanner;

public class Ejercicio7dicTema8
{
    public static int[][] cuadradoLatino (int M [][])
    {
        for (int i = 0;i < M.length;i++)
        {
            if (i == 0)
            {
                for (int j = 0;j < M[i].length; j++)
                {
                    M[i][j] = j + 1;
                }
            }
            else
            {
                for (int j = 0;j < M[i].length; j++)
                {
                    if(j == 0)
                    {
                         M[i][0] = M[i -1][M.length - 1];
                    }
                    else
                    {
                        M[i][j] = M[i - 1][j - 1];
                    }
                }
            }
        }
        
        return M;
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
    
    public static void main(String[] args)
    {
        int fil, col;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Escribe la dimensión de la matriz");
        fil = sc.nextInt();
        col = fil;
        
        int m [][] = new int [fil][col];
        
        m = cuadradoLatino(m);
        mostrarMatriz(m);
    }
}
