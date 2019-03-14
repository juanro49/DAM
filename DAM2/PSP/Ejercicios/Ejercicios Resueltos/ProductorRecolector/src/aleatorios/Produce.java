package aleatorios;
import java.util.Random; //Paquete para la generación de números aleatorios
/** Aplicación que genera 40 números aleatorios entre los valores 0 y 100
 * @author Marga Nieto
 */
public class Produce {
    /** Método main de la aplicación, punto de entrada al programa.
     * @param args Los comandos recibidos por la línea de ejecución
     * no son tenidos en cuenta.
     */
    public static void main(String[] args) {
         // Lo único que hacemos es escribir los 40 números aleatorios en
        // la salida estándar del proceso
        Random v = new Random(); //Instanciamos el objeto para generar aleatorios
        for (int i=0; i<40; i++) //Bucle para generar 40 valores
            /*//Podemos generar números aleatorios utilizando Math.Random()
             *  System.out.println(Math.floor(Math.random()*100));
             */
            System.out.println(v.nextInt(101)); //valores enteros entre 0 y (101-1)
            //Escribimos un número por línea, para que se incluya intro
    }
}