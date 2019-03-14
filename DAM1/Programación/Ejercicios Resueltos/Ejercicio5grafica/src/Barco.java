public class Barco
{
    String nombre;
    int num_pasajeros;
    int posicion[]=new int[2];

    public Barco(String nombre, int num_pasajeros, int x,int y)
    {
        this.nombre = nombre;
        this.num_pasajeros = num_pasajeros;
        posicion[0]=x;
        posicion[1]=y;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public int getNum_pasajeros()
    {
        return num_pasajeros;
    }
    
    public void setNum_pasajeros(int num_pasajeros)
    {
        this.num_pasajeros = num_pasajeros;
    }
    
    public int[] getPosicion()
    {
        return posicion;
    }
    
    public void setPosicion(int[] posicion)
    {
        this.posicion = posicion;
    }
}