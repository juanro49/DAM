
package paquete1;

public class ClaseB
{ 
    public void metodo2 ()
    {
        /*correcto, ambas clases están en
        el mismo paquete*/
        ClaseA ca = new ClaseA();
        ca.metodo1();
    }
}