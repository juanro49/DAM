
package garciasanchez_juanroberto_ejercicio2_2eva;

public class GarciaSanchez_JuanRoberto_Ejercicio2_2EVA
{
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
    }
    
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
    
    public static void dominante(int M[][])
    {
        boolean nodominante = false;
        
        System.out.println("\nE. Diagonal\t Suma otros Elementos");
        
        for (int i = 0;i < M.length && nodominante == false;i++)
        {
            int suma = 0, diagonal = 0;
            
            for (int j = 0;j < M.length; j++)
            {
                if(j != i)
                {
                    suma+=M[i][j];
                }
                else
                {
                    diagonal = M[i][j];
                }
            }
            System.out.println(diagonal + "\t \t" + suma);
            
            if(diagonal <= suma)
            {
                nodominante = true;
            }
        }
        
        if(nodominante)
        {
            System.out.println("No es matriz diagonalmente dominante");
        }
        else
        {
            System.out.println("Es matriz diagonalmente dominante");
        }
        
    }

    public static void main(String[] args)
    {
        int M1 [][] = {{5,0,4},{2,12,5},{2,3,6}};
        int M2 [][] = {{5,0,4},{4,12,8},{2,3,6}};
        
        mostrarMatriz(M1);
        dominante(M1);
        
        System.out.println("\n");
        mostrarMatriz(M2);
        dominante(M2);
    }
}
