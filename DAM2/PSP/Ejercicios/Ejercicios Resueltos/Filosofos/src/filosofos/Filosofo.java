package filosofos;

import java.util.concurrent.Semaphore;

public class Filosofo extends Thread
{
    //índice del filósofo actual
    private int miIndice;
    
    //referencia a los palillos que necesita cada filósofo para comer
    private int[][] palillosFilosofo;
    
    //referencia al vector externo de semáforos individuales de cada palillo
    private Semaphore[] semaforoPalillo;

    /****************************************************************************
     * constructor de tres parámetros, cada uno de los cuales se guardará en una
     * variable local para usarla cuando sea neceario
     *
     * @param miIndice: índice que identifica al filósofo (un entero del 0 al 4)
     * @param semaforoPalillo: vector de semáforos (uno para cada palillo).
     * @param palillosFilosofo: matriz que para cada valor de su primer
     * índice, la fila, almacena los palillos que necesita el filósofo de ese
     * índice para comer. Por ejemplo: el filósofo de índice 0 necesita los
     * palillos de índices {0,4}, el de índice 1 los de índices {1,0}, etc...
     * Puedes prescindir de este vector si se te ocurre como calcular en tiempo
     * real los índices de los palillos que necesita cada filósofo para comer
     */
    public Filosofo(int miIndice, Semaphore[] semaforoPalillo, int[][] palillosFilosofo)
    {

        this.miIndice = miIndice;
        this.semaforoPalillo = semaforoPalillo;
        this.palillosFilosofo = palillosFilosofo;
    }

    /**************************************************************************
     * bucle de  llamada al método pensar(), llamada al método comer()
     */
    @Override
    public void run()
    {
        for (int i = 0; i < 2; i++)
        {
             pensar();
             comer();
        }
    }
  

    /****************************************************************************
     * método pensar(): mostrará un mensaje en la Salida de que el
     * 'Filósofo ' N ' está pensado'.
     * Para simular esta actividad, dormirá el hilo un tiempo aleatorio
     *
     */
    public void pensar()
    {

        System.out.println("Filósofo " +  miIndice + " Pensando");

        //duerme el hilo durante un tiempo aleatorio para simular que piensa
        try
        {
            sleep(1+(int) (500*Math.random()));
        }
        catch (InterruptedException ex)
        {
        }
    }

    /****************************************************************************
     * método comer(): mostrará un mensaje en la Salida de que el
     * 'Filósofo ' N ' está hambriento', mientras trata de conseguir los
     * dos palillos que necesita para comer. Una vez conseguidos,
     * mostrará un mensaje de que el 'Filósofo ' N ' está comiendo'.
     * Para simular esta actividad, dormirá el hilo un tiempo aleatorio. Cuando
     * termine, mostrará un mensaje de que el 'Filósofo ' N ' ha
     * terminado de comer', indicando los palillos que se quedan libres.
     */
    public void comer()
    {

        System.out.println("Filósofo " +miIndice + " Hambriento");

        //asigna a misPalillos el vector o fila con los números de los palillos
        //que puede usar
        int[] misPalillos = palillosFilosofo[miIndice];
        
        try
        {
            //intenta conseguir los palillos
            semaforoPalillo[misPalillos[0]].acquire();
            semaforoPalillo[misPalillos[1]].acquire();
        }
        catch (InterruptedException ex)
        {
            //
        }

        System.out.println("Filósofo " + miIndice+ " Comiendo");

        try
        {
          //duerme el hilo un tiempo aleatorio para simular que está comiendo
           //durante segundos
           sleep(1+(int) (300*Math.random()));
        }
        catch (InterruptedException ex)
        {
        }

        //termina de comer
        System.out.println("Filósofo " +  miIndice + " Termina de comer. "
                + "Palillos Libres:" + (misPalillos[0] ) + ","
                + (misPalillos[1] ));

        //deja los palillos en la mesa. Libera el recurso compartido
        semaforoPalillo[misPalillos[0]].release();
        semaforoPalillo[misPalillos[1]].release();
    }
}
