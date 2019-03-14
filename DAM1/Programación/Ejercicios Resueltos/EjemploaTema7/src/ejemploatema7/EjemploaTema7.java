
package ejemploatema7;

public class EjemploaTema7
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
  
    public EjemploaTema7 Sumar(EjemploaTema7 a, EjemploaTema7 b)
    {
        EjemploaTema7 r = new EjemploaTema7();
        int num = a.Numerador * b.Denominador + a.Denominador * b.Numerador;
        int den = a.Denominador * b.Denominador;
        r.AsignarDatos(num, den);
        return r;
    }

    public static void main (String[] args)
    {
        // Punto de entrada a la aplicación
        EjemploaTema7 r1, r2;
        r1 = new EjemploaTema7(); // crear un objeto EjemploaTema7
        r1.AsignarDatos(2, 5);
        r2 = r1;
    
        r1.AsignarDatos(3, 7);
        r1.VisualizarRacional(); // se visualiza 3/7
        r2.VisualizarRacional(); // se visualiza 3/7

        EjemploaTema7 r3 = new EjemploaTema7();
        r2 = new EjemploaTema7(); // crear un objeto EjemploaTema7
        r2.AsignarDatos(2, 5);
        r3 = r3.Sumar(r1, r2); // r3 = 3/7 + 2/5
        r3.VisualizarRacional(); // se visualiza 29/35
  }
}
