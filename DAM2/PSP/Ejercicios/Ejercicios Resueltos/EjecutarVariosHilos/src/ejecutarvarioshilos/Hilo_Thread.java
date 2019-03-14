package ejecutarvarioshilos;

public class Hilo_Thread extends Thread
{
	//clase que extiende a Thread con 2 constructores
    String nombre = "Hilo_derviaThread";
    
    public Hilo_Thread(String nb)
    {
        //constructor 1
        nombre = nb;
    }
    
    public Hilo_Thread()
    {
        //constructor 2
    }
    
    @Override
    public void run()
    {
        //redefinimos run() con el código asociado al hilo
        for (int i = 1; i <= 2000; i++)
        {
            System.out.println(nombre);
        }
    }
}