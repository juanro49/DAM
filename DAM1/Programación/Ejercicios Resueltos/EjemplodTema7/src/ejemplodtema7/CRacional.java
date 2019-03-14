
package ejemplodtema7;

public class CRacional
{
    private int Numerador;
    private int Denominador;
  
    public void AsignarDatos(int num, int den)
    {
        Numerador = num;
        if (den == 0) den = 1; // el denominador no puede ser cero
        Denominador = den;
    }
  
    public void VisualizarRacional()
    {
        System.out.println(Numerador + "/" + Denominador);
    }
  
    public static CRacional Sumar(CRacional a, CRacional b)
    {
        CRacional r = new CRacional();
        int num = a.Numerador * b.Denominador + a.Denominador * b.Numerador;
        int den = a.Denominador * b.Denominador;
        r.AsignarDatos(num, den);
        return r;
    }
}
