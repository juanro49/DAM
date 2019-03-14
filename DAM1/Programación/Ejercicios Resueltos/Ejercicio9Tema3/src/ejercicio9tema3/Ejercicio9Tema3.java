
package ejercicio9tema3;

public class Ejercicio9Tema3
{
    public static void main(String[] args)
    {
        int cantidad = 100000;
        double interesanual = 3.5;
        double interesmensual = interesanual/12/100;
        int duracion = 15;
        int numeropagos = duracion * 12;
        
        double cuota = (cantidad * interesmensual) / (1 - (1 / Math.pow (1 + interesmensual, numeropagos)));
        
        System.out.println ("La cuota es: " + cuota);
    }
}

