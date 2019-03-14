abstract public class  Vehiculo {
    private String ColorVehiculo;
    private byte NumRuedas;
    private short Cilindrada;
    private short Potencia;

    Vehiculo(){};
    
    Vehiculo(String color) {
        setColorVehiculo(color);
    }

    Vehiculo (byte NumRuedas) {
        this.NumRuedas = NumRuedas;
    }

    Vehiculo (short Cilindrada) {
        this.Cilindrada = Cilindrada;
    }

    Vehiculo(String color, byte NumRuedas) {
        this(color);
        this.NumRuedas = NumRuedas;
    }

    Vehiculo(String color, byte NumRuedas, short Cilindrada) {
        this(color,NumRuedas);
        this.Cilindrada = Cilindrada;
    }

    Vehiculo(String color, byte NumRuedas, short Cilindrada,
        short Potencia) {
        this(color,NumRuedas,Cilindrada);
        this.Potencia = Potencia;
    }

    public String getColorVehiculo()
    {
        return ColorVehiculo;
    }

    public byte getNumRuedas()
    {
        return NumRuedas;
    }

    public short getCilindrada()
    {
        return Cilindrada;
    }

    public short getPotencia()
    {
        return Potencia;
    }

    public void setColorVehiculo(String ColorVehiculo)
    {
        this.ColorVehiculo = ColorVehiculo;
    }

    public void setNumRuedas(byte NumRuedas)
    {
        this.NumRuedas = NumRuedas;
    }

    public void setCilindrada(short Cilindrada)
    {
        this.Cilindrada = Cilindrada;
    }

    public void setPotencia(short Potencia)
    {
        this.Potencia = Potencia;
    }

    abstract public float Impuesto();

}