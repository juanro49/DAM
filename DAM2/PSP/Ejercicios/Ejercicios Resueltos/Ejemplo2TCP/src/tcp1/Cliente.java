package tcp1;

import java.net.*;

class Cliente
{
	static final String Host = "localhost";
	static final int Puerto=2000;
	
	public Cliente( )
	{
		try
		{
			// Me conecto al servidor en un detrminado puerto
			Socket sCliente = new Socket( Host, Puerto );
			
			// TAREAS QUE REALIZA EL CLIENTE
			// Cierro el socket
			sCliente.close();
			System.out.println("Conexión exitosa");
		}
		catch( Exception e )
		{
			System.out.println( e.getMessage () );
		}
	}
	
	public static void main( String[] arg )
	{
		new Cliente();
	}
}