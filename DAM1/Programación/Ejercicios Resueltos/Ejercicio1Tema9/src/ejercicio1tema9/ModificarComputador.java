
package ejercicio1tema9;

import java.util.Scanner;

public class ModificarComputador
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        
        Computador comp = new Computador();
        int tamañoMemoria;
        String tipoMemoria;
        int velocidadMemoria;
        int tamañoDiscoDuro;
        int revolucionesDisco;
        String modeloProcesador;
        float velocidadProcesador;
        
        System.out.print("Tamaño Memoria: ");
        tamañoMemoria = sc.nextInt();
        comp.setTamañoMemoria(tamañoMemoria);
        
        System.out.print("Tipo Memoria: ");
        tipoMemoria = sc.next();
        comp.setTipoMemoria(tipoMemoria);
        
        System.out.print("Velocidad Memoria: ");
        velocidadMemoria = sc.nextInt();
        comp.setVelocidadMemoria(velocidadMemoria);
        
        System.out.print("Tamaño disco duro: ");
        tamañoDiscoDuro = sc.nextInt();
        comp.setTamañoDiscoDuro(tamañoDiscoDuro);
        
        System.out.print("Revoluciones disco duro: ");
        revolucionesDisco = sc.nextInt();
        comp.setNumeroRevolucionesDisco(revolucionesDisco);
        
        System.out.print("Modelo procesador: ");
        modeloProcesador = sc.next();
        comp.setModeloProcesador(modeloProcesador);
        
        System.out.print("Velocidad procesador: ");
        velocidadProcesador = sc.nextFloat();
        comp.setVelocidadProcesador(velocidadProcesador);
        
        comp.Mostrar();
    }
}
