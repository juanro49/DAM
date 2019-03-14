Public Class Coche
    Private matricula, marca, modelo, estado As String
    Private precioDia As Integer

    Public Sub New(matricula As String, marca As String, modelo As String, estado As String, precioDia As Integer)
        Me.matricula = matricula
        Me.marca = marca
        Me.modelo = modelo
        Me.estado = estado
        Me.precioDia = precioDia
    End Sub

    Public Sub setMatricula(matri As String)
        Me.matricula = matri
    End Sub

    Function getMatricula() As String
        Return Me.matricula
    End Function

    Public Sub setMarca(mar As String)
        Me.marca = mar
    End Sub

    Function getMarca() As String
        Return Me.marca
    End Function

    Public Sub setModelo(modelo As String)
        Me.modelo = modelo
    End Sub

    Function getModelo() As String
        Return Me.modelo
    End Function

    Public Sub setEstado(est As String)
        Me.estado = est
    End Sub

    Function getEstado() As String
        Return Me.estado
    End Function

    Public Sub setPrecioDia(pre As Integer)
        Me.precioDia = pre
    End Sub

    Function getPrecioDia() As Integer
        Return Me.precioDia
    End Function
End Class
