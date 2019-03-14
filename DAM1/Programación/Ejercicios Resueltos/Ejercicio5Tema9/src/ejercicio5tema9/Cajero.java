
package ejercicio5tema9;

import java.util.Scanner;

public class Cajero
{

    public static void main(String[] args)
    {
        int a;
        Cuenta cuenta = null;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("1.- Crear cuenta vacía");
        System.out.println("2.- Crear cuenta con saldo inicial");
        System.out.println("3.- Ingresar dinero");
        System.out.println("4.- Sacar dinero");
        System.out.println("5.- Ver saldo");
        System.out.println("6.- Salir");
        System.out.println();
        
        
        do
        {
            System.out.println("Introduce una opción");
            a = sc.nextInt();
            
            switch(a)
            {
                case 1:
                {
                    Cuenta cuenta1 = new Cuenta();
                    cuenta = cuenta1;
                    System.out.println("Cuenta vacía creada");
                }
                break;
                case 2:
                {
                    float b;
                    System.out.println("Indica el saldo inicial");
                    b = sc.nextFloat();
                
                    Cuenta cuenta2 = new Cuenta(b);
                    cuenta = cuenta2;
                    System.out.println("Cuentra creada con " + b + "€");
                }
                break;
                case 3:
                {
                    float b;
                    
                    if(cuenta == null)
                    {
                        System.out.println("Debes crear una cuenta primero");
                    }
                    else
                    {
                        System.out.println("Indica la cantidad a ingresar");
                        b = sc.nextFloat();
                
                        cuenta.ingresar(b);
                        System.out.println("Has ingresado " + b + "€");
                    }
                }
                break;
                case 4:
                {
                    float b;
                    
                    if(cuenta == null)
                    {
                        System.out.println("Debes crear una cuenta primero");
                    }
                    else
                    {
                        System.out.println("Indica la cantidad a retirar");
                        b = sc.nextFloat();
                
                        cuenta.extraer(b);
                        System.out.println("Has retirado " + b + "€");
                    }
                }
                break;
                case 5:
                {
                    if(cuenta == null)
                    {
                        System.out.println("Debes crear una cuenta primero");
                    }
                    else
                    {
                        System.out.println("La cuenta tiene " + cuenta.getSaldo() + "€");
                    }
                }
                break;
                default:
                    break;
            }
        }while(a < 6);
    }
}
