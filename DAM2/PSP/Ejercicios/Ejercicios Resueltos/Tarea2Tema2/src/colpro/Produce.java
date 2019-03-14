package colpro;
import java.io.File;
import java.io.PrintStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Produce
{
	 public static void main(String[] args)
	 {
		 // TODO Auto-generated method stub
		 for (int a=0; a<=10; a++)
		 {
			 System.out.println(" "+a+" ");
			 try
			 {//Rediregimos salida y error estándar a un fichero
				 PrintStream ps = new PrintStream(
				 new BufferedOutputStream(new FileOutputStream(
				 new File("prueba.txt"),true)), true);
				 System.setOut(ps);
				 System.setErr(ps);
			 }
			 catch(Exception e)
			 {
				 System.err.println("No he podido redirigir salidas.");
			 }
		 }
	 }
}