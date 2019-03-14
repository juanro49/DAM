package hil;

public class Hilo1 extends Thread
{
	 public Hilo1(String str)
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