
package ejercicio12tema6;

public class Ejercicio12Tema6
{
    public static void main(String[] args)
    {
        int x, y;
        
        do
        {
            x = (int) (Math.random() * 6 + 1);
            System.out.println(x);
        
            y = (int) (Math.random() * 6 + 1);
            System.out.println(y);
        
            if (x == y)
            {
                System.out.println("Son pareja");
            }
            else
            {
                System.out.println("No son pareja");
            }
        } while (x != y);
    }
}
