
package ejercicio5tema9;

public class Cuenta
{
    private float saldo;

    public Cuenta()
    {
        this.saldo = 0;
    }

    public Cuenta(float saldo)
    {
        this.saldo = saldo;
    }
    
    public void ingresar(float c)
    {
        this.saldo = this.saldo + c;
    }
    
    public void extraer(float c)
    {
        this.saldo = this.saldo - c;
    }

    public float getSaldo()
    {
        return saldo;
    }
}
