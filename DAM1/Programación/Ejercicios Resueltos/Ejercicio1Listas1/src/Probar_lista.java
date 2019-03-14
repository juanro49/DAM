
import java.util.Scanner;
import  listas.*;

public class Probar_lista
{

    public static void main(String[] args)
    {
        Coleccion milista = new Coleccion();
        int codigo = 0;
        String nombre = null;
        String tipo = null;
        double precio = 0;
        int existencias = 0; 
        Scanner sc = new Scanner(System.in);
        String cad;
        
        System.out.println("Introduce productos, un dato por línea. código 0 para FIN: ");
	
        do
        {
            Producto aux = new Producto(codigo, nombre, tipo, precio, existencias);
            System.out.println("Código");
            codigo = sc.nextInt();
            
            if(codigo != 0)
            {
                aux.modificar_codigo(codigo);
                
                System.out.println("Nombre");
                nombre = sc.next();
                aux.modificar_nombre(nombre);
            
                System.out.println("Tipo");
                tipo = sc.next();
                aux.modificar_tipo(tipo);
            
                System.out.println("Precio");
                precio = sc.nextDouble();
                aux.modificar_precio(precio);
            
                System.out.println("Existencias");
                existencias = sc.nextInt();
                aux.modificar_existencias(existencias);
                
                milista.adicionar(aux);
                System.out.println();
            }
        }while(codigo != 0);
        
        milista.mostrar_todo();
        milista.aumentoPrecio();
        milista.mostrar_todo();
    }
    
}//de la clase

