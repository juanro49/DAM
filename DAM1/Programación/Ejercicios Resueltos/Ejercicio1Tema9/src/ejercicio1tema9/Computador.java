
package ejercicio1tema9;

public class Computador
{
    //Datos memoria
    private int tamañoMemoria;
    private String tipoMemoria;
    private int velocidadMemoria;
    
    //Datos disco duro
    private int tamañoDiscoDuro;
    private int numeroRevolucionesDisco;
    
    //Datos procesador
    private String modeloProcesador;
    private float velocidadProcesador;

    public int getTamañoMemoria()
    {
        return tamañoMemoria;
    }

    public void setTamañoMemoria(int tamañoMemoria)
    {
        this.tamañoMemoria = tamañoMemoria;
    }

    public String getTipoMemoria()
    {
        return tipoMemoria;
    }

    public void setTipoMemoria(String tipoMemoria)
    {
        this.tipoMemoria = tipoMemoria;
    }

    public int getVelocidadMemoria()
    {
        return velocidadMemoria;
    }

    public void setVelocidadMemoria(int velocidadMemoria)
    {
        this.velocidadMemoria = velocidadMemoria;
    }

    public int getTamañoDiscoDuro()
    {
        return tamañoDiscoDuro;
    }

    public void setTamañoDiscoDuro(int tamañoDiscoDuro)
    {
        this.tamañoDiscoDuro = tamañoDiscoDuro;
    }

    public int getNumeroRevolucionesDisco()
    {
        return numeroRevolucionesDisco;
    }

    public void setNumeroRevolucionesDisco(int numeroRevolucionesDisco)
    {
        this.numeroRevolucionesDisco = numeroRevolucionesDisco;
    }

    public String getModeloProcesador()
    {
        return modeloProcesador;
    }

    public void setModeloProcesador(String modeloProcesador)
    {
        this.modeloProcesador = modeloProcesador;
    }

    public float getVelocidadProcesador()
    {
        return velocidadProcesador;
    }

    public void setVelocidadProcesador(float velocidadProcesador)
    {
        this.velocidadProcesador = velocidadProcesador;
    }

    
    public void Mostrar()
    {
        System.out.println("");
        System.out.println("Tamaño memoria:\t\t" + getTamañoMemoria());
        System.out.println("Tipo memoria:\t\t" + getTipoMemoria());
        System.out.println("Velocidad memoria:\t\t" + getVelocidadMemoria());
        System.out.println("Tamaño disco duro:\t\t" + getTamañoDiscoDuro());
        System.out.println("Revoluciones disco duro:\t" + getNumeroRevolucionesDisco());
        System.out.println("Modelo procesador:\t\t" + getModeloProcesador());
        System.out.println("Velocidad procesador:\t\t" + getVelocidadProcesador());
    }
}
