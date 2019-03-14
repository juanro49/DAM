package hilo;

public class Main
{

	public static void main(String[] args)
	{
		Produce produce = new Produce();
		produce.start();
		
		Factorial factorial = new Factorial();
		factorial.start();
		
		Primo primo = new Primo();
		primo.start();
	}

}
