package hilos1c;

import java.util.concurrent.Semaphore;

public class Hilo2 extends Thread
{
	 protected Semaphore P1;
	 
	 public Hilo2(Semaphore P1)
	 {
		 this.P1 = P1;
	 }
	 
	 public void run()
	 {
		 for (int i=0; i<10; i++)
		 {
			 System.out.println("Hola ");
		 }
		 
		 this.P1.release(1);
	 }
}