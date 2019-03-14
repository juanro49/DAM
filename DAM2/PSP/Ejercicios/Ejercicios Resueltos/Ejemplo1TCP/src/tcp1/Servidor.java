package tcp1;

import java.net.* ;

class Servidor
{
	static final int Puerto=2000;
	
	public Servidor( )
	{
		try
		{
			// Inicio la escucha del servidor en un determinado puerto
			ServerSocket skServidor = new ServerSocket (Puerto);
			System.out.println("Escucho el puerto " + Puerto );
			
			// Espero a que se conecte un cliente y creo un nuevo socket para el cliente
			Socket sCliente = skServidor.accept();
			
			// ATENDER PETICIÓN DEL CLIENTE
			// Cierro el socket
			sCliente.close();
			
			System.out.println("Conexión exitosa");
			skServidor.close();
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