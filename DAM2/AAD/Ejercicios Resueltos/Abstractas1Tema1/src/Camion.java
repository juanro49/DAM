public class Camion extends Vehiculo {

    private byte NumeroDeEjes;
    
    Camion(){
        super();
    };
    
    Camion(byte NumeroDeRuedas) {
        super(NumeroDeRuedas);
    }

    Camion(String color, byte NumeroDeRuedas) {
        super(color,NumeroDeRuedas);
    }

    Camion(String color, byte NumeroDeRuedas,
        short Cilindrada) {
        super(color,NumeroDeRuedas,Cilindrada);
    }

    Camion(String color, byte NumeroDeRuedas,short Cilindrada, short Potencia) {
        super(color,NumeroDeRuedas,Cilindrada,Potencia);
    }

    Camion(String color, byte NumeroDeRuedas, byte NumeroDeEjes, short Cilindrada, short Potencia) {
        super(color,NumeroDeRuedas,Cilindrada,Potencia);
        setNumeroDeEjes(NumeroDeEjes);
    }

    public byte getNumeroDeEjes()
    {
        return NumeroDeEjes;
    }

    public void setNumeroDeEjes(byte NumeroDeEjes)
    {
        this.NumeroDeEjes = NumeroDeEjes;
    }
       public float Impuesto(){
        return ((super.getCilindrada()/30 + super.getPotencia()*20 +
        super.getNumRuedas()*20 + getNumeroDeEjes()*50)*0.01f);
   }

    @Override
    public String toString() {
        return "\nCamion:" + "\n\tColor: " + getColorVehiculo() + "\n\tNúmero de ruedas: " + getNumRuedas() + "\n\tNúmero de ejes: " + getNumeroDeEjes() + "\n\tCilindrada: " + getCilindrada() + "\n\tPotencia: " + getPotencia() + "\n\tImpuesto a pagar: " + Impuesto();
    }
       

}