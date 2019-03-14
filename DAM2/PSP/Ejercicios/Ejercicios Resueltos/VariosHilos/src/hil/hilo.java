package hil;

public class hilo extends Thread
{
	public hilo(String str)
	{
		super(str);
	}
	
	public void run()
	{
		for (int i=0; i<10; i++)
		{
		System.out.println(i+" "+getName());
		}
	}
	
	public static void main(String[] args) 
	{
		hilo Hil1 = new hilo("alfredo");
		Hil1.start();
		new hilo("pepe").start();
		new hilo("jose").start();
		new hilo("juan").start();
	}
}