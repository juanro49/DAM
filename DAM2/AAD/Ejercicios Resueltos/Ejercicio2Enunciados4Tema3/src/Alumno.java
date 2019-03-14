import java.io.*;

public class Alumno implements Serializable
{
    private int num_expediente;
    private String nombre;
    private int notas[] = new int[3];

    public Alumno()
    {}
    
    public Alumno(int num_expediente, String nombre, int notas[])
    {
        this.num_expediente = num_expediente;
        this.nombre = nombre;
        this.notas = notas;
        
    }

    public int getNum_expediente()
    {
        return num_expediente;
    }

    public void setNum_expediente(int num_expediente)
    {
        this.num_expediente = num_expediente;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int[] getNotas()
    {
        return notas;
    }

    public void setNotas(int notas[])
    {
        this.notas = notas;
    }
}

