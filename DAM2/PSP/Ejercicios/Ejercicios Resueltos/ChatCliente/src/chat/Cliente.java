package chat;

import java.io.*;
import java.net.*;
import java.util.Scanner;

class Cliente
{
	static final String host = "localhost";
	static final int puerto = 2000;
	String cad;
	Scanner sc = new Scanner(System.in);
	
	public Cliente( )
	{
		try
		{
			@SuppressWarnings("resource")
			Socket sCliente = new Socket(host , puerto);
			
			while(true)
			{
				DataInputStream flujo_entrada = new DataInputStream(sCliente.getInputStream());
				DataOutputStream flujo_salida= new DataOutputStream(sCliente.getOutputStream());
				
				//KeyEvent evt = null;
				
				//if (evt.getKeyCode() == KeyEvent.VK_ENTER ) 
		        //{
					cad = sc.nextLine();
					flujo_salida.writeUTF(cad);
		        //}
				
				System.out.println(flujo_entrada.readUTF());
			}
		}
		catch ( Exception e )
		{
			System.out.println( e.getMessage() );
		}
	}
	
	public static void main ( String[] arg )
	{
		new Cliente();
	}
}