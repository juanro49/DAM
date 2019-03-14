
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;


public class competicion
{
    public static short muestraMenu()
    {
        short opcion;
        
        Scanner sc = new Scanner (System.in);

        System.out.println("\n1. Inscribir participante");
        System.out.println("2. Borrar un participante");
        System.out.println("3. Mostrar listado de participantes");
        System.out.println("4. Mostrar listado de participantes ordenados por dorsal");
        System.out.println("5. Finalizar el programa\n");
        System.out.print("Elige una opcion: ");
        
        opcion = (short) sc.nextInt();
        
        return opcion;
    }

    public static jugador dameDatosJugador()
    {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Introduce el nombre del jugador: ");
        String nombre = sc.next();
        
        System.out.print("Introduce el dorsal de " + nombre + ": ");
        int dorsal = sc.nextInt();
        
        System.out.print("Introduce la posición de " + nombre + ": ");
        int posicion = sc.nextInt();
        
        return new jugador(dorsal, nombre, posicion);
    }
	
    private static Integer[] keysOrdenadas(Hashtable <Integer, jugador>  ht)
    {
        Enumeration <Integer> lista = ht.keys();
        int cont = 0;
        Integer ordenado[] = new Integer[ht.size()];
        
        while(lista.hasMoreElements())
        {
            ordenado[cont] = lista.nextElement();
            cont++;
        }
        
        int aux;
        boolean b = false;//desordenado
        
        for(int i = ordenado.length - 2; i >= 0  && b == false; i--)
        {
            b = true;
            
            for(int j = 0; j <=i; j++)
            {
                if(ordenado[j] > ordenado[j + 1])
                {
                    aux = ordenado[j];
                    ordenado[j] = ordenado[j + 1];
                    ordenado[j + 1] = aux;
                     b = false;
                }
            }
        }
        
        return ordenado;
    }

    public static void main(String[] args)
    {
        Hashtable <Integer, jugador> tabla = new Hashtable();
        short opcion;
        Scanner sc = new Scanner (System.in);
        
        do
        {
            opcion = muestraMenu();
        
            switch(opcion)
            {
                case 1:
                {
                    jugador jugador = dameDatosJugador();
                    int clave = jugador.dorsal;
                    
                    if(!tabla.containsKey(clave))
                    {
                        if(tabla.put(clave, jugador) != null)
                        {
                            System.out.println("\nERROR al introducir a " + jugador.getJugador());
                        }
                        else
                        {
                            System.out.println("\n" + jugador.getJugador() + " introducido correctamente");
                        }
                    }
                    else
                    {
                        System.out.println("\nERROR, dorsal repetido, no se ha dado de alta");
                    }
                    break;
                }
                
                case 2:
                {
                    System.out.print("Indica el dorsal del jugador a eliminar: ");
                    int dorsal = sc.nextInt();
                    
                    if(tabla.remove(dorsal) == null)
                    {
                        System.out.println("No existe el jugador con el dorsal " + dorsal);
                    }
                    else
                    {
                        System.out.println("jugador con el dorsal " + dorsal + " eliminado correctamente");
                    }
                    break;
                }
                
                case 3:
                {
                    int clave;
                    jugador valor;
                    Enumeration <Integer> lista = tabla.keys();
                    
                    System.out.println("\nJugadores:");
                    
                    while(lista.hasMoreElements())
                    {
                        clave = lista.nextElement();
                        valor = (jugador) tabla.get(clave);
                        
                        System.out.println(valor.getJugador());
                    }
                    break;
                }
                
                case 4:
                {
                    Integer lista[] = keysOrdenadas(tabla);
                    jugador valor;
                    
                    System.out.println("\nJugadores:");
                    
                    for (int i=0 ; i < lista.length; i++)
                    {
                        valor = (jugador) tabla.get(lista[i]);
                        System.out.println(valor.getJugador());
                    }

                    break;
                }
                
                default:
                    break;
            }
        }while(opcion != 5);
    }
}
