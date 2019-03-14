package chat;

import java.io.* ;
import java.net.* ;
import java.util.Scanner;

class Servidor
{
	static final int puerto = 2000;
	String cad;
	Scanner sc = new Scanner(System.in);
	
	public Servidor( )
	{
		try
		{
			@SuppressWarnings("resource")
			ServerSocket skServidor = new ServerSocket(puerto);
			Socket sCliente = skServidor.accept();
			
			while(true)
			{
				DataOutputStream flujo_salida= new DataOutputStream(sCliente.getOutputStream());
				DataInputStream flujo_entrada = new DataInputStream(sCliente.getInputStream());
				
				//KeyEvent evt = null;
				
				//if (evt.getKeyCode() == KeyEvent.VK_ENTER ) 
		        //{
					cad = sc.nextLine();
					flujo_salida.writeUTF(cad);
		        //}
				
				System.out.println(flujo_entrada.readUTF());
			}
		}
		catch( Exception e )
		{
			System.out.println( e.getMessage() );
		}
	}
	
	public static void main( String[] arg )
	{
		new Servidor();
	}
}