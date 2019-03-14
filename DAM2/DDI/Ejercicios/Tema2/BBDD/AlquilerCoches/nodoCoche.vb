Public Class nodoCoche
    Private coche As Coche
    Private siguiente As nodoCoche

    Public Sub New()
        Me.coche = Nothing
        Me.siguiente = Nothing
    End Sub

    Public Sub New(coche As Coche, siguiente As nodoCoche)
        Me.coche = coche
        Me.siguiente = siguiente
    End Sub

    Public Sub New(matricula As String, marca As String, modelo As String, estado As String, precioDia As Integer, siguiente As nodoCoche)
        Me.coche = New Coche(matricula, marca, modelo, estado, precioDia)
        Me.siguiente = siguiente
    End Sub

    Public Sub setSig(n As nodoCoche)
        Me.siguiente = n
    End Sub

    Function getSig() As nodoCoche
        Return Me.siguiente
    End Function

    Function getCoche() As Coche
        Return Me.coche
    End Function
End Class