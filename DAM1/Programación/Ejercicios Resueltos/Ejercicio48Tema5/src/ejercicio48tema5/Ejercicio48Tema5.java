
package ejercicio48tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio48Tema5
{

    public static void main(String[] args) throws IOException
    {
        int segundos, dias, horas, minutos, aux;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        do
        {
            System.out.println("Escribe los segundos");
            segundos = Integer.parseInt(bf.readLine());
        }while (segundos < 0);
        
        aux = segundos;
        
        dias = segundos / (24 * 3600);
        segundos = segundos % (24 * 3600);
        
        horas = segundos / 3600;
        segundos = segundos % 3600;
        
        minutos = segundos / 60;
        segundos = segundos % 60;
        
        System.out.println(aux + " segundos son " + dias + " días " + horas + " horas " + minutos + " minutos " + segundos + " segundos");
    }
}
