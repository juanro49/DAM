
package ejercicio11tema6;

public class Ejercicio11Tema6
{

    public static void main(String[] args)
    {
        int a, b, c, d, e, f, g, h;
        
        a = (int) (Math.random() * 49 +1);
        
        do
        {
             b = (int) (Math.random() * 49 +1);
        } while (b == a);
       
        do
        {
            c = (int) (Math.random() * 49 +1);
        } while (c == b || c == a);
        
        do
        {
            d = (int) (Math.random() * 49 +1);
        } while (d == c || d == b || d == a);
             
       do
       {
           e = (int) (Math.random() * 49 +1);
       } while (e == d || e == c || e == b || e == a);
        
       do
       {
           f = (int) (Math.random() * 49 +1);
       } while (f == e || f == d || f == c || f == b || f == a);
        
        System.out.println("Los números son: " + "" + a + " " + b + " " + c + " " + d + " " + e + " " + f);
        
        do
       {
           g = (int) (Math.random() * 49 +1);
       } while (g == f || g == e || g == d || g == c || g == b || g == a);
        System.out.println("Complementario: " + g);
        
        h = (int) (Math.random() * 10);
        System.out.println("Reintegro: " + h);
    }
}
