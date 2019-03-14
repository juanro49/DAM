
package ejercicio6dictema8;

import java.util.Scanner;


public class Ejercicio6dicTema8
{
    public static int[][] cuadradoMagico (int M [][])
    {
        int fil = 0,  col = M.length / 2;
        
        M[fil][col] = 1;
        
        for(int count = 2; count <= Math.pow(M.length, 2); count++)
        {
            if((count - 1) % M.length != 0)
            {
                fil--;
                col++;
            
                if(fil == -1)
                {
                    fil = M.length - 1;
                }
            
                if(col == M.length)
                {
                    col = 0;
                }
                
                M[fil][col] = count;
            }
            else
            {
                fil++;
                
                if(fil == M.length)
                {
                    fil = 0;
                }
                
                M[fil][col] = count;
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
        
        do
        {
            System.out.println("Escribe la dimensión de la matriz");
            fil = sc.nextInt();
            
            if(fil % 2 == 0)
            {
                System.out.println("El cuadrado mágico no puede ser de dimensión par");
            }
            
        }while(fil % 2 == 0 || fil < 0);
        
        col = fil;
        int m [][] = new int [fil][col];
        
        m = cuadradoMagico(m);
        mostrarMatriz(m);
    }
}
