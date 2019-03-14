
package ejemplodtema7;

public class CAplicacion
{  
    public static void main (String[] args)
    {
        // Punto de entrada a la aplicación
        CRacional r1, r2;
        r1 = new CRacional();         // crear un objeto CRacional
        r1.AsignarDatos(2, 5);
        r2 = r1;
    
        r1.AsignarDatos(3, 7);
        r1.VisualizarRacional();      // se visualiza 3/7
        r2.VisualizarRacional();      // se visualiza 3/7

        CRacional r3;
        r2 = new CRacional();         // crear un objeto CRacional
        r2.AsignarDatos(2, 5);
        r3 = CRacional.Sumar(r1, r2); // r3 = 3/7 + 2/5
        r3.VisualizarRacional();      // se visualiza 29/35
    }
}