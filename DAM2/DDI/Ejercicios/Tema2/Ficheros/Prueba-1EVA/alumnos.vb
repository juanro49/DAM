Public Class alumnos
    Private nota As Integer
    Private nom, ape1, ape2, curso As String

    Public Sub New(nom As String, ape1 As String, ape2 As String, curso As String, nota As Integer)
        Me.nom = nom
        Me.ape1 = ape1
        Me.ape2 = ape2
        Me.curso = curso
        Me.nota = nota
    End Sub

    Public Sub setNombre(nom As String)
        Me.nom = nom
    End Sub

    Public Sub setApellido1(ape1 As String)
        Me.ape1 = ape1
    End Sub

    Public Sub setApellido2(ape2 As String)
        Me.ape2 = ape2
    End Sub

    Public Sub setCurso(curso As String)
        Me.curso = curso
    End Sub

    Public Sub setEdad(nota As Integer)
        Me.nota = nota
    End Sub

    Function getNombre() As String
        Return Me.nom
    End Function

    Function getApellido1() As String
        Return Me.ape1
    End Function

    Function getApellido2() As String
        Return Me.ape2
    End Function

    Function getApellidos() As String
        Return Me.ape1 + " " + Me.ape2
    End Function

    Function getCurso() As String
        Return Me.curso
    End Function

    Function getNota() As Integer
        Return Me.nota
    End Function
End Class
