Public Class lista
    Private primerLibro As nodoLibro
    Private primerUsu As nodoUsu

    Public Sub New()
        Me.primerLibro = Nothing
        Me.primerUsu = Nothing
    End Sub

    Public Sub insertarLibro(titulo As String, autor As String, isbn As Integer, cantidad As Integer)
        Dim n As New nodoLibro(titulo, autor, isbn, cantidad, Nothing)
        ' si la lista está vacia
        If (Me.primerLibro Is Nothing) Then
            Me.primerLibro = n
        Else 'sino
            Dim aux As nodoLibro = Me.primerLibro
            Dim ant As nodoLibro = Nothing

            While (aux.getLibro().getIsbn() < n.getLibro().getIsbn()) And aux.getSig() IsNot Nothing
                ant = aux
                aux = aux.getSig()
            End While

            If (ant Is Nothing And aux.getLibro().getIsbn() > n.getLibro().getIsbn()) Then
                n.setSig(aux)
                Me.primerLibro = n
            ElseIf (aux.getLibro().getIsbn() > n.getLibro().getIsbn()) Then
                n.setSig(aux)
                ant.setSig(n)
            ElseIf (aux.getSig() Is Nothing) Then
                aux.setSig(n)
            End If
        End If
    End Sub

    Public Sub insertarUsuario(dni As String, nombre As String, apellidos As String, profesion As String, edad As Integer, correo As String)
        Dim n As New nodoUsu(dni, nombre, apellidos, profesion, edad, correo, Nothing)
        ' si la lista está vacia
        If (Me.primerUsu Is Nothing) Then
            Me.primerUsu = n
        Else 'sino
            Dim aux As nodoUsu = Me.primerUsu
            Dim ant As nodoUsu = Nothing

            While (aux.getUsuario().getEdad() <= n.getUsuario().getEdad()) And aux.getSig() IsNot Nothing
                ant = aux
                aux = aux.getSig()
            End While

            If (ant Is Nothing And aux.getUsuario().getEdad() >= n.getUsuario().getEdad()) Then
                n.setSig(aux)
                Me.primerUsu = n
            ElseIf (aux.getUsuario().getEdad() > n.getUsuario().getEdad()) Then
                n.setSig(aux)
                ant.setSig(n)
            ElseIf (aux.getSig() Is Nothing) Then
                aux.setSig(n)
            End If
        End If
    End Sub

    Function sizeLibros() As Integer
        Dim aux As nodoLibro = Me.primerLibro
        Dim tam As Integer = 0

        While (aux IsNot Nothing)
            tam = tam + 1
            aux = aux.getSig()
        End While

        Return tam
    End Function

    Function sizeUsuarios() As Integer
        Dim aux As nodoUsu = Me.primerUsu
        Dim tam As Integer = 0

        While (aux IsNot Nothing)
            tam = tam + 1
            aux = aux.getSig()
        End While

        Return tam
    End Function

    Function obtener(indice As Integer) As libros
        Dim cont As Integer = 0
        Dim aux As nodoLibro = Me.primerLibro

        While (aux IsNot Nothing And cont <> indice)
            cont = cont + 1
            aux = aux.getSig()
        End While

        Return aux.getLibro()
    End Function

    Function getPrimerLibro()
        Return Me.primerLibro
    End Function

    Function getPrimerUsuario()
        Return Me.primerUsu
    End Function
End Class

