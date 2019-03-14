package hilos2c;

import java.util.concurrent.Semaphore;

public class Main 
{
	 protected static Semaphore P1;
	 
	 public static void main(String[] args)
	 {
		 P1 = new Semaphore(0, true);
		 
		 Hilo1 Hil1 = new Hilo1(P1);
		 Hil1.start();
		 
		 Hilo2 Hil2 = new Hilo2(P1);
		 Hil2.start();
		 
		 Hilo3 Hil3 = new Hilo3(P1);
		 Hil3.start();
	 }
}