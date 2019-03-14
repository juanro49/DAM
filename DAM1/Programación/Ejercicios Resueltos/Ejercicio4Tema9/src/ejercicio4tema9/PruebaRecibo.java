
package ejercicio4tema9;

import documentos.gestionEconomica.*;

public class PruebaRecibo
{

    public static void main(String[] args)
    {
        Recibo nuevorecibo= new Recibo("Impartición curso Java", 3, 2, 2003);
        nuevorecibo.imprimirInfo();
    }
}
