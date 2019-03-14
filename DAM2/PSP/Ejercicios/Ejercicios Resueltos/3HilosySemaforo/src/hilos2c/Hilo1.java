package hilos2c;

import java.util.concurrent.Semaphore;

public class Hilo1 extends Thread
{
	 protected Semaphore P1;
	 
	 public Hilo1(Semaphore P1)
	 {
		 this.P1 = P1;
	 }
	 
	 public void run()
	 {
		 for (int i=0; i<10; i++)
		 {
			 System.out.println("Hola");
		 }
		 
		 this.P1.release(2);
	 }
}