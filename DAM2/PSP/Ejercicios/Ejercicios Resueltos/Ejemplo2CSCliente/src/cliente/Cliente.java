package cliente;

import java.io.*;
import java.net.*;

class Cliente extends Thread
{
	static final String HOST = "localhost";
	static final int Puerto = 2000;
	
	public Cliente()
	{
	}
	
	public void run()
	{
		try
		{
			Socket sCliente = new Socket( HOST , Puerto );
			DataInputStream flujo_entrada = new DataInputStream(sCliente.getInputStream());
			
			System.out.println( flujo_entrada.readUTF() );
			sCliente.close();
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public static void main (String[] arg)
	{
		new Cliente().start();
		new Cliente().start();
		new Cliente().start();
	}
}