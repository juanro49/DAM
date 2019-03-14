Public Class nodoUsu
    Private usuario As Usuario
    Private siguiente As nodoUsu

    Public Sub New()
        Me.usuario = Nothing
        Me.siguiente = Nothing
    End Sub

    Public Sub New(usuario As Usuario, siguiente As nodoUsu)
        Me.usuario = usuario
        Me.siguiente = siguiente
    End Sub

    Public Sub New(dni As String, nombre As String, apellido As String, telefono As Integer, correo As String, siguiente As nodoUsu)
        Me.usuario = New Usuario(dni, nombre, apellido, telefono, correo)
        Me.siguiente = siguiente
    End Sub

    Public Sub setSig(n As nodoUsu)
        Me.siguiente = n
    End Sub

    Function getSig() As nodoUsu
        Return Me.siguiente
    End Function

    Function getUsuario() As Usuario
        Return Me.usuario
    End Function
End Class
