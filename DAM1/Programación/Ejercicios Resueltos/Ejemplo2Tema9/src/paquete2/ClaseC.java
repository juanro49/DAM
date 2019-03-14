package paquete2; 

import paquete1.ClaseA;
import paquete1.ClaseB;

public class ClaseC
{
    void metodo3()
    {
        /*error, las clases están en paquetes
        diferentes*/
        ClaseA ca = new ClaseA();
    }

    void metodo4()
    {
        ClaseB cb = new ClaseB(); 
        /*error, motodo2() no es visible 
        desde ClaseC */ 
        cb.metodo2();
    }
}
