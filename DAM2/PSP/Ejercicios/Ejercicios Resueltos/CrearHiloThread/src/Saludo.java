/*Crea un hilo derivando de la clase Thread*/
public class Saludo extends Thread
{
	//clase que extiende a Thread
	@Override
	public void run() 
	{
		// se redefine el método run() con el código asociado al hilo
		System.out.println("¡Saludo desde un hilo extendiendo thread!");
	}
	
	public static void main(String args[]) 
	{
		Saludo hilo1=new Saludo();
		//se crea un objeto Thread, el hilo hilo1
		hilo1.start();
		//invoca a start() y pone en marcha el hilo hilo1
	}
}