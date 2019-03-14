
package algoritmosordenación;

public class AlgoritmosOrdenación
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
    
    public static void insercionDirecta(int v[])
    {
        int aux, j;
        
        for(int i = 1; i < v.length; i++)
        {
            aux = v[i];
            j = i - 1;
            
            while (v[j] > aux && j > 0)
            {
                v[j + 1] = v[j];
                j = j - 1;
            }
            
            if (v[j] > aux)
            {
                v[j + 1] = v[j];
                v[j] = aux;
            }
            else
            {
                v[j + 1] = aux;
            }
            
            mostrarVector(v);
        }
    }
    
    public static void seleccionDirecta(int v[])
    {
        int k, aux;
        
        for(int i = 0; i < v.length - 1; i++)
        {
            k = i;
            aux = v[i];
            
            for(int j = i + 1; j < v.length; j++)
            {
                if(v[j] < aux)
                {
                    k = j;
                    aux = v[j];
                }
            }
            
            v[k] = v[i];
            v[i] = aux;
        }
        
        mostrarVector(v);
    }
    
    public static void intercambioDirecto1(int v[])
    {
        int aux;
        boolean b = false;//desordenado
        
        for(int i = v.length - 2; i >= 0  && b == false; i--)
        {
            b = true;
            
            for(int j = 0; j <=i; j++)
            {
                if(v[j] > v[j + 1])
                {
                    aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                     b = false;
                }
            }
            System.out.print(i + ":    ");
            mostrarVector(v);
        }
    }
    
    public static void intercambioDirecto2(int v[])
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
            System.out.print(i + ":    ");
            mostrarVector(v);
        }
    }

    public static void main(String[] args)
    {
        int vector [] = new int [5];
       // int vector [] = {3,2,2,1,4};
        //int vector [] = {1,2,3,5,4};
        
        llenarVector(vector);
        
        System.out.print("Vector original: ");
        mostrarVector(vector);
        System.out.println();
        
        /*System.out.println("Insercion directa: ");
        insercionDirecta(vector);
        System.out.println();*/
        
        /*System.out.println("Seleccion directa: ");
        seleccionDirecta(vector);
        System.out.println();*/
        
        /*System.out.println("Intercambio Directo 1: ");
        intercambioDirecto1(vector);
        System.out.println();*/
        
        System.out.println("Intercambio Directo 2: ");
        intercambioDirecto2(vector);
        System.out.println();
        
        System.out.print("Vector resultado: ");
        mostrarVector(vector);
    }
}
