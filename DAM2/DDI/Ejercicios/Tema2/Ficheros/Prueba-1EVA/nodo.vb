Public Class nodo
    Private alumno As alumnos
    Private siguiente As nodo

    Public Sub New()
        Me.alumno = Nothing
        Me.siguiente = Nothing
    End Sub

    Public Sub New(alumno As alumnos, siguiente As nodo)
        Me.alumno = alumno
        Me.siguiente = siguiente
    End Sub

    Public Sub New(nom As String, ape1 As String, ape2 As String, curso As String, nota As Integer, siguiente As nodo)
        Me.alumno = New alumnos(nom, ape1, ape2, curso, nota)
        Me.siguiente = siguiente
    End Sub

    Public Sub setSig(n As nodo)
        Me.siguiente = n
    End Sub

    Function getSig() As nodo
        Return Me.siguiente
    End Function

    Function getAlumno() As alumnos
        Return Me.alumno
    End Function
End Class