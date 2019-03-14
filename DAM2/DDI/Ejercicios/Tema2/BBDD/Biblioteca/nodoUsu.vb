Public Class nodoUsu
    Private usuario As usuarios
    Private siguiente As nodoUsu

    Public Sub New()
        Me.usuario = Nothing
        Me.siguiente = Nothing
    End Sub

    Public Sub New(usuario As usuarios, siguiente As nodoUsu)
        Me.usuario = usuario
        Me.siguiente = siguiente
    End Sub

    Public Sub New(dni As String, nombre As String, apellidos As String, profesion As String, edad As Integer, correo As String, siguiente As nodoUsu)
        Me.usuario = New usuarios(dni, nombre, apellidos, profesion, edad, correo)
        Me.siguiente = siguiente
    End Sub

    Public Sub setSig(n As nodoUsu)
        Me.siguiente = n
    End Sub

    Function getSig() As nodoUsu
        Return Me.siguiente
    End Function

    Function getUsuario() As usuarios
        Return Me.usuario
    End Function
End Class
