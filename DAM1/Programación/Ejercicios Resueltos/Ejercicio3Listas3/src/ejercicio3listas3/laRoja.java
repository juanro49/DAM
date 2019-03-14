
package ejercicio3listas3;

import java.util.ArrayList;

public class laRoja
{
    public static void main(String[] args)
    {
        ArrayList <futbolista> LaSeleccion = new ArrayList(); 
        
        futbolista futbol = new futbolista("Iker Casillas", 1, 1, "Real Madrid", 31, 1, 570);
        LaSeleccion.add(futbol);
        
        futbol = new futbolista("José Manuel Reina", 1, 23, "Liverpool", 29, 0, 0);
        LaSeleccion.add(futbol);
        
        futbol = new futbolista("Sergio Ramos", 2, 15, "Real Madrid", 26, 0, 570);
        LaSeleccion.add(futbol);
        
        futbol = new futbolista("Jordi Alba", 2, 18, "Valencia", 23, 1, 570);
        LaSeleccion.add(futbol);
        
        futbol = new futbolista("Fernando Torres", 4, 9, "Chelsea", 28, 3, 179);
        LaSeleccion.add(futbol);
        
        //Mostrar lista
        System.out.println("Listado de jugadores:");
        
        for (int i = 0; i < LaSeleccion.size(); i++)
        {
            futbol = LaSeleccion.get(i);
            System.out.println("\t" + futbol.getfutbolista());
        }
        
        //Pichichi
        System.out.println("\nMáximo goleador:");
        
        futbolista pichichi = new futbolista();
        boolean b = true;
        int i = 0;
        
        while(b && i < LaSeleccion.size())
        {
            if(LaSeleccion.get(i).posicion != 1)
            {
                pichichi = LaSeleccion.get(i);
                b = false;
            }
            i++;
        }
        
        if(pichichi.nombre != null)
        {
             for (int j = 0; j < LaSeleccion.size(); j++)
            {
                futbol = LaSeleccion.get(j);
            
                if(futbol.posicion != 1 && futbol.getGoles() > pichichi.getGoles())
                {
                    pichichi = futbol;
                }
            }
             
             System.out.println("\t" + pichichi.getfutbolista());
        }
        else
        {
            System.out.println("\tEn esta lista solo hay porteros");
        }

        
        //Zamora
        System.out.println("\nPortero menos goleado:");
        
        futbolista zamora = new futbolista();
        b = true;
        i = 0;
        double promedio = 0, aux;
        
        while(b && i < LaSeleccion.size())
        {
            if(LaSeleccion.get(i).posicion == 1 && futbol.minutos > 0)
            {
                zamora = LaSeleccion.get(i);
                promedio = (double) zamora.goles / (double) zamora.minutos;
                b = false;
            }
            i++;
        }
        
        if(zamora.nombre != null)
        {
            for (int j = 0; j < LaSeleccion.size(); j++)
            {
                futbol = LaSeleccion.get(j);
                 
                if(futbol.posicion == 1 && futbol.minutos > 0)
                {
                    aux = promedio;
                    promedio = (double) futbol.goles / (double) futbol.minutos;

                    if(promedio < aux)
                    {
                        zamora = futbol;
                    }
                }
            }
            System.out.println("\t" + zamora.getfutbolista());
        }
        else
        {
            System.out.println("\tEn esta lista no hay porteros");
        }
    }
}
