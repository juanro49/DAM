Public Class nodoLibro
    Private libro As libros
    Private siguiente As nodoLibro

    Public Sub New()
        Me.libro = Nothing
        Me.siguiente = Nothing
    End Sub

    Public Sub New(libro As libros, siguiente As nodoLibro)
        Me.libro = libro
        Me.siguiente = siguiente
    End Sub

    Public Sub New(titulo As String, autor As String, isbn As Integer, cantidad As Integer, siguiente As nodoLibro)
        Me.libro = New libros(titulo, autor, isbn, cantidad)
        Me.siguiente = siguiente
    End Sub

    Public Sub setSig(n As nodoLibro)
        Me.siguiente = n
    End Sub

    Function getSig() As nodoLibro
        Return Me.siguiente
    End Function

    Function getLibro() As libros
        Return Me.libro
    End Function
End Class