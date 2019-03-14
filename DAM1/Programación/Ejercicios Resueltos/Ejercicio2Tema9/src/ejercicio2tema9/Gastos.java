
package ejercicio2tema9;

import java.util.Scanner;

public class Gastos
{
    private float gastosAlimentacion;
    private float gastosTransportes;
    private float gastosVivienda;
    private boolean gastosEnEuros;
    private float tipoCambio;

    public void setGastosAlimentacion(float gastosAlimentacion)
    {
        this.gastosAlimentacion = gastosAlimentacion;
    }

    public void setGastosTransportes(float gastosTransportes)
    {
        this.gastosTransportes = gastosTransportes;
    }

    public void setGastosVivienda(float gastosVivienda)
    {
        this.gastosVivienda = gastosVivienda;
    }

    public void setGastosEnEuros(boolean gastosEnEuros)
    {
        this.gastosEnEuros = gastosEnEuros;
    }

    public boolean estaEnEuros()
    {
        return gastosEnEuros;
    }

    public void setTipoCambio(float tipoCambio)
    {
        this.tipoCambio = tipoCambio;
    }

    public float getTipoCambio()
    {
        return tipoCambio;
    }

    public float dameTotalEuros()
    {
        if(gastosEnEuros)
        {
            return gastosAlimentacion + gastosTransportes + gastosVivienda;
        }
        else
        {
            return (gastosAlimentacion + gastosTransportes + gastosVivienda) / tipoCambio;
        }
    }
    
    public float dameTotalDolares()
    {
        if(gastosEnEuros)
        {
            return (gastosAlimentacion + gastosTransportes + gastosVivienda) * tipoCambio;
        }
        else
        {
            return gastosAlimentacion + gastosTransportes + gastosVivienda;
        }
    }
    
    public static void main(String[] args)
    {
        Gastos gastos = new Gastos();
        String moneda;
        float gAli;
        float gTrans;
        float gViv;
        float cambio;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Indica la moneda con la que operar (dólares o euros)");
        moneda = sc.nextLine();
        
        if(moneda.equalsIgnoreCase("euros"))
        {
            gastos.setGastosEnEuros(true);
        }
        else
        {
            gastos.setGastosEnEuros(false);
        }
        
        System.out.println("Introduce los gastos de alimentación");
        gAli = sc.nextFloat();
        gastos.setGastosAlimentacion(gAli);
        
        System.out.println("Introduce los gastos de transporte");
        gTrans = sc.nextFloat();
        gastos.setGastosTransportes(gTrans);
        
        System.out.println("Introduce los gastos de vivienda");
        gViv = sc.nextFloat();
        gastos.setGastosVivienda(gViv);
        
        System.out.println("Introduce el tipo de cambio");
        cambio = sc.nextFloat();
        gastos.setTipoCambio(cambio);
        
        if(gastos.estaEnEuros())
        {
            System.out.println("\nTotal en Euros: " + gastos.dameTotalEuros());
            System.out.println("Total en Dólares: " + gastos.dameTotalDolares());
        }
        else
        {
            System.out.println("\nTotal en Euros: " + gastos.dameTotalEuros());
            System.out.println("Total en Dólares: " + gastos.dameTotalDolares());
        }
        
    }
}
