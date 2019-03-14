public class Rectangulo extends Figura {
    private double[] Lados = new double[2];  

    Rectangulo(double[] Lados, int[] Posicion) {
        super(Posicion);
        setLados(Lados);
    }

    public void setLados(double[] Lados) {
        this.Lados[0] = Lados[0];   
        this.Lados[1] = Lados[1];
    }
    
    public double[] getLados() {
        return Lados;
    }
    public double Perimetro() {
        return 2d*Lados[0] + 2d*Lados[1];
    } 
    
    @Override
    public String toString() {
        return "X: " + getPosicion()[0] + "\nY: " + getPosicion()[1] + "\nBase: " + getLados()[0] + "\nAltura: " + getLados()[1] + "\nPerímetro: " + Perimetro() + "\n----------\n";
    }
}