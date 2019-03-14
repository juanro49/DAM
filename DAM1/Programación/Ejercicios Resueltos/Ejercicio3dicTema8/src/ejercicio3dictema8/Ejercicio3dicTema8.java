/*
    Llenar matriz
    Mostrar matriz
    Sumar filas
    Sumar columnas
    Mostrar elementos diagonal principal
    Mostrar elementos de la diagonal secundaria
    Invertir diagonal principal
    Decir si es triangular superior
    Decir si es triangular Inferior
    Decir si es matriz cero
    Decir si es martriz diagonal (triangular superior && triangular inferior && matriz cero)
*/
package ejercicio3dictema8;

import javax.swing.JOptionPane;

public class Ejercicio3dicTema8
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
    
    public static int[] sumarFilas(int M[][])
    {
        int v[] = new int [M.length];
        
        for (int i = 0;i < M.length; i++)
        {
            for (int j = 0;j < M[i].length; j++)
            {
                v[i] += M[i][j];
            }
        }
        
        return v;
    }
    
    public static int[] sumarColumnas(int M[][])
    {
        //Para matrices no cuadradas sirve
        int v[] = new int [M[0].length];
        
        for (int i = 0; i < M[0].length; i++)
        {
            for (int j = 0; j < M.length; j++)
            {
                v[i] += M[j][i];
            }
        }
        
        return v;
    }
    
    public static void mostrarVector(int v [])
    {
        for (int i=0 ; i < v.length; i++)
        {
            System.out.print(v[i] + " ");
        }
        
        System.out.println();
    }
    
    public static int[] diagonalPrincipal(int M[][])
    {
        int v[] = new int [M.length];
        
        for (int i = 0;i < M.length; i++)
        {
            v[i] = M[i][i];
        }
        return v;
    }
    
    public static void diagonalSecundaria(int M[][])
    {
        int v[] = new int [M.length];
        
        for (int i = 0;i < M.length; i++)
        {
            v[i] = M[i][(M.length - 1) - i];
        }
        System.out.print("La diagonal segundaria es:\t");
        mostrarVector(v);
    }
    
    public static void invDiagprin(int M[][])
    {
        int aux;
        for (int i = 0; i < M.length / 2; i++)
        {
            aux = M[i][i];
            M[i][i] = M[M.length - 1 - i][M.length - 1 - i];
            M[M.length - 1 - i][M.length - 1 - i] = aux;
        }
        
        System.out.println("La diag. Prin. invertida es:\t");
        mostrarMatriz(M);
    }
    
    public static boolean triangularSuperior(int M [][])
    {
        boolean b = true;
        
        for(int i = 0; i < M.length; i++)
        {
            for (int j = i + 1; j < M[i].length; j++)
            {
                if(M[i][j] != 0)
                {
                    b = false;
                }
            }
        }
        
        if(b)
        {
            System.out.println("Es triangular superior");
        }
        else
        {
            System.out.println("No es triangular superior");
        }
        
        return b;
    }
    
    public static boolean triangularInferior(int M [][])
    {
        boolean b = true;
        
        for(int i = M.length - 1; i >= 0; i--)
        {
            for (int j = i - 1; j >= 0; j--)
            {
                if(M[i][j] != 0)
                {
                    b = false;
                }
            }
        }
        
        if(b)
        {
            System.out.println("Es triangular inferior");
        }
        else
        {
            System.out.println("No es triangular inferior");
        }
        
        return b;
    }
    
    public static boolean matrizCero(int M[][])
    {
        boolean b = true;
        
        for (int i = 0;i < M.length; i++)
        {
            for (int j = 0;j < M[i].length; j++)
            {
                if (i == j && M[i][j] != 0)
                {
                    b = false;
                }
            }
        }
        
        if(b)
        {
            System.out.println("Es matriz cero");
        }
        else
        {
            System.out.println("No es matriz cero");
        }
        
        return b;
    }
    
    public static void matrizDiagonal(boolean triansup, boolean trianinf, boolean matrizcero)
    {
        if(triansup && trianinf && matrizcero)
        {
            System.out.println("Es matriz diagonal");
        }
        else
        {
            System.out.println("No es matriz diagonal");
        }
    }
    
    public static void main(String[] args)
    {
        int fil, col;
        
        fil = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la dimensión de la matriz", "Dimensión", JOptionPane.QUESTION_MESSAGE));
        col = fil;
        
        int m [][] = new int [fil][col];
        int sumfil [] = new int [fil];
        int sumcol [] = new int [col];
        int diagprin [] = new int [col];
        boolean matrizcero, triansup, trianinf;
        
        llenarMatriz(m);
        mostrarMatriz(m);
        
        sumfil = sumarFilas(m);
        System.out.print("La suma de las filas es:\t");
        mostrarVector(sumfil);
        
        sumcol = sumarColumnas(m);
        System.out.print("La suma de las columnas es:\t");
        mostrarVector(sumcol);
        
        diagprin = diagonalPrincipal(m);
        System.out.print("La diagonal principal es:\t");
        mostrarVector(diagprin);
        
        diagonalSecundaria(m);
        invDiagprin(m);
        
        triansup = triangularSuperior(m);
        trianinf = triangularInferior(m);
        matrizcero = matrizCero(m);
        matrizDiagonal(triansup, trianinf, matrizcero);
    }
}
