
package ejercicio8tema3;

public class Ejercicio8Tema3
{
    public static void main(String[] args)
    {
        int x = 3;
        double y = 5.0;
        float z = (float) (200 * y + x);
        
        System.out.println ("(float) z=" + z + 
                "\n(double) z=" + (double)z + 
                "\n(entero) z=" + (int)z + 
                "\n(byte) z=" + (byte)z);
    }
}
