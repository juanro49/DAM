Public Class libros
    Private titulo, autor As String
    Private isbn, cantidad As Integer

    Public Sub New(titulo As String, autor As String, isbn As Integer, cantidad As Integer)
        Me.titulo = titulo
        Me.autor = autor
        Me.isbn = isbn
        Me.cantidad = cantidad
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

    Public Sub setIsbn(isbn As String)
        Me.isbn = isbn
    End Sub

    Function getIsbn() As Integer
        Return Me.isbn
    End Function

    Function getCantidad() As Integer
        Return Me.cantidad
    End Function
End Class
