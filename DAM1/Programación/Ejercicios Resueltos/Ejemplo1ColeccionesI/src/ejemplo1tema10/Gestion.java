
package ejemplo1tema10;

import java.io.*;
import java.util.*;

public class Gestion 
{
    public static void main(String[] args) throws IOException
    {
        //En este ArrayList se almacenan las temperaturas
        ArrayList temperaturas = new ArrayList(); 
        String opcion;
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));

        do
        {

            System.out.println("\nElegir opción :");
            System.out.println("l. Añadir temperatura");
            System.out.println("2. Mostrar temperatura media"); 
            System.out.println("3. Mostrar temperaturas extremas");
            System.out.println("4. Mostrar la lista de temperaturas");
            System.out.println("5. Salir");
            System.out.println();

            opcion = bf.readLine();

            switch(Integer.parseInt(opcion))
            { 
                case 1:
                {
                    double temp;
                    
                    System.out.println ("Introduce la temperatura: ");
                    //Convierte a tipo double la temperatura leída
                    temp = Double.parseDouble(bf.readLine());
                    almacenaTemperatura (temp, temperaturas);
                    break;
                }
        
                case 2:
                {
                    muestraMedia(temperaturas);
                    break; 
                }
		
	case 3:
                {
                    muestraExtremas(temperaturas);
                    break;
                }
        
                case 4:
                {
                    muestraLista(temperaturas);
                    break;
                }
            }
        } while(!opcion.equals("5"));
    } //del main


    static void almacenaTemperatura (double d, ArrayList temperaturas)
    {
        //Necesita convertir el número a objeto para
        //poderlo añadir al ArrayList
        temperaturas.add(d);
    }

    static void muestraMedia (ArrayList temperaturas)
    {
        double media = 0;
        
        for (int i = 0; i < temperaturas.size(); i++)
        {
            //Las temperaturas se convierten 
            //explícitamente al tipo de objeto original 
            //para después extraer el valor numérico
            media += (Double) temperaturas.get(i);
        }
        
        media /= temperaturas.size();
        System.out.println ("La temperatura media es: " + media);
    }

    static void muestraExtremas (ArrayList temperaturas) 
    {
        //Se inicializan las variables extremo con 
        //el valor de la primera temperatura 
        double maxima;
        
        maxima = (double) temperaturas.get(0);
        double minima = maxima;

        for (int i = 0; i < temperaturas.size(); i++)
        { 
            double aux;
            aux = (double) temperaturas.get(i);
            
            if (aux > maxima)
            {
                maxima = aux;
            }

            if (aux < minima)
            {
                minima = aux;
            }
        } //del for

        System.out.println("La temperatura máxima es " + maxima);
        System.out.println("La temperatura mínima es " + minima);
    }

    static void muestraLista(ArrayList temperaturas)
    {
        System.out.print("Las temperaturas son: ");

        for (int i = 0; i < temperaturas.size(); i++)
        {
                System.out.print(temperaturas.get(i) + ", ");
        }

        System.out.println();
    }
}
