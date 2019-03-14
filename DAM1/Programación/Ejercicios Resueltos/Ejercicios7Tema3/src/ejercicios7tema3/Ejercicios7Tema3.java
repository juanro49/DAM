
package ejercicios7tema3;

public class Ejercicios7Tema3
{
    public static void main(String[] args) 
    {
        //Ejercicio 7A
        int i = 1;
        int suma = 0;
        int producto = 1;
        
        System.out.println (i);
        suma+=i;
        producto+= i;
        i++;
        
        System.out.println (i);
        suma+=i;
        producto+= i;
        i++;
        
        System.out.println (i);
        suma+=i;
        producto+= i;
        i++;
        
        System.out.println (i);
        suma+=i;
        producto+= i;
        i++;
        
        System.out.println (i);
        suma+=i;
        producto+= i;
        i++;
        
        System.out.println ("SUMA=" + suma + "\nPRODUCTO=" + producto + "\n");
        
        
        //Ejercicio 7B
        int a = 5;
        int b = 4;
        boolean SW1 = true;
        boolean SW2 = false;
        
        System.out.println ("Valor SW1=" +  SW1 + 
                "\nValor SW2=" + SW2);
        System.out.println ("NOT SW1=" + !SW1 + 
                "\nNOT SW2=" + !SW2);
        System.out.println ("SW1&&SW2=" + (SW1&&SW2) + 
                "\nSW1||SW2=" + (SW1||SW2));
        System.out.println ("a>=b=" + (a>=b) + 
                "\nb>=a=" + (b>=a) + 
                "\na!=b=" + (a!=b));
    }
}
