package ejecutarvarioshilos;

public class Hilo_Runnable implements Runnable
{
    //clase que implementa Runnable
    public void run()
    {
        //redefinimos run() con el código asociado al hilo
        for (int i = 1; i <= 2000; i++)
        {
            System.out.println("  Hilo_Runnable");
        }
    }
}