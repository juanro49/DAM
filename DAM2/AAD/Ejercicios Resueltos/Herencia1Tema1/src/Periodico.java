class Periodico extends Publicacion
{
    private String Nombre;
    private String Fecha;

    Periodico() {
 	super();
        Nombre = null;
 	Fecha = null;
    }

    Periodico(String Nombre, String Fecha, int NumeroDePaginas, float Precio) {
        super(NumeroDePaginas, Precio);
        setNombre(Nombre);
        setFecha(Fecha);
    
    }

    public String getNombre()
    {
        return Nombre;
    }

    public String getFecha()
    {
        return Fecha;
    }

    public void setNombre(String Nombre)
    {
        this.Nombre = Nombre;
    }

    public void setFecha(String Fecha)
    {
        this.Fecha = Fecha;
    }

    @Override
    public String toString() {
        return "Periodico\n" + "\tNombre: " + Nombre + "\n\tFecha: " + Fecha + "\n\tNpag: " + NumeroDePaginas + "\n\tPrecio: " + Precio + "\n\n";
    }
    
    
}