package tc;

import java.io.* ;
import java.net.* ;

class Servidor
{
	static final int Puerto = 2000;
	
	public Servidor()
	{
		try
		{
			ServerSocket skServidor = new ServerSocket(Puerto);
			System.out.println("Escucho el puerto " + Puerto);
			
			for(int nCli = 0; nCli < 3; nCli++)
			{
				Socket sCliente = skServidor.accept();
				System.out.println("Sirvo al cliente " + nCli);
				
				DataOutputStream flujo_salida = new DataOutputStream(sCliente.getOutputStream());
				flujo_salida.writeUTF("Hola cliente " + nCli);
				
				sCliente.close();
			}
			
			System.out.println("Ya se han atendido los 3 clientes");
			skServidor.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] arg)
	{
		new Servidor();
	}
}