package hil;

public class Main
{
	 public static void main(String[] args)
	 {
		 Hilo1 Hil1 = new Hilo1("jose");
		 Hil1.start();
		 Hilo2 Hil2 = new Hilo2("juan");
		 Hil2.start();
		 Hilo3 Hil3 = new Hilo3("andres");
		 Hil3.start();
		 Hilo4 Hil4 = new Hilo4("andres");
		 Hil4.start();
	 }
}