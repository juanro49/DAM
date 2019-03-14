
package ejercicio3listas3;

import java.util.Scanner;

public class futbolista
{
    String nombre;
    int posicion;  // 1:portero, 2:defensa, 3:centrocampista, 4:delantero
    int dorsal;
    String equipo; 
    int edad;
    int goles;
    int minutos;
    
    Scanner sc = new Scanner (System.in);
    
    futbolista(String nombre, int posicion, int dorsal, String equipo, int edad, int goles, int minutos)
    {
        this.nombre = nombre;
        this.posicion = posicion;
        this.dorsal = dorsal;
        this.equipo = equipo;
        this.edad = edad;
        this.goles = goles;
        this.minutos = minutos;
    }

    futbolista()
    {   
    }
    
    //retorna una cadena con toda la información de un futbolista
    public String getfutbolista()
    {
        return nombre + " posicion: " + posicion +
                " dorsal: " + dorsal + " juega en: " + equipo + 
                " tiene " + edad + " años marcó " + goles + 
                " goles y jugó " + minutos + " minutos.";
    }
    
    //retorna el valor de dorsal, goles y minutos respectivamente
    public int getDorsal()
    {
        return dorsal;
    }
    
    public int getGoles()
    {
        return goles;
    }
    
    public int getMinutos()
    {
        return minutos;
    }
    
    //asigna un valor a dorsal, goles y minutos respectivamente
    public void setDorsal(int D)
    {
        D = sc.nextInt();
        this.dorsal = D;
    }
    
    public void setGoles(int G)
    {
        G = sc.nextInt();
        this.goles = G;
    }
    
    public void setMinutos(int M)
    {
        M = sc.nextInt();
        this.minutos = M;
    }
}
