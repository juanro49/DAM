
import java.io.Serializable;

public class Cliente implements Serializable
{
    private String DNI;
    private String nombre;
    private String direccion;
    private float saldo;
    private String estado_cuenta;
    
    public Cliente(String DNI, String nombre, String direccion, float saldo, String estado_cuenta)
    {
        this.DNI = DNI;
        this.nombre = nombre;
        this.direccion = direccion;
        this.saldo = saldo;
        this.estado_cuenta = estado_cuenta;
    }

    public String getDNI()
    {
        return DNI;
    }
    
    public void setDNI(String DNI)
    {
        this.DNI = DNI;
    }
    
    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getDireccion()
    {
        return direccion;
    }

    public void setDireccion(String direccion)
    {
        this.direccion = direccion;
    }

    public float getSaldo()
    {
        return saldo;
    }

    public void setSaldo(float saldo)
    {
        this.saldo = saldo;
    }

    public String getEstado_cuenta()
    {
        return estado_cuenta;
    }

    public void setEstado_cuenta(String estado_cuenta)
    {
        this.estado_cuenta = estado_cuenta;
    }
}