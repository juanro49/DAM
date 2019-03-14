
package ejercicio9dictema8;

public class Ejercicio9dicTema8
{
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
    
    public static void situarTorres (char M [][])
    {
        int count = 0;
        
        while(count < 3)
        {
            int i = (int) (Math.random() * M.length);
            int j = (int) (Math.random() * M.length);
            
            if(M [i][j] != '#')
            {
                M [i][j] = '#';
                count++;
            }
        }
        
        for (int i = 0;i < M.length;i++)
        {
            for (int j = 0;j < M[i].length; j++)
            {
                if(M[i][j] != '#')
                {
                    M [i][j] = '·';
                }
            }
        }
        
        mostrarMatriz(M);
    }
    
    public static void comerTorres (char M [][])
    {
        int torre = 0;
        
        for (int i = 0;i < M.length;i++)
        {
            for (int j = 0;j < M.length; j++)
            {
                if(M[i][j] == '#')
                {
                    torre++;
                    
                    //desplazamiento horizontal derecha
                    for(int k = j + 1; k < M.length; k++)
                    {
                        if(M[i][k] == '#')
                        {
                            System.out.println("La torre " + torre + " come hacia la derecha");
                        }
                    }
                    
                    //desplazamiento horizontal izquierda
                    for(int k = j - 1; k >= 0; k--)
                    {
                        if(M[i][k] == '#')
                        {
                            System.out.println("La torre " + torre + " come hacia la izquierda");
                        }
                    }
                    
                    //desplazamiento vertical abajo
                    for(int k = i + 1; k < M.length; k++)
                    {
                        if(M[k][j] == '#')
                        {
                            System.out.println("La torre " + torre + " come hacia abajo");
                        }
                    }
                    
                    //desplazamiento vertical arriba
                    for(int k = i - 1; k >= 0; k--)
                    {
                        if(M[k][j] == '#')
                        {
                            System.out.println("La torre " + torre + " come hacia arriba");
                        }
                    }
                }
            }
        }
    }
    
    public static void main(String[] args)
    {
        char ajedrez[][] = new char [8][8];
        
        situarTorres(ajedrez);
        comerTorres(ajedrez);
    }
    
}
