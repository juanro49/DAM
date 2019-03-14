Public Class Usuario
    Private dni, nombre, apellido, correo As String
    Private telefono As Integer
    Private coche As Alquiler = Nothing

    Public Sub New(dni As String, nombre As String, apellido As String, telefono As Integer, correo As String)
        Me.dni = dni
        Me.nombre = nombre
        Me.apellido = apellido
        Me.telefono = telefono
        Me.correo = correo
    End Sub

    Public Sub setDni(dni As String)
        Me.dni = dni
    End Sub

    Function getDni() As String
        Return Me.dni
    End Function

    Public Sub setNombre(nom As String)
        Me.nombre = nom
    End Sub

    Function getNombre() As String
        Return Me.nombre
    End Function

    Public Sub setApellido(ape As String)
        Me.apellido = ape
    End Sub

    Function getApellido() As String
        Return Me.apellido
    End Function

    Public Sub setTelefono(tfno As String)
        Me.telefono = tfno
    End Sub

    Function getTelefono() As Integer
        Return Me.telefono
    End Function

    Public Sub setCorreo(correo As String)
        Me.correo = correo
    End Sub

    Function getCorreo() As String
        Return Me.correo
    End Function

    Public Sub setCoche(coche As Alquiler)
        Me.coche = coche
    End Sub

    Function getCoche() As Alquiler
        Return Me.coche
    End Function

    Function delCoche(matri As String) As Boolean
        If (coche.getMatricula.Equals(Me.coche.getMatricula)) Then
            coche = Nothing
            Return True
        End If

        Return False
    End Function
End Class
