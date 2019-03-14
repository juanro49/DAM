
package documentos.gestionEconomica;

public class Recibo
{
    public int dia;
    public int mes;
    public int año;
    public String concepto;

    public Recibo(String concepto, int dia, int mes, int año)
    {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.concepto = concepto;
    }

    public void imprimirInfo()
    {
        System.out.println("Recibo\n" + "dia=" + dia + ", mes=" + mes + ", año=" + año + ", concepto=" + concepto);
    }
}
