Public Class usuarios
    Private carnet, edad As Integer
    Private dni, nombre, apellidos, profesion As String
    Private libros As Array = {" ", " ", " "}

    Public Sub New(carnet As Integer, dni As String, nombre As String, apellidos As String, profesion As String, edad As Integer)
        Me.carnet = carnet
        Me.dni = dni
        Me.nombre = nombre
        Me.apellidos = apellidos
        Me.profesion = profesion
        Me.edad = edad
    End Sub

    Public Sub New()

    End Sub

    Public Sub setCarnet(car As String)
        Me.carnet = car
    End Sub

    Public Sub setDni(dni As String)
        Me.dni = dni
    End Sub

    Public Sub setNombre(nom As String)
        Me.nombre = nom
    End Sub

    Public Sub setApellidos(ape As String)
        Me.apellidos = ape
    End Sub

    Public Sub setProfesion(prof As String)
        Me.profesion = prof
    End Sub

    Public Sub setEdad(edad As String)
        Me.edad = edad
    End Sub

    Function getCarnet() As Integer
        Return Me.carnet
    End Function

    Function getDni() As String
        Return Me.dni
    End Function

    Function getNombre() As String
        Return Me.nombre
    End Function

    Function getApellidos() As String
        Return Me.apellidos
    End Function

    Function getProfesion() As String
        Return Me.profesion
    End Function

    Function getEdad() As Integer
        Return Me.edad
    End Function

    Public Sub setLibro(libro As String)
        Dim add As Boolean = False
        For i As Integer = 0 To libros.Length - 1
            If (libros.GetValue(i).ToString().Equals(" ") And add = False) Then
                libros.SetValue(libro, i)
                add = True
            End If
        Next i
    End Sub

    Function getLibros() As Array
        Return libros
    End Function
End Class
