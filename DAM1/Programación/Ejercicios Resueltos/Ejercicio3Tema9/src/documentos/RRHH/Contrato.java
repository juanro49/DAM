
package documentos.RRHH;

public class Contrato
{
    private String nombre;
    private int duracionMeses;

    public Contrato(String nombre, int duracionMeses)
    {
        this.nombre = nombre;
        this.duracionMeses = duracionMeses;
    }

    public void imprimirInfo()
    {
        System.out.println("Contrato\n" + "nombre= " + nombre + " , duracionMeses= " + duracionMeses);
    }    
}
