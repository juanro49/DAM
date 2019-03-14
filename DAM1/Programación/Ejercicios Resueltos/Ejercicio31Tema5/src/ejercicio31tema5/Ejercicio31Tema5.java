
package ejercicio31tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio31Tema5
{

    public static void main(String[] args) throws IOException
    {
        int codigo,  count = 0, facturacion = 0, litro1 = 0;
        float litros, precio;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        for (int factura = 1; factura <= 5; factura++)
        {
            System.out.println ("Introduce el código del artículo");
            codigo = Integer.valueOf(bf.readLine());
            
            System.out.println ("Introduce su cantidad en litros");
            litros = Float.valueOf(bf.readLine());
            
            System.out.println ("Introduce el precio");
            precio = Float.valueOf(bf.readLine());
            
            if (codigo == 1)
            {
                litro1 += litros;
            }
            
            if (precio * litros > 600)
            {
                
            }
            
            facturacion += precio * litros;
        }
        
        System.out.println ("Facturacion total: " + facturacion);
        System.out.println ("El articulo 1 tiene " + litro1 + " litros");
        System.out.println("Se hicieron " + count + " facturas de mas de 600€");
    }
}
