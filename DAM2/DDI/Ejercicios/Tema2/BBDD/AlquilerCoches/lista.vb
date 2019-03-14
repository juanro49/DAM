Public Class lista
    Private primerCoche As nodoCoche
    Private primerUsu As nodoUsu

    Public Sub New()
        Me.primerCoche = Nothing
        Me.primerUsu = Nothing
    End Sub

    Public Sub insertarCoche(matricula As String, marca As String, modelo As String, estado As String, precioDia As Integer)
        Dim n As New nodoCoche(matricula, marca, modelo, estado, precioDia, Nothing)
        ' si la lista está vacia
        If (Me.primerCoche Is Nothing) Then
            Me.primerCoche = n
        Else 'sino
            Dim aux As nodoCoche = Me.primerCoche
            Dim ant As nodoCoche = Nothing

            While (aux.getCoche().getMatricula() < n.getCoche().getMatricula()) And aux.getSig() IsNot Nothing
                ant = aux
                aux = aux.getSig()
            End While

            If (ant Is Nothing And aux.getCoche().getMatricula() > n.getCoche().getMatricula()) Then
                n.setSig(aux)
                Me.primerCoche = n
            ElseIf (aux.getCoche().getMatricula() > n.getCoche().getMatricula()) Then
                n.setSig(aux)
                ant.setSig(n)
            ElseIf (aux.getSig() Is Nothing) Then
                aux.setSig(n)
            End If
        End If
    End Sub

    Public Sub insertarUsuario(dni As String, nombre As String, apellido As String, telefono As Integer, correo As String)
        Dim n As New nodoUsu(dni, nombre, apellido, telefono, correo, Nothing)
        ' si la lista está vacia
        If (Me.primerUsu Is Nothing) Then
            Me.primerUsu = n
        Else 'sino
            Dim aux As nodoUsu = Me.primerUsu
            Dim ant As nodoUsu = Nothing

            While (aux.getUsuario().getDni() <= n.getUsuario().getDni()) And aux.getSig() IsNot Nothing
                ant = aux
                aux = aux.getSig()
            End While

            If (ant Is Nothing And aux.getUsuario().getDni() >= n.getUsuario().getDni()) Then
                n.setSig(aux)
                Me.primerUsu = n
            ElseIf (aux.getUsuario().getDni() > n.getUsuario().getDni()) Then
                n.setSig(aux)
                ant.setSig(n)
            ElseIf (aux.getSig() Is Nothing) Then
                aux.setSig(n)
            End If
        End If
    End Sub

    Function eliminarCoche(matri As String) As Boolean
        Dim aux As nodoCoche = Me.primerCoche
        Dim ant As nodoCoche = Nothing

        While (aux IsNot Nothing)

            If (matri.Equals(aux.getCoche.getMatricula()) And aux.getCoche.getEstado.Equals("libre")) Then
                ant.setSig(aux.getSig())
                aux.setSig(Nothing)

                Return True
            End If

            ant = aux
            aux = aux.getSig()
        End While

        Return False
    End Function

    Function eliminarUsuario(dni As String) As Boolean
        Dim aux As nodoUsu = Me.primerUsu
        Dim ant As nodoUsu = Nothing

        While (aux IsNot Nothing)

            If (dni.Equals(aux.getUsuario.getDni()) And aux.getUsuario.getCoche() Is Nothing) Then
                ant.setSig(aux.getSig())
                aux.setSig(Nothing)

                Return True
            End If

            ant = aux
            aux = aux.getSig()
        End While

        Return False
    End Function

    Function sizeCoches() As Integer
        Dim aux As nodoCoche = Me.primerCoche
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

    Function getPrimerCoche()
        Return Me.primerCoche
    End Function

    Function getPrimerUsuario()
        Return Me.primerUsu
    End Function
End Class

