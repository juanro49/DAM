
package ejercicio1dictema8;

public class Ejercicio1dicTema8
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
        System.out.print("Vector ordenado:\t");
        mostrarVector(v);
    }
    
    public static void rotarDerecha(int v[])
    {
        int aux = v[v.length - 1];
        for (int i = v.length - 1; i > 0; i--)
        {
            v [i] = v[i - 1];
        }
        v[0] = aux;
        
        System.out.print("Rotado a la derecha:\t");
        mostrarVector(v);
    }
    
    public static void rotarIzquierda(int v[])
    {
        int aux = v[0];
        for (int i = 0; i < v.length - 1; i++)
        {
            v [i] = v[i + 1];
        }
        v[v.length - 1] = aux;
        
        System.out.print("Rotado a la izquierda:\t");
        mostrarVector(v);
    }
    
    public static int[] invertirVector1 (int v[])
    {
        int vector [] = new int [v.length];
        
        for (int i = 0; i < v.length; i++)
        {
            vector[v.length -1 - i] = v [i];
        }
        
        System.out.print("Vector invertido (aux):\t");
        return vector;
    }
    
    public static void invertirVector2 (int v[])
    {
        int aux;
        for (int i = 0; i < v.length / 2; i++)
        {
            aux = v[v.length - 1 - i];
            v[v.length - 1 - i] = v[i];
            v[i] = aux;
        }
        
        System.out.print("Vector invertido:\t");
        mostrarVector(v);
    }
    
    
    public static void main(String[] args)
    {
        int vector [] = new int [4];
        //int vector [] = {1,2,3,4};
        
        //System.out.print("Vector original:\t");
        //mostrarVector(vector);
        llenarVector(vector);
        ordenarVector(vector);
        
        rotarDerecha(vector);
        rotarIzquierda(vector);
        vector = invertirVector1(vector);
        mostrarVector(vector);
        invertirVector2(vector);
    }
}