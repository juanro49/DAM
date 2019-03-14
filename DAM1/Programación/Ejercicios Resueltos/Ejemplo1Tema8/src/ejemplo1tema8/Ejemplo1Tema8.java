
package ejemplo1tema8;

public class Ejemplo1Tema8
{
    public static void main (String [] args) 
    {
        int mayor, menor , suma;
        int [] nums = {3,4,8,2};

        suma = 0 ;
        menor = nums [0];
        mayor = nums [0]; 

        //en las variables mayor y menor se obtendrá el mayor y el menor de los
        //números buscados, respectivamente. Ambas se inicializan con
        //cualquiera de los valores del array, recorre el array en busca de los extremos, 
        //acumulando en suma cada uno de los números contenidos en el array.

        for (int i=0 ; i < nums.length; i++)
        { 
            if (nums[i] > mayor) 
            {
                mayor = nums [i];
            }
            
            if (nums[i] < menor) 
            {
                menor = nums[i];
            }
            
            suma += nums[i];
        }
        
        System.out.println("El mayor es " + mayor);
        System.out.println("El menor es " + menor);
        System.out.println("La suma es " + suma);
    }
}
