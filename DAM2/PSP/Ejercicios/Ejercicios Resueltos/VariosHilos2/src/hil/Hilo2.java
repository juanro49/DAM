package hil;

public class Hilo2 extends Thread
{
	 public Hilo2(String str)
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
}