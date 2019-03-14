package listas;

public class Producto
{
    private int codigo;
    private String nombre;
    private String tipo;
    private double precio;
    private int existencias; 

    public Producto( int cod, String nom, String tp, double pvp, int stock)
    {
        codigo=cod;
        nombre=nom;
        tipo=tp;
        precio=pvp;
        existencias=stock; 
    }

    public void mostrarProducto()
    {
        System.out.println("Código:\t\t" + ver_codigo());
        System.out.println("Nombre:\t\t" + ver_nombre());
        System.out.println("Tipo:\t\t" + ver_tipo());
        System.out.println("Precio:\t\t" + ver_precio());
        System.out.println("Existencias:\t" + ver_existencias());
    }
    
     //-------------------------------------------
    public int ver_codigo()
    {
        return codigo;
    }

    public String ver_nombre()
    {
        return nombre;
    }
	
    public String ver_tipo()
    {
        return tipo;
    }
	
    public double ver_precio()
    {
        return precio;
    }
	
    public int ver_existencias()
    {
        return existencias;
    }
	//---------------------------------------
    public void modificar_codigo(int cod)
    {
        codigo=cod;
    }
	 
    public void modificar_nombre(String nom)
    {
        nombre=nom;
    }
	
    public void modificar_tipo(String tp)
    {
        tipo=tp;
    }

    public void modificar_precio(double pvp)
    {
        precio=pvp;
    }
	
    public void modificar_existencias(int stock)
    {
        existencias=stock;
    }
}//de la clase
