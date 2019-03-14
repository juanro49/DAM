package ejercicio2dictema8;

public class Ejercicio2dicTema8
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
    
    public static void sumaSeguido(int[] v, int[] w)
    {
        int x[] = new int[v.length + w.length];
        
        for (int i = 0; i < v.length; i++)
        {
            x [i] = v[i];
        }
        
        for (int j = v.length; j < x.length; j++)
        {
            x [j] = w[j - v.length];
        }

        System.out.print("Resultante1:\t");
        mostrarVector(x);
    }
    
    public static void sumaSalteado(int[] v, int[] w)
    {
        int x[] = new int[v.length + w.length];
        int cont = 0, cont2 = 0;
        
        for (int i = 0; i < x.length; i++)
        {
            if(cont < v.length)
            {
                x[i + cont2] = v[cont];
                cont++;
            }
            
            if(cont2 < w.length)
            {
                x[i + cont] = w[cont2];
                cont2++;
            }
        }
        
        
        
        System.out.print("Resultante2:\t");
        mostrarVector(x);
    }
    
    public static void main(String[] args)
    {
        int v[] = new int [5];
        int w[] = new int[5];
        
        llenarVector(v);
        llenarVector(w);
        
        System.out.print("Vector 1:\t");
        mostrarVector(v);
        System.out.print("Vector 2:\t");
        mostrarVector(w);
        
        sumaSeguido(v, w);
        sumaSalteado(v, w);
    }
}
