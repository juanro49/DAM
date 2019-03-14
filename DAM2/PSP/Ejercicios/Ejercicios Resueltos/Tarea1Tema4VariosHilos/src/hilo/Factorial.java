package hilo;

public class Factorial extends Thread
{
	public void run()
	{
		for (int i = 1; i <= 10; i++)
		{
			int fac = 1;
			
			System.out.print("Factorial de " + i + " = ");
			
			for (int j = i; j > 1; j--)
			{
				fac *= j;
			}
			
			System.out.println(fac);
		}
	}
}
