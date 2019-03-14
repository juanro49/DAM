public class Motocicleta extends Vehiculo {

    private byte NumeroDePlazas;

    Motocicleta() {
        super();
    }

    Motocicleta(byte NumeroDePlazas) {
        super((byte)2);
        setNumeroDePlazas(NumeroDePlazas);
    }

    Motocicleta(String color) {
        super(color,(byte)2);
    }

    Motocicleta(String color, short Cilindrada) {
        super(color,(byte)2,Cilindrada);
    }

    Motocicleta(String color, short Cilindrada, short Potencia) {
        super(color,(byte)2,Cilindrada,Potencia);
    }
    Motocicleta(String color, byte NumRuedas, short Cilindrada, short Potencia, byte NumeroDePlazas)
    {
        super(color,NumRuedas,Cilindrada,Potencia);
        setNumeroDePlazas(NumeroDePlazas);
    }
            
            
            
    public byte getNumeroDePlazas()
    {
        return NumeroDePlazas;
    }

    public void setNumeroDePlazas(byte NumeroDePlazas)
    {
        this.NumeroDePlazas = NumeroDePlazas;
    }
    public float Impuesto(){
        return ((super.getCilindrada()/30 + super.getPotencia()*30)*0.01f);
    }
    
    @Override
    public String toString() {
        return "\nMotocicleta:" + "\n\tColor: " + getColorVehiculo() + "\n\tNúmero de ruedas: " + getNumRuedas() + "\n\tNúmero de plazas: " + getNumeroDePlazas() + "\n\tCilindrada: " + getCilindrada() + "\n\tPotencia: " + getPotencia() + "\n\tImpuesto a pagar: " + Impuesto();
    }

}