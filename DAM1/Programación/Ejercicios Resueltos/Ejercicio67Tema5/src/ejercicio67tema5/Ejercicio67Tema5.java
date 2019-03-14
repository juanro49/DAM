
package ejercicio67tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio67Tema5
{

    public static void main(String[] args) throws IOException
    {
        int n, num1,num2,num3,num4, aux, mayor = 0, menor = 0;
        
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        
        do
        {
            System.out.println("Escribe un número");
            n = Integer.parseInt(bf.readLine());
        } while (n < 1000 || n > 9999);
        
        num1 = n % 10;
        n /= 10;
        
        num2 = n % 10;
        n /= 10;
        
        num3 = n % 10;
        n /= 10;
        
        num4 = n % 10;
        
        if (num2 > num1)
        {
            aux = num1;
            num1 = num2;
            num2 = aux;
        }
        
        if (num3 > num1)
        {
            aux = num1;
            num1 = num3;
            num3 = aux;
        }
        
        if (num4 > num1)
        {
            aux = num1;
            num1 = num4;
            num4 = aux;
        }
        
        if (num3 > num2)
        {
            aux = num2;
            num2 = num3;
            num3 = aux;
        }
        
        if (num4 > num2)
        {
            aux = num2;
            num2 = num4;
            num4 = aux;
        }
        
        if (num4 > num3)
        {
            aux = num3;
            num3 = num4;
            num4 = aux;
        }
        
        mayor *= 10;
        mayor += num1;
        
        mayor *= 10;
        mayor += num2;
        
        mayor *= 10;
        mayor += num3;
        
        mayor *= 10;
        mayor += num4;
        
        System.out.println("El mayor es " + mayor);
        
        menor *= 10;
        menor += num4;
        
        menor *= 10;
        menor += num3;
        
        menor *= 10;
        menor += num2;
        
        menor *= 10;
        menor += num1;
        
        System.out.println("El menor es " + menor);
    }
}
