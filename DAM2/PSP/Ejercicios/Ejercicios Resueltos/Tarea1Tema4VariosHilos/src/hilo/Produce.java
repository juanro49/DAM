package hilo;

public class Produce extends Thread
{
	public void run()
	{
		char vocales[] = {'a', 'e', 'i', 'o', 'u'};
		
		for (int i = 0; i < 5; i++)
		{
			for(int j = 0; j < vocales.length; j++)
			{
				System.out.println(vocales[j]);
			}
		}
	}
}
