package filosofos;

import java.util.concurrent.Semaphore;


public class Principal 
{ 
	 public static void main(String[] args)
	 {
		 //número de filósofos sentados a la mesa redonda. Cada filósofo (o cada
		 //palillo) se identifica por un índice del 0 al 5
	 		//Modifico para que seal 6 filósofos, no cinco
		 int filosofos = 6;
		 
		 //matriz de 5 filas y 2 columnas. Cada fila representa un filósofo y guarda
		 //el número de los palillos que necesita el filósofo de esa fila para comer:
		 // el filósofo de índice 0 necesita los palillos de índices 0 y 4,
		 // el de índice 1 los de índices 1 y 0, etc...
		 int[][] palillosFilosofo = {{0, 4}, {1, 0}, {2, 1}, {3, 2}, {4, 3},{5, 4}};
		 
		 //vector de semáforos (uno para cada palillo)
		 Semaphore[] semaforoPalillo = new Semaphore[filosofos];
		 
		 //inicializa el vector de semáforos. Cada semáforo se crea con 1 permiso
		 //pues se trata de proteger un recurso compartido (el palillo)
		 for (int i = 0; i < filosofos; i++)
		 {
			 semaforoPalillo[i] = new Semaphore(1);
		 }
		 
		 //el siguiente bucle crea e inicia cada filósofo, al que le pasa como
		 //parámetros: su índice, una referencia al vector de semáforos, y una
		 //referencia a la matriz de palillos
		 for (int i = 0; i < filosofos; i++)
		 {
	            (new Filosofo(i, semaforoPalillo, palillosFilosofo)).start();
		 }
	 }
}