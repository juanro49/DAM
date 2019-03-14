public class Circulo extends Figura {
    private double Radio;
    Circulo(double Radio, int[] Posicion) {
        super(Posicion);
        setRadio(Radio);
    }
    public void setRadio(double Radio)
    {
        this.Radio = Radio;
    }

    public double getRadio()
    {
        return Radio;
    }
    public double Perimetro() {
        return 2.0d*Math.PI*Radio;
    }

    @Override
    public String toString() {
        return "X: " + getPosicion()[0] + "\nY: " + getPosicion()[1] + "\nRadio: " + getRadio() + "\nPerímetro: " + Perimetro() + "\n----------\n";
    }
 }