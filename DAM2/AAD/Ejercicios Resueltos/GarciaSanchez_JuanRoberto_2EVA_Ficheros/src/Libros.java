
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juanro49
 */
public class Libros implements Serializable
{
    int codigo, fecha_edicion;
    String titulo, autor, editorial, isbn;
    
    public Libros(int codigo, String titulo, String autor, String editorial, int fecha_edicion, String isbn)
    {
        setCodigo(codigo);
        setTitulo(titulo);
        setAutor(autor);
        setEditorial(editorial);
        setFecha_edicion(fecha_edicion);
        setIsbn(isbn);
    }

    public int getCodigo()
    {
        return codigo;
    }

    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }

    public int getFecha_edicion()
    {
        return fecha_edicion;
    }

    public void setFecha_edicion(int fecha_edicion)
    {
        this.fecha_edicion = fecha_edicion;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public String getAutor()
    {
        return autor;
    }

    public void setAutor(String autor)
    {
        this.autor = autor;
    }

    public String getEditorial()
    {
        return editorial;
    }

    public void setEditorial(String editorial)
    {
        this.editorial = editorial;
    }

    public String getIsbn()
    {
        return isbn;
    }

    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }
    
    
}
