package modelo;

public class Totales
{
    private Long cuenta; //numero empleados
    private Byte numero; //numero departamento
    private Double media;//media salario
    private String nombre;//nombre dep

    public Totales (Byte numero, Long cuenta, Double media, String nombre)
    {
            this.cuenta = cuenta;
            this.media = media;	
            this.nombre = nombre;
            this.numero = numero;	
    }

    public Totales()
    {}

    public Long getCuenta()
    {
        return this.cuenta;
    }
    
    public void setCuenta( Long cuenta)
    {
        this.cuenta = cuenta;
    }
    
    public Byte getNumero()
    {
        return this.numero;
    }
    
    public void setNumero(Byte numero)
    {
        this.numero = numero;
    }
    
    public Double getMedia()
    {
        return this.media;
    }
    
    public void setMedia(final Double media)
    {
        this.media = media;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public void setNombre(final String nombre)
    {
        this.nombre = nombre;
    }
}