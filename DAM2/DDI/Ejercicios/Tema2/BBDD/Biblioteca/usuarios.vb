Public Class usuarios
    Private carnet, edad As Integer
    Private dni, nombre, apellidos, profesion, correo As String
    Private libros As prestamos() = {Nothing, Nothing, Nothing}

    Public Sub New(dni As String, nombre As String, apellidos As String, profesion As String, edad As Integer, correo As String)
        Me.dni = dni
        Me.nombre = nombre
        Me.apellidos = apellidos
        Me.profesion = profesion
        Me.edad = edad
        Me.correo = correo
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

    Public Sub setCorreo(correo As String)
        Me.correo = correo
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

    Function getCorreo() As String
        Return Me.correo
    End Function

    Public Sub setLibro(libro As prestamos)
        Dim add As Boolean = False
        For i As Integer = 0 To libros.Length - 1
            If (libros.GetValue(i) Is Nothing And add = False) Then
                libros.SetValue(libro, i)
                add = True
            End If
        Next i
    End Sub

    Function delLibro(libro As String) As Boolean
        Dim del As Boolean = False
        For i As Integer = 0 To libros.Length - 1
            If (libros.GetValue(i) IsNot Nothing) Then
                Dim nombre = libros.GetValue(i).getTitulo() + " de " + libros.GetValue(i).getAutor()

                If (nombre.Equals(libro) And del = False) Then
                    libros.SetValue(Nothing, i)
                    del = True
                End If
            End If
        Next i

        If (del = False) Then
            MsgBox("El libro " + libro + " no está prestado a este usuario")
            Return False
        Else
            MsgBox("Libro devuelto")
            Return True
        End If
    End Function

    Function getLibros() As Array
        Return Me.libros
    End Function
End Class
