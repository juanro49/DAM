
package ejercicio65tema5;



public class Ejercicio65Tema5
{

    public static void main(String[] args)
    {
        int ex = 0, terminacion, potencia = 1;
        
        while (potencia < 2048)
        {
            potencia = (int) Math.pow(2, ex);
            
            terminacion = potencia % 10;
            
            if (terminacion >= 0 && terminacion <= 5)
            {
                System.out.println(potencia);
            }
            
            ex++;
        }
    }
}