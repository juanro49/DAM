
package ejemplo1btema8;

public class Ejemplo1bTema8
{
    public static void llenarVector (int [] v)
    {
        for (int i = 0; i < v.length; i++)
        {
            v [i] = (int) (Math.random() * 101);
        }
    }
    
    public static void mostrarVector (int [] v)
    {
        for (int i = 0; i < v.length; i++)
        {
            System.out.println(v [i] + "");
        }
    }
    
    public static int sumaVector (int [] v)
    {
        int suma = 0;
        for (int i=0 ; i < v.length; i++)
        {
            suma += v[i];
        }
        return suma;
    }
    
    public static int mayor (int [] v)
    {
        int mayor = v [0];
         for (int i=0 ; i < v.length; i++)
        {
            if (v [i] > mayor) 
            {
                mayor = v [i];
            }
        }
        return mayor;
    }
    
    public static int menor (int [] v)
    {
        int menor = v [0];
         for (int i=0 ; i < v.length; i++)
        {
            if (v [i] < menor) 
            {
                menor = v [i];
            }
        }
        return menor;
    }
    
    public static void main(String[] args)
    {
        int [] vector = new int [15];
        llenarVector(vector);
        mostrarVector(vector);
        System.out.println("La suma es " + sumaVector(vector));
        System.out.println("El mayor es " + mayor(vector));
        System.out.println("El menor es " + menor(vector));
    }
}
