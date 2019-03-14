
package ejercicio41tema5;

public class Ejercicio41Tema5
{

    public static void main(String[] args)
    {
        for (int  a = 0; a <= 9; a++)
        {
            for (int b = 0; b <= 9; b++)
            {
                for (int c = 0; c <= 9; c++)
                {
                    for (int d = 0; d <= 9; d++)
                    {
                        for (int e = 0; e <= 9; e++)
                        {
                            if (a == 3)
                            {
                                System.out.print("E");
                            }
                            else
                            {
                                System.out.print(a);
                            }
                            
                            if (b == 3)
                            {
                                System.out.print("E");
                            }
                            else
                            {
                                System.out.print(b);
                            }
                            
                            if (c == 3)
                            {
                                System.out.print("E");
                            }
                            else
                            {
                                System.out.print(c);
                            }
                            
                            if (d == 3)
                            {
                                System.out.print("E");
                            }
                            else
                            {
                                System.out.print(d);
                            }
                            
                            if (e == 3)
                            {
                                System.out.println("E");
                            }
                            else
                            {
                                System.out.println(e);
                            }
                        }
                    }
                }
            }
        }
    }
}