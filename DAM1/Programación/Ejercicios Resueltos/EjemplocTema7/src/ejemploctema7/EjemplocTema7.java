
package ejemploctema7;

/**
 * Conversión de grados centígrados a fahrenheit:
 * F = 9/5 * C + 32
 */



public class EjemplocTema7
{
    // Definición de constantes
    final static int limInferior = -30;
    final static int limSuperior = 100;
    final static int incremento = 6;

    public static void main(String[] args)
    {
        // Declaración de variables
        CGrados grados = new CGrados();
        int gradosCent = limInferior;
        float gradosFahr;

        while (gradosCent <= limSuperior) // while ... hacer:
        {
            // Asignar al objeto grados el valor en grados centígrados
            grados.CentígradosAsignar(gradosCent);
            // Obtener del objeto grados los grados fahrenheit
            gradosFahr = grados.FahrenheitObtener();
            // Escribir la siguiente línea de la tabla
            System.out.println(gradosCent + " C" + "\t" + gradosFahr + " F");
            // Siguiente valor
            gradosCent += incremento;
        }
    }
}

/**
 * Clase CGrados. Un objeto de esta clase almacena un valor
 * en grados centígrados.
 * Atributos: gradosC
 * Métodos: CentígradosAsignar, FahrenheitObtener y 
 * CentígradosObtener
 */
class CGrados
{
    //Este miembro por ser privado sólo puede ser accedido 
    //por los métodos de su clase.
  
    private float gradosC; // grados centígrados

    public void CentígradosAsignar(float gC)
    {
        // Establecer el atributo grados centígrados
        gradosC = gC;
    }
  
    public float FahrenheitObtener()
    {
        // Retornar los grados fahrenheit equivalentes a gradosC
        return 9F/5F * gradosC + 32;
    }
  
    public float CentígradosObtener()
    {
        return gradosC; // retornar los grados centígrados
    }
}

