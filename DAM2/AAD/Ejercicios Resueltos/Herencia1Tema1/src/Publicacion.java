public class Publicacion
{
    
    public int NumeroDePaginas;
    public float Precio;
 
    Publicacion() {
        NumeroDePaginas = 0;
        Precio = 0f;
    }

    Publicacion(int NumeroDePaginas,float Precio) {

        setNumeroDePaginas(NumeroDePaginas);
        setPrecio(Precio);
    }

    public int getNumeroDePaginas()
    {
        return NumeroDePaginas;
    }

    public float getPrecio()
    {
        return Precio;
    }

    public void setNumeroDePaginas(int NumeroDePaginas)
    {
        this.NumeroDePaginas = NumeroDePaginas;
    }

    public void setPrecio(float Precio)
    {
        this.Precio = Precio;
    }
}