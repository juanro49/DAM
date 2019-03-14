package produce;

import java.util.Random;

public class Produce
{
    public static void main(String[] args)
    {
        Random v = new Random();
        
        for (int i=0; i<10; i++)
        {
        	System.out.println(v.nextInt(10));
        }
    }
}
