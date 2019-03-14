
package ejemplobtema7;

public class EjemplobTema7
{
    private double tipoDeInterés;
    private double saldo;
  
    public void EstablecerTipoDeInterés(double ti)
    {
        if ( ti < 0)
        {
            System.out.println("El tipo de interés no puede ser negativo");
            return; // retornar
        }
        tipoDeInterés = ti;
    }

    public void IngresarDinero(double ingreso)
    {
        saldo += ingreso;
    }

    public void RetirarDinero(double cantidad)
    {
        if ( saldo - cantidad < 0)
        {
        System.out.println("No tiene saldo suficiente");
        return;
        }
        // Hay saldo suficiente. Retirar la cantidad.
        saldo -= cantidad;
    }

    public double SaldoActual()
    {
        return saldo;
    }

    public void AbonarIntereses()
    {
        saldo += saldo * tipoDeInterés / 100;
    }

    public static void main (String[] args)
    {
        // Abrir una cuenta con 1.000.000 a un 2%
        EjemplobTema7 Cuenta01 = new EjemplobTema7();
        Cuenta01.IngresarDinero(1000000);
        Cuenta01.EstablecerTipoDeInterés(2);
    
        // Operaciones
        System.out.println(Cuenta01.SaldoActual());
        Cuenta01.IngresarDinero(500000);
        Cuenta01.RetirarDinero(200000);
        System.out.println(Cuenta01.SaldoActual());
        Cuenta01.AbonarIntereses();
        System.out.println(Cuenta01.SaldoActual());
    }
}
