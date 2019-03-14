class Libro extends Publicacion
{
    
    public String Titulo;
    public String TipoPortada;
    public String ISBN;
    public String NombreAutor;
    public String Editorial;
    
    Libro() {
 	super();
        Titulo= null;
        TipoPortada= null;
        ISBN= null;
        NombreAutor= null;
        Editorial= null;
    }

    Libro(String Titulo,String TipoPortada,String ISBN,String NombreAutor,
          String Editorial,int NumeroDePaginas,float Precio) {
        
        super(NumeroDePaginas,Precio);
        setTitulo(Titulo);
        setTipoPortada(TipoPortada);
        setISBN(ISBN);
        setNombreAutor(NombreAutor);
        setEditorial(Editorial);
    }
   
    public String getTitulo()
    {
        return Titulo;
    }

    public String getTipoPortada()
    {
        return TipoPortada;
    }

    public String getISBN()
    {
        return ISBN;
    }

    public String getNombreAutor()
    {
        return NombreAutor;
    }

    public String getEditorial()
    {
        return Editorial;
    }

    public void setTitulo(String Titulo)
    {
        this.Titulo = Titulo;
    }

    public void setTipoPortada(String TipoPortada)
    {
        this.TipoPortada = TipoPortada;
    }

    public void setISBN(String ISBN)
    {
        this.ISBN = ISBN;
    }

    public void setNombreAutor(String NombreAutor)
    {
        this.NombreAutor = NombreAutor;
    }

    public void setEditorial(String Editorial)
    {
        this.Editorial = Editorial;
    }

    @Override
    public String toString()
    {
        return "Libro\n" + "\tTitulo: " + Titulo + "\n\tNombreAutor: " + NombreAutor + "\n\tISBN: " + ISBN + "\n\tEditorial: " + Editorial + "\n\tTipoPortada: " + TipoPortada + "\n\tNpag: " + NumeroDePaginas + "\n\tPrecio: " + Precio + "\n\n";
    }
    
    
}