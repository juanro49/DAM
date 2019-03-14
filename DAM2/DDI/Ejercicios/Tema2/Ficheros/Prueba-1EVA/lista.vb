Public Class lista
    Private primero As nodo

    Public Sub New()
        Me.primero = Nothing
    End Sub

    Public Sub insertar(nom As String, ape1 As String, ape2 As String, curso As String, nota As Integer)
        Dim n As New nodo(nom, ape1, ape2, curso, nota, Nothing)
        ' si la lista está vacia
        If (Me.primero Is Nothing) Then
            Me.primero = n
        Else 'sino
            Dim aux As nodo = Me.primero
            Dim ant As nodo = Nothing

            While (aux.getAlumno().getCurso() <= n.getAlumno().getCurso()) And aux.getSig() IsNot Nothing
                ant = aux
                aux = aux.getSig()
            End While

            If (ant Is Nothing And aux.getAlumno().getCurso() > n.getAlumno().getCurso()) Then
                n.setSig(aux)
                Me.primero = n
            ElseIf (aux.getAlumno().getCurso() > n.getAlumno().getCurso()) Then
                n.setSig(aux)
                ant.setSig(n)
            ElseIf (aux.getSig() Is Nothing) Then
                aux.setSig(n)
            End If
        End If

    End Sub

    Function size() As Integer
        Dim aux As nodo = Me.primero
        Dim tam As Integer = 0

        While (aux IsNot Nothing)
            tam = tam + 1
            aux = aux.getSig()
        End While

        Return tam
    End Function

    Function getPrimero()
        Return Me.primero
    End Function

    Public Sub setPrimero(nodo As nodo)
        Me.primero = nodo
    End Sub
End Class

