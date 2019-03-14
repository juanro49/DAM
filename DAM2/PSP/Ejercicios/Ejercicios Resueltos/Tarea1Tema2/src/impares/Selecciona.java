package impares;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Selecciona
{
	private static boolean isNumeric(String dato){
        try
        {
            Integer.parseInt(dato);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }
	
	public static void main(String[] args)
	{
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader (isr);
        
        String lineaTeclado = null;
        LinkedList <Integer> lista = new LinkedList<Integer>();
        
        try{
            System.out.println("Seleccionando números...");
            while ((lineaTeclado = bf.readLine()) != null)
            {
                if (isNumeric(lineaTeclado))
                {
                	int v = Integer.parseInt(lineaTeclado);
                	
                	if(v % 2 != 0)
                	{
                		lista.add(v);
                	}
                }
            }
            
            System.out.println("Los impares son: ");
            
            for(Object elemento: lista)
            {
            	System.out.println(elemento.toString());
            }
                
            System.out.println("Número de elementos leídos: " + lista.size());
        }
        catch(IOException ex)
        {
            System.err.println("Se ha producido un error de E/S. Su descripción es: ");
            System.err.println(ex.toString());
        }
        catch(Exception ex)
        {
            System.err.println("Se ha producido un error. Su descripción es: ");
            System.err.println(ex.toString());
        }
	}
}
