Public Class prestamos
    Private titulo, autor As String
    Private isbn As Integer
    Private fecha As DateTime

    Public Sub New(titulo As String, autor As String, isbn As Integer, fecha As DateTime)
        Me.titulo = titulo
        Me.autor = autor
        Me.isbn = isbn
        Me.fecha = fecha
    End Sub

    Public Sub setTitulo(titulo As String)
        Me.titulo = titulo
    End Sub

    Function getTitulo() As String
        Return Me.titulo
    End Function

    Public Sub setAutor(autor As String)
        Me.autor = autor
    End Sub

    Function getAutor() As String
        Return Me.autor
    End Function

    Public Sub setIsbn(isbn As Integer)
        Me.isbn = isbn
    End Sub

    Function getIsbn() As Integer
        Return Me.isbn
    End Function

    Public Sub setFecha(fecha As DateTime)
        Me.fecha = fecha
    End Sub

    Function getFecha() As DateTime
        Return Me.fecha.ToString("dd/MM/yyyy")
    End Function
End Class
