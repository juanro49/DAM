abstract public class Figura
{
     private int[] Posicion = new int[2];

    Figura() {
        Posicion[0] = 0;
        Posicion[1] = 0;
    }
    
    Figura(int[] Posicion) {
         setPosicion(Posicion);
    }
   
    public void setPosicion(int[] Posicion)
    {
        this.Posicion = Posicion;
    }
    
   public int[] getPosicion()
    {
        return Posicion;
    }
    
    abstract public double Perimetro();
}