Imports AlquilerCoches

Public Class Empleado
    Private tipo, correo, usuario, contrasena As String

    Public Sub New(usuario As String, contrasena As String, tipo As String, correo As String)
        Me.tipo = tipo
        Me.correo = correo
        Me.usuario = usuario
        Me.contrasena = contrasena
    End Sub

    Public Sub New()

    End Sub

    Public Sub setUsuario(usu As String)
        Me.usuario = usu
    End Sub

    Function getUsuario() As String
        Return Me.usuario
    End Function

    Public Sub setContrasena(con As String)
        Me.contrasena = con
    End Sub

    Function getContrasena() As String
        Return Me.contrasena
    End Function

    Public Sub setTipo(tipo As String)
        Me.tipo = tipo
    End Sub

    Function getTipo() As String
        Return Me.tipo
    End Function

    Public Sub setCorreo(correo As String)
        Me.correo = correo
    End Sub

    Function getCorreo() As String
        Return Me.correo
    End Function
End Class
