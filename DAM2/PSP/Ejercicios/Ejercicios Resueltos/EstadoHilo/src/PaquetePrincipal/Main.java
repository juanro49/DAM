package PaquetePrincipal;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        HiloAuxiliar hilo1 = new HiloAuxiliar();
        //Crea un nuevo hilo. El hilo está en estado Nuevo (new)
        System.out.println("Hilo Auxiliar Nuevo: Estado=" + hilo1.getState() );
        //Obtenemos el estado del thread hilo1 
        hilo1.start();
        //Inicia el thread hilo1 y pasa al estado Ejecutable
        System.out.println("Hilo Auxiliar Iniciado: Estado="
                + hilo1.getState());
        
        System.out.println("Esperamos a que termine el hilo");
        
        System.out.println("\n Hilo Auxiliar Muerto: Estado="
                + hilo1.getState());
    }
}