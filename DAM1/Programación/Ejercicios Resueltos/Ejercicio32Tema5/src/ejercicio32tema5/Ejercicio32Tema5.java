
package ejercicio32tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio32Tema5
{

    public static void main(String[] args) throws IOException
    {
        int codigo,  count = 0, litro1 = 0;
        double litros, precio, precio1 = 0.6, precio2 = 3, precio3 = 1.25, facturacion = 0;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        for (int factura = 1; factura <= 5; factura++)
        {
            System.out.println ("Introduce el código del artículo");
            codigo = Integer.valueOf(bf.readLine());
            
            System.out.println ("Introduce su cantidad en litros");
            litros = Float.valueOf(bf.readLine());
            
            if (codigo == 1)
            {
                litro1 += litros;
                precio = precio1 * litros;
                facturacion += precio;
                
                if (precio > 600)
                {
                count++;
                }
            }
            
            if (codigo == 2)
            {
                precio = precio2 * litros;
                facturacion += precio;
                
                if (precio > 600)
                {
                count++;
                }
            }
            
            if (codigo == 3)
            {
                precio = precio3 * litros;
                facturacion += precio;
                
                if (precio > 600)
                {
                count++;
                }
            }
        }
        
        System.out.println ("Facturacion total: " + facturacion);
        System.out.println ("El articulo 1 tiene " + litro1 + " litros");
        System.out.println("Se hicieron " + count + " facturas de mas de 600€");
    }
}
