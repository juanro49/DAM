
package documentos.gestionEconomica;

public class Factura
{
    private String comprador;
    private double importe;

    public Factura(String comprador, double importe)
    {
        this.comprador = comprador;
        this.importe = importe;
    }

    public void imprimirInfo()
    {
        System.out.println("Factura\n" + "comprador= " + comprador + " , importe= " + importe);
    }
}
