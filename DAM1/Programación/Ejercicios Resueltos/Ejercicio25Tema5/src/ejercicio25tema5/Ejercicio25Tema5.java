
package ejercicio25tema5;

public class Ejercicio25Tema5 {

    public static void main(String[] args)
    {
        int producto = 1;
        
        for (int i = 1; i <= 10; i = i + 2)
        {
            System.out.println ("Número " + i);
            producto = producto * i;
        }
        
        System.out.println("El producto es " + producto);
    }
}
