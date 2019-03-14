public class jugador
{
    public int dorsal;
    public String nombre;
    public int posicion;

    jugador( int dorsal, String nombre, int posicion)
    {
        this.dorsal=dorsal;
        this.nombre=nombre;
        this.posicion=posicion;
    }

    public String getJugador()
    {
        return nombre+" posición: "+posicion+" número de dorsal: "+dorsal;
    }

    public int getDorsal()
    {
        return dorsal;
    }

    public int getPosicion()
    {
        return posicion;
    }
}
