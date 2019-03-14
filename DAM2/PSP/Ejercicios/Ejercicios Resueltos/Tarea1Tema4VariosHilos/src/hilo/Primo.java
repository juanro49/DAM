package hilo;

public class Primo extends Thread
{
	public void run()
	{
		
		for(int i = 1; i <= 15; i++)
		{
			int cont = 0;
			
			System.out.print(i);
			
			for(int j = i; j >= 1; j--)
			{
				if(i % j == 0)
				{
					cont++;
				}
			}
			
			if(cont > 2)
			{
				System.out.println(" no es primo");
			}
			else
			{
				System.out.println(" es primo");
			}
		}
	}
}
